package grand.app.akar.pages.adDetails;

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

import grand.app.akar.BR;
import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentAdDetailsBinding;
import grand.app.akar.databinding.FragmentContactFavoritesBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.adDetails.models.AdDetailsResponse;
import grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.pages.favorites.viewModels.MyFavoritesViewModel;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.utils.Constants;


public class AdDetailsFragment extends BaseFragment {

    private Context context;
    @Inject
    AdDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAdDetailsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ad_details, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setHomeData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), HomeData.class));
            viewModel.adDetails();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.GET_AD_DETAILS)) {
                viewModel.setAdDetailsData((((AdDetailsResponse) mutable.object).getData()));
            } else if (mutable.message.equals(Constants.REMOVE_ADD_FAVORITE)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getAdsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


}
