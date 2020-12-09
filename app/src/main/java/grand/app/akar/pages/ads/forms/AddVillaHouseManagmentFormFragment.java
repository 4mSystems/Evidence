package grand.app.akar.pages.ads.forms;

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

import grand.app.akar.R;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentAddVillaHouseFormBinding;
import grand.app.akar.databinding.FragmentAddWarehouseFormBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel;
import grand.app.akar.pages.settings.models.AboutResponse;
import grand.app.akar.utils.Constants;

public class AddVillaHouseManagmentFormFragment extends BaseFragment {
    private Context context;
    @Inject
    AddVillaHouseViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAddVillaHouseFormBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_villa_house_form, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.ABOUT)) {
                viewModel.setAboutData(((AboutResponse) ((Mutable) o).object).getAboutData());
            }
        });
        getActivityBase().connectionMutableLiveData.observe(((LifecycleOwner) context), isConnected -> {
            if (isConnected)
                viewModel.getAbout();
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

}
