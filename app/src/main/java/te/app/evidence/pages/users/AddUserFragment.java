package te.app.evidence.pages.users;

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
import te.app.evidence.databinding.FragmentAddUserBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.models.CategoriesResponse;
import te.app.evidence.pages.users.models.AddUserResponse;
import te.app.evidence.pages.users.models.SystemUserData;
import te.app.evidence.pages.users.viewModels.AddUserViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.PopUp.PopUp;
import te.app.evidence.utils.PopUp.PopUpMenuHelper;
import te.app.evidence.utils.helper.MovementHelper;


public class AddUserFragment extends BaseFragment {
    FragmentAddUserBinding binding;
    private Context context;
    @Inject
    AddUserViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_user, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getCategories();
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setSystemUserData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), SystemUserData.class));
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
            } else if (Constants.SHOW_TYPE.equals(((Mutable) o).message)) {
                showClientsType();
            } else if (Constants.ADD_USER.equals(((Mutable) o).message)) {
                toastMessage(((AddUserResponse) mutable.object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(((AddUserResponse) mutable.object).getSystemUserData()), context);
            }
        });
    }

    private void showCategories() {
        PopUpMenuHelper.showCategoriesPopUp(context, binding.catName, viewModel.getCategoriesDataList()).
                setOnMenuItemClickListener(item -> {
                    binding.catName.setText(viewModel.getCategoriesDataList().get(item.getItemId()).getName());
                    viewModel.getAddUserRequest().setCat_id(String.valueOf(viewModel.getCategoriesDataList().get(item.getItemId()).getId()));
                    return false;
                });
    }

    private void showClientsType() {
        List<PopUp> typeList = new ArrayList<>();
        typeList.add(new PopUp(getString(R.string.admin), 1));
        typeList.add(new PopUp(getString(R.string.user), 2));
        PopUpMenuHelper.showPopUp(context, binding.userType, typeList).
                setOnMenuItemClickListener(item -> {
                    binding.userType.setText(typeList.get(item.getItemId()).getName());
                    viewModel.getAddUserRequest().setType(String.valueOf(typeList.get(item.getItemId()).getId()));
                    return false;
                });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getUsersRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
