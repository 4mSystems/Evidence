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

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentAddClientBinding;
import te.app.evidence.databinding.FragmentAddUserBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.categories.models.CategoriesResponse;
import te.app.evidence.pages.clients.models.AddClientResponse;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.viewModels.AddClientViewModel;
import te.app.evidence.pages.users.viewModels.AddUserViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.PopUp.PopUpMenuHelper;
import te.app.evidence.utils.helper.MovementHelper;


public class AddClientFragment extends BaseFragment {

    private Context context;
    @Inject
    AddClientViewModel viewModel;
    FragmentAddClientBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_client, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setClients(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), Clients.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CATEGORIES.equals(((Mutable) o).message)) {
                viewModel.setCategoriesDataList(((CategoriesResponse) mutable.object).getCategoriesDataList());
            } else if (Constants.SHOW_CATEGORIES.equals(((Mutable) o).message)) {
                showCategories();
            } else if (Constants.SHOW_CLIENT_TYPE.equals(((Mutable) o).message)) {
                showClientsType();
            } else if (Constants.ADD_CLIENTS.equals(((Mutable) o).message)) {
                toastMessage(((AddClientResponse) mutable.object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(((AddClientResponse) mutable.object).getClients()), context);
            }
        });
    }

    private void showCategories() {
        PopUpMenuHelper.showCategoriesPopUp(context, binding.catName, viewModel.getCategoriesDataList()).
                setOnMenuItemClickListener(item -> {
                    binding.catName.setText(viewModel.getCategoriesDataList().get(item.getItemId()).getName());
                    viewModel.getAddClientRequest().setCat_id(String.valueOf(viewModel.getCategoriesDataList().get(item.getItemId()).getId()));
                    return false;
                });
    }

    private void showClientsType() {
        List<String> typeList = new ArrayList<>();
        typeList.add(getString(R.string.client_add));
        typeList.add(getString(R.string.khesm));
        PopUpMenuHelper.showPopUp(context, binding.clientType, typeList).
                setOnMenuItemClickListener(item -> {
                    binding.clientType.setText(typeList.get(item.getItemId()));
                    viewModel.getAddClientRequest().setType(String.valueOf(typeList.get(item.getItemId())));
                    return false;
                });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getClientsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
