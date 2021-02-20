package te.app.evidence.pages.mohdrs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentBailiffsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.mohdrs.models.ReportersResponse;
import te.app.evidence.pages.mohdrs.models.ChangeStatusResponse;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel;
import te.app.evidence.utils.Constants;


public class BailiffsFragment extends BaseFragment {

    private Context context;
    @Inject
    BailiffsViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentBailiffsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bailiffs, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getMohdareen();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.GET_MOHDAREEN.equals(((Mutable) o).message)) {
                viewModel.getBailiffsAdapter().update(((ReportersResponse) mutable.object).getBailiffsDataList());
                viewModel.notifyChange(BR.bailiffsAdapter);
            } else if (Constants.CHANGE_STATUS.equals(((Mutable) o).message)) {
                toastMessage(((ChangeStatusResponse) mutable.object).mMessage);
                viewModel.getBailiffsAdapter().getBailiffsDataList().get(viewModel.getBailiffsAdapter().lastSelected).setStatus(((ChangeStatusResponse) mutable.object).getStatus());
                viewModel.getBailiffsAdapter().notifyItemChanged(viewModel.getBailiffsAdapter().lastSelected);
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getBailiffsAdapter().getBailiffsDataList().remove(viewModel.getBailiffsAdapter().lastSelected);
                viewModel.getBailiffsAdapter().notifyItemRangeChanged(viewModel.getBailiffsAdapter().lastSelected, viewModel.getBailiffsAdapter().getItemCount());
                deleteDialog.dismiss();

            }
        });
        viewModel.getBailiffsAdapter().actionLiveData.observe((LifecycleOwner) context, o -> {
            if (o.equals(Constants.CHANGE_STATUS))
                viewModel.changeStatus();
            else if (o.equals(Constants.DELETE))
                showDeleteDialog();

        });
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
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
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
