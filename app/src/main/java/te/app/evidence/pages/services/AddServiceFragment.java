package te.app.evidence.pages.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentAddServiceBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.services.viewModels.ServicesViewModel;

public class AddServiceFragment extends BaseFragment {
    FragmentAddServiceBinding binding;
    @Inject
    ServicesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_service, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
//        viewModel.getAgents();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
//            if (((Mutable) o).message.equals(Constants.AGENTS)) {
//                viewModel.getAgentsAdapter().update(((AgentsResponse) mutable.object).getData());
//                viewModel.notifyChange(BR.agentsAdapter);
//            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
