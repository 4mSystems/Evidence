package te.app.evidence.pages.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import javax.inject.Inject;

import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentMainHomeBinding;
import te.app.evidence.pages.home.viewModels.HomeViewModel;
import te.app.evidence.pages.places.PlacesFragment;
import te.app.evidence.pages.services.ServicesFragment;
import te.app.evidence.pages.sessions.models.CaseSessionsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
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
        return binding.getRoot();
    }
}
