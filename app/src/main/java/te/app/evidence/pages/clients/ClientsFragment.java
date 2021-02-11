package te.app.evidence.pages.clients;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.activity.MainActivity;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentClientsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class ClientsFragment extends BaseFragment {
    FragmentClientsBinding binding;
    private Context context;
    @Inject
    ClientsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_clients, container, false);
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
                Log.e("setEvent", "setEvent: " + viewModel.getClientsAdapter().getClientsList().size());
            } else if (Constants.ADD_CLIENTS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), getString(R.string.add_new_client), AddClientFragment.class.getName(), null);
            }
        });
        ((MainActivity) context).getRefreshingLiveData().observe(((LifecycleOwner) context), aBoolean -> {
            viewModel.clients();
            ((MainActivity) context).stopRefresh(false);
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    viewModel.getClientsAdapter().getClientsList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Clients.class));
                    viewModel.getClientsAdapter().notifyItemInserted(viewModel.getClientsAdapter().getClientsList().size() - 1);
                    binding.rcClients.scrollToPosition(viewModel.getClientsAdapter().getClientsList().size() - 1);

                }
            }
        }
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
