package te.app.evidence.pages.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import javax.inject.Inject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentMainHomeBinding;
import te.app.evidence.databinding.SettingsBottomSheetBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.home.viewModels.HomeViewModel;
import te.app.evidence.pages.settings.ContactUsFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import te.app.evidence.utils.helper.AppHelper;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;


public class MainHomeFragment extends BaseFragment {
    @Inject
    HomeViewModel viewModel;
    FragmentMainHomeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_home, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.setupHomeMainAdapter();
        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarCancel.setVisibility(View.GONE);
        setEvent();

        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), o -> {
            handleActions(o);
            switch (((Mutable) o).message) {
                case Constants.ABOUT:
                    MovementHelper.openCustomTabs(requireActivity(), URLS.ABOUT_URL, getString(R.string.about));
                    break;
                case Constants.PRIVACY:
                    MovementHelper.openCustomTabs(requireActivity(), URLS.POLICY_URL, getString(R.string.privacy));
                    break;
                case Constants.TERMS:
                    MovementHelper.openCustomTabs(requireActivity(), URLS.TERMS_URL, getString(R.string.terms));
                    break;
                case Constants.CONTACT_US:
                    MovementHelper.startActivity(requireActivity(), ContactUsFragment.class.getName(), ResourceManager.getString(R.string.tv_account_contact), null);
                    break;
                case Constants.SUPPORT:
                    MovementHelper.startWebActivityForResultWithBundle(requireActivity(), URLS.SUPPORT, getString(R.string.customer_support));
                    break;
                case Constants.SHARE_BAR:
                    AppHelper.shareApp(requireActivity());
                    break;
                case Constants.RATE:
                    AppHelper.rateApp(requireActivity());
                    break;

            }
        });
        viewModel.getHomeMainAdapter().liveData.observeForever(o -> {
            SettingsBottomSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.settings_bottom_sheet, null, false);
            BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
            sheetDialog.setContentView(sortBinding.getRoot());
            sortBinding.setViewmodel(viewModel);
            sheetDialog.show();
        });
    }
}
