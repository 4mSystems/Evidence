package grand.app.akar.pages.ads;

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

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentCategoriesBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.pages.ads.viewModels.CategoriesViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;

public class CategoriesFragment extends BaseFragment {
    private Context context;
    @Inject
    CategoriesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCategoriesBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_categories, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setCreateAdRequest(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), CreateAdRequest.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.ADD_FORM)) {
                viewModel.getCreateAdRequest().setCategories_id(viewModel.getCategoriesAdapter().getCategoriesDataList().get(viewModel.getCategoriesAdapter().lastId).getId());
                viewModel.getCreateAdRequest().setType(viewModel.getCreateAdRequest().getCategories_id() - 1);
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getCreateAdRequest()), viewModel.getCategoriesAdapter().getCategoriesDataList().get(viewModel.getCategoriesAdapter().lastId).getName(), viewModel.getCategoriesAdapter().getCategoriesDataList().get(viewModel.getCategoriesAdapter().lastId).getFormPage(), null);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        ((BaseActivity) context).enableRefresh(false);
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                viewModel.goBack(context);
            }
        }
    }
}
