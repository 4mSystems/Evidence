package grand.app.akar.pages.myAccount;

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

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.activity.BaseActivity;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.ParentActivity;
import grand.app.akar.databinding.FragmentMyAccountBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.myAccount.models.ProfileDataResponse;
import grand.app.akar.pages.myAccount.viewModels.MyAccountViewModel;
import grand.app.akar.pages.myAds.MyAdsMainFragment;
import grand.app.akar.pages.profile.ProfileFragment;
import grand.app.akar.pages.settings.AboutAppFragment;
import grand.app.akar.pages.settings.ContactUsFragment;
import grand.app.akar.pages.settings.TermsFragment;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.AppHelper;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;

public class MyAccountFragment extends BaseFragment {

    private Context context;
    @Inject
    MyAccountViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMyAccountBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_account, container, false);
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
            switch (mutable.message) {
                case Constants.ABOUT:
                    MovementHelper.startActivity(context, AboutAppFragment.class.getName(), null, null);
                    break;
                case Constants.PROFILE:
                    MovementHelper.startActivity(context, ProfileFragment.class.getName(), null, null);
                    break;
                case Constants.TERMS:
                    MovementHelper.startActivity(context, TermsFragment.class.getName(), null, null);
                    break;
                case Constants.CONTACT:
                    MovementHelper.startActivity(context, ContactUsFragment.class.getName(), getResources().getString(R.string.tv_account_contact), null);
                    break;
                case Constants.SHARE_BAR:
                    AppHelper.shareApp((ParentActivity) context);
                    break;
                case Constants.MY_ADS:
                    //0 => my listing , 1=> my-premium-listing
                    MovementHelper.startActivityWithBundle(context, new PassingObject(0), getResources().getString(R.string.my_ads), MyAdsMainFragment.class.getName(), null);
                    break;
                case Constants.MY_PREMIUM_ADS:
                    //0 => my listing , 1=> my-premium-listing
                    MovementHelper.startActivityWithBundle(context, new PassingObject(1), getResources().getString(R.string.my_fund_ads), MyAdsMainFragment.class.getName(), null);
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
        viewModel.userData = UserHelper.getInstance(context).getUserData();
        viewModel.notifyChange();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
