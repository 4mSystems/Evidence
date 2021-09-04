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
import te.app.evidence.pages.cases.CasesFragment;
import te.app.evidence.pages.home.viewModels.HomeViewModel;
import te.app.evidence.pages.mohdrs.BailiffsFragment;
import te.app.evidence.pages.places.PlacesFragment;
import te.app.evidence.pages.services.ServicesFragment;
import te.app.evidence.pages.sessions.models.CaseSessionsResponse;
import te.app.evidence.pages.users.UsersFragment;
import te.app.evidence.utils.Constants;
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
        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarCancel.setVisibility(View.GONE);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), o -> {
            handleActions(o);
            if (Constants.HOME.equals(o.message)) {
                MovementHelper.startActivityMain(requireActivity());
            } else if (Constants.SERVICES.equals(o.message)) {
                MovementHelper.startActivity(requireActivity(), ServicesFragment.class.getName(), ResourceManager.getString(R.string.services), null);
            } else if (Constants.LOCATIONS.equals(o.message)) {
                MovementHelper.startActivity(requireActivity(), PlacesFragment.class.getName(), ResourceManager.getString(R.string.location), null);
            } else if (Constants.PREV_SESSIONS.equals(o.message)) {
                viewModel.setPreSessionMainData(((CaseSessionsResponse) o.object).getSessionMainData());
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }

}
