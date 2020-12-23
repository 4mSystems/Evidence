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
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentAkarLocationCitiesBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.viewModels.AdsViewModel;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.utils.Constants;

import static android.app.Activity.RESULT_OK;

public class AkarLocationsCitiesFragment extends BaseFragment {
    private Context context;
    @Inject
    AdsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAkarLocationCitiesBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_akar_location_cities, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.getCitiesAdapter().update(viewModel.getPassingObject().getObjectList());
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.SELECT)) {
                finishWithResult(viewModel.getCitiesAdapter().getCitiesList().get(viewModel.getCitiesAdapter().lastId));
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private void finishWithResult(Cities cities) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE, cities);
        intent.putExtra(Constants.BUNDLE, bundle);
        getActivity().setResult(RESULT_OK, intent);
        viewModel.goBack(context);
    }
}
