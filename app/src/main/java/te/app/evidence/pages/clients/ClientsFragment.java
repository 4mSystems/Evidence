package te.app.evidence.pages.clients;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentClientsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;
import te.app.evidence.utils.Constants;


public class ClientsFragment extends BaseFragment {

    private Context context;
    @Inject
    ClientsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentClientsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_clients, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.clients();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CLIENTS.equals(((Mutable) o).message)) {
                viewModel.getClientsAdapter().update(((ClientsResponse) mutable.object).getClientsList());
                viewModel.notifyChange(BR.clientsAdapter);
            }
        });
        ((MainActivity) context).getRefreshingLiveData().observe(((LifecycleOwner) context), aBoolean -> {
            viewModel.clients();
            ((MainActivity) context).stopRefresh(false);
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) context).enableRefresh(true);
        viewModel.getClientsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
