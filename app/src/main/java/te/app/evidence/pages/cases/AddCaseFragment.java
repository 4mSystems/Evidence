package te.app.evidence.pages.cases;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import te.app.evidence.databinding.FragmentAddCaseBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesResponse;
import te.app.evidence.pages.cases.viewModels.AddCaseViewModel;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.PopUp.PopUpMenuHelper;
import te.app.evidence.utils.helper.MovementHelper;

public class AddCaseFragment extends BaseFragment {

    private Context context;
    @Inject
    AddCaseViewModel viewModel;
    FragmentAddCaseBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_case, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getCasesClientsCategories();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CASE_CLIENTS_CATEGORIES.equals(((Mutable) o).message)) {
                viewModel.setCaseClientsCategoriesData(((CaseClientsCategoriesResponse) mutable.object).getData());
            } else if (Constants.CLIENTS.equals(((Mutable) o).message)) {
                if (viewModel.getCaseClientsCategoriesData().getClients().size() > 0)
                    MovementHelper.startActivityForResultWithBundle(context, new PassingObject(new ClientsResponse(viewModel.getCaseClientsCategoriesData().getClients())), getResources().getString(R.string.clients), SearchClientsFragment.class.getName(), Constants.CLIENTS_CODE);
            } else if (Constants.KHESM.equals(((Mutable) o).message)) {
                if (viewModel.getCaseClientsCategoriesData().getKhesm().size() > 0)
                    MovementHelper.startActivityForResultWithBundle(context, new PassingObject(Constants.KHESM_CODE, new ClientsResponse(viewModel.getCaseClientsCategoriesData().getKhesm())), getResources().getString(R.string.opponents), SearchClientsFragment.class.getName(), Constants.KHESM_CODE);
            } else if (Constants.CATEGORIES.equals(((Mutable) o).message)) {
                if (viewModel.getCaseClientsCategoriesData().getCategories().size() > 0)
                    showCategories();
            }
        });
    }

    private void showCategories() {
        PopUpMenuHelper.showCategoriesPopUp(context, binding.inputCat, viewModel.getCaseClientsCategoriesData().getCategories()).
                setOnMenuItemClickListener(item -> {
                    binding.inputCat.setText(viewModel.getCaseClientsCategoriesData().getCategories().get(item.getItemId()).getName());
                    viewModel.getAddCaseRequest().setTo_whome(viewModel.getCaseClientsCategoriesData().getCategories().get(item.getItemId()).getId());
                    return false;
                });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null) {
            Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
            ClientsResponse clientsResponse;
            if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                clientsResponse = new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), ClientsResponse.class);
                if (resultCode == Constants.CLIENTS_CODE) {
                    viewModel.getCaseClientsCategoriesData().getClients().clear();
                    viewModel.getCaseClientsCategoriesData().setClients(clientsResponse.getClientsList());
                    if (clientsResponse.getCounter() != 0) {
                        viewModel.getAddCaseRequest().setMokelText(getString(R.string.client_selected));
                        binding.inputClients.setText(getString(R.string.client_selected));
                    } else {
                        viewModel.getAddCaseRequest().setMokelText(null);
                        binding.inputClients.setText(getString(R.string.client_unselected));
                    }
                } else if (resultCode == Constants.KHESM_CODE) {
                    viewModel.getCaseClientsCategoriesData().getKhesm().clear();
                    viewModel.getCaseClientsCategoriesData().setKhesm(clientsResponse.getClientsList());
                    if (clientsResponse.getCounter() != 0) {
                        viewModel.getAddCaseRequest().setKhesmText(getString(R.string.client_selected));
                        binding.inputKhesm.setText(getString(R.string.khesm_selected));
                    } else {
                        viewModel.getAddCaseRequest().setKhesmText(null);
                        binding.inputKhesm.setText(getString(R.string.khesm_unselected));
                    }
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
