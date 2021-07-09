package te.app.evidence.pages.cases;

import android.content.Context;
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

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentSearchClientsBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.viewModels.SearchClientsViewModel;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


public class SearchClientsFragment extends BaseFragment {

    private Context context;
    @Inject
    SearchClientsViewModel viewModel;
    FragmentSearchClientsBinding binding;
    int clientCounter;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search_clients, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setClientsResponse(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), ClientsResponse.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CONFIRM_CODE.equals(((Mutable) o).message)) {
                for (int i = 0; i < viewModel.getClientsAdapter().getClientsList().size(); i++) {
                    if (viewModel.getClientsAdapter().getClientsList().get(i).isChecked())
                        clientCounter++;
                }
                ClientsResponse clientsResponse = new ClientsResponse();
                clientsResponse.setClientsList(viewModel.getClientsAdapter().getClientsList());
                clientsResponse.setCounter(clientCounter);
                MovementHelper.finishWithResultWithRequestCode(new PassingObject(clientsResponse), context, baseActivity().getIntent().getExtras().getInt(Constants.REQUEST_RESULT) == Constants.KHESM_CODE ? Constants.KHESM_CODE : Constants.CLIENTS_CODE);
            }
        });
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
