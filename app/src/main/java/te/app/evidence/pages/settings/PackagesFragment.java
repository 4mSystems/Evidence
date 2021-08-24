package te.app.evidence.pages.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.databinding.ExitLayoutBinding;
import te.app.evidence.databinding.FragmentPackagesBinding;
import te.app.evidence.databinding.PackageRenewDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.settings.models.Packages;
import te.app.evidence.pages.settings.models.PackagesResponse;
import te.app.evidence.pages.settings.viewModels.SettingsViewModel;
import te.app.evidence.utils.Constants;

public class PackagesFragment extends BaseFragment {
    FragmentPackagesBinding binding;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_packages, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getPackages();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.PACKAGES)) {
                viewModel.getPackagesAdapter().update(((PackagesResponse) ((Mutable) o).object).getPackagesList());
                viewModel.notifyChange(BR.packagesAdapter);
            } else if (((Mutable) o).message.equals(Constants.SUBSCRIBE)) {
                toastMessage(((StatusMessage) ((Mutable) o).object).mMessage);
                Constants.DATA_CHANGED = true;
                viewModel.goBack(requireActivity());
            }
        });
        viewModel.getPackagesAdapter().liveData.observe(requireActivity(), this::renewDialog);
    }

    private void renewDialog(Packages o) {
        Dialog dialog = new Dialog(requireActivity(), R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        PackageRenewDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(dialog.getContext()), R.layout.package_renew_dialog, null, false);
        dialog.setContentView(binding.getRoot());
        if (viewModel.userData.getUserData().getMy_points().equals(o.getRenew_points()))
            binding.points.setEnabled(true);
        binding.online.setOnClickListener(v -> {
            dialog.dismiss();

        });
        binding.points.setOnClickListener(v -> dialog.dismiss());
        dialog.setOnCancelListener(DialogInterface::dismiss);
        dialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
