package grand.app.akar.pages.myAds;

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

import grand.app.akar.BR;
import grand.app.akar.R;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentCurrentAdsBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.pages.myAds.viewModels.MyAdsViewModel;
import grand.app.akar.utils.Constants;

public class CurrentAdsFragment extends BaseFragment {

    private Context context;
    @Inject
    MyAdsViewModel viewModel;
    int pageType;

    public CurrentAdsFragment(int pageType) {
        this.pageType = pageType;
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCurrentAdsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_current_ads, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.MY_LISTING)) {
                viewModel.getMyAdsAdapter().update(((HomeResponse) mutable.object).getHomeDataList());
                viewModel.notifyChange(BR.myAdsAdapter);
            } else if (mutable.message.equals(Constants.REMOVE_AD)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getMyAdsAdapter().getHomeDataList().remove(viewModel.getMyAdsAdapter().lastPosition);
                viewModel.getMyAdsAdapter().notifyItemRemoved(viewModel.getMyAdsAdapter().lastPosition);
            }
        });
        viewModel.getMyAdsAdapter().getLiveDataAdapter().observe((LifecycleOwner) context, integer -> viewModel.removeAd(integer));
    }

    @Override
    public void onResume() {
        super.onResume();
        ((BaseActivity) context).enableRefresh(false);
        if (viewModel.getMyAdsAdapter().getItemCount() == 0) {
            if (pageType == 0)
                viewModel.myListing(0);
            else
                viewModel.myPremiumListing(0);
        }
        if (Constants.DATA_CHANGED ){
            Constants.DATA_CHANGED = false;
            if (pageType == 0)
                viewModel.myListing(0);
            else
                viewModel.myPremiumListing(0);
        }
        viewModel.getAdsRepository().setLiveData(viewModel.liveData);
    }


    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
