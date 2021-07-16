package te.app.evidence.pages.mohdrs;

import static android.app.Activity.RESULT_OK;

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
import te.app.evidence.databinding.FragmentBailiffsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.mohdrs.models.ReportersData;
import te.app.evidence.pages.mohdrs.models.ReportersResponse;
import te.app.evidence.pages.mohdrs.models.ChangeStatusResponse;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


public class BailiffsFragment extends BaseFragment {
    @Inject
    BailiffsViewModel viewModel;
    Dialog deleteDialog;
    FragmentBailiffsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bailiffs, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getMohdareen(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.GET_MOHDAREEN.equals(((Mutable) o).message)) {
                viewModel.setMainData(((ReportersResponse) mutable.object).getMainData());
            } else if (Constants.CHANGE_STATUS.equals(((Mutable) o).message)) {
                toastMessage(((ChangeStatusResponse) mutable.object).mMessage);
                viewModel.getBailiffsAdapter().getBailiffsDataList().get(viewModel.getBailiffsAdapter().lastSelected).setStatus(((ChangeStatusResponse) mutable.object).getStatus());
                viewModel.getBailiffsAdapter().notifyItemChanged(viewModel.getBailiffsAdapter().lastSelected);
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getBailiffsAdapter().getBailiffsDataList().remove(viewModel.getBailiffsAdapter().lastSelected);
                viewModel.getBailiffsAdapter().notifyItemRangeChanged(viewModel.getBailiffsAdapter().lastSelected, viewModel.getBailiffsAdapter().getItemCount());
                deleteDialog.dismiss();
            } else if (Constants.ADD_MOHDR.equals(((Mutable) o).message)) {
                viewModel.getBailiffsAdapter().lastSelected = -1;
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), getString(R.string.add_new_mohdr), AddBailiffsFragment.class.getName(), null);
            }
        });
        viewModel.getBailiffsAdapter().actionLiveData.observe(requireActivity(), o -> {
            if (o.equals(Constants.CHANGE_STATUS))
                viewModel.changeStatus();
            else if (o.equals(Constants.DELETE))
                showDeleteDialog();

        });
        binding.rcMohdrs.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getBailiffsAdapter().getBailiffsDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.getMohdareen((viewModel.getMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> viewModel.deleteMohdr());
        deleteDialog.show();
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    if (viewModel.getBailiffsAdapter().lastSelected == -1) {
                        viewModel.getBailiffsAdapter().getBailiffsDataList().add(0, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), ReportersData.class));
                        viewModel.getBailiffsAdapter().notifyDataSetChanged();
                    } else {
                        viewModel.getBailiffsAdapter().getBailiffsDataList().set(viewModel.getBailiffsAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), ReportersData.class));
                        viewModel.getBailiffsAdapter().notifyItemChanged(viewModel.getBailiffsAdapter().lastSelected);
                        binding.rcMohdrs.scrollToPosition(viewModel.getBailiffsAdapter().lastSelected);
                    }
                }
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
    }

}
