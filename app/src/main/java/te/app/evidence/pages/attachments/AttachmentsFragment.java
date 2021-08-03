package te.app.evidence.pages.attachments;

import static android.app.Activity.RESULT_OK;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import te.app.evidence.databinding.FragmentAttachmentsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.attachments.models.Attachment;
import te.app.evidence.pages.attachments.models.AttachmentsResponse;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


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
        onBackPressed();
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
            } else if (((Mutable) o).message.equals(Constants.ADD_ATTACH)) {
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(viewModel.getPassingObject().getId(), viewModel.getPassingObject().getObject()), getString(R.string.add_new_attach), AddAttachmentFragment.class.getName(), null);
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
        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(v -> MovementHelper.finishWithResult(new PassingObject(viewModel.getAttachmentsAdapter().getAttachmentList().size()), requireActivity(), Constants.ATTACH_REQUEST));

    }

    private void onBackPressed() {
        binding.getRoot().setFocusableInTouchMode(true);
        binding.getRoot().requestFocus();
        binding.getRoot().setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() != KeyEvent.ACTION_DOWN) {
                MovementHelper.finishWithResult(new PassingObject(viewModel.getAttachmentsAdapter().getAttachmentList().size()), requireActivity(), Constants.ATTACH_REQUEST);
                return true;
            }
            return false;
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

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    viewModel.getAttachmentsAdapter().getAttachmentList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Attachment.class));
                    viewModel.getAttachmentsAdapter().notifyItemInserted(viewModel.getAttachmentsAdapter().getAttachmentList().size() - 1);
                }
            }
        }
    }
}
