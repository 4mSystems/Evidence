package te.app.evidence.pages.categories;

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

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentAddCategoryBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.models.AddCategoryResponse;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel;
import te.app.evidence.pages.users.models.AddUserResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;


public class AddCategoryFragment extends BaseFragment {

    private Context context;
    @Inject
    AddCategoriesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAddCategoryBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_category, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setCategoriesData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), CategoriesData.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.ADD_CATEGORY.equals(((Mutable) o).message)) {
                toastMessage(((AddCategoryResponse) mutable.object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(((AddCategoryResponse) mutable.object).getCategoriesData()), context);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCategoriesRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
