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
import te.app.evidence.databinding.FragmentEditCaseBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesResponse;
import te.app.evidence.pages.cases.models.caseDetails.CaseDetails;
import te.app.evidence.pages.cases.models.cases.AddCaseResponse;
import te.app.evidence.pages.cases.viewModels.AddCaseViewModel;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.PopUp.PopUpMenuHelper;
import te.app.evidence.utils.helper.MovementHelper;

public class EditCaseFragment extends BaseFragment {

    private Context context;
    @Inject
    AddCaseViewModel viewModel;
    FragmentEditCaseBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_edit_case, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setCaseDetails(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), CaseDetails.class));
        }
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
            } else if (Constants.CATEGORIES.equals(((Mutable) o).message)) {
                if (viewModel.getCaseClientsCategoriesData().getCategories().size() > 0)
                    showCategories();
            } else if (Constants.EDIT_CASE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                //TODO Update case not working and want to make category return from backend
                MovementHelper.finishWithResult(new PassingObject(((AddCaseResponse) mutable.object).getData()), context, Constants.EDIT_CASE_REQUEST);
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
