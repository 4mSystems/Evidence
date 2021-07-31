package te.app.evidence.pages.attachments;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.connection.FileObject;
import te.app.evidence.databinding.FragmentAttachmentsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.attachments.models.AttachmentsResponse;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.upload.FileOperations;


public class AttachmentsFragment extends BaseFragment {
    @Inject
    AttachmentsViewModel viewModel;
    FragmentAttachmentsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_attachments, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.attachments(1, true);
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CASE_ATTACHMENTS.equals(((Mutable) o).message)) {
                viewModel.setMainData(((AttachmentsResponse) mutable.object).getMainData());
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getAttachmentsAdapter().getAttachmentList().remove(viewModel.getAttachmentsAdapter().lastSelected);
                viewModel.getAttachmentsAdapter().notifyDataSetChanged();
            } else if (((Mutable) o).message.equals(Constants.SELECT)) {
                pickFile(Constants.RESULT_CODE);
            }
        });
        binding.rcAttachments.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getAttachmentsAdapter().getAttachmentList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.attachments((viewModel.getMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
        viewModel.getAttachmentsAdapter().actionLiveData.observe(requireActivity(), o -> {
            if (o.equals(Constants.DELETE))
                showDeleteDialog();

        });
    }


    private void showDeleteDialog() {
        Dialog deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> {
            deleteDialog.dismiss();
            viewModel.deleteAttachments();
        });
        deleteDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getAttachmentsRepository().setLiveData(viewModel.liveData);
    }
    public void showAlertDialogWithAutoDismiss(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder
                .setMessage(msg)
                .setCancelable(false)
                .setNegativeButton(getString(R.string.no), (dialog, which) -> {
                    viewModel.getFileObjects().clear();
                    dialog.cancel();
                })
                .setPositiveButton(getString(R.string.send), (dialog, id) -> {
                    viewModel.sendMessage();
                    dialog.cancel();
                });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObjects().add(fileObject);
            showAlertDialogWithAutoDismiss(getString(R.string.attachment_pick_mes));
        }
    }


}
