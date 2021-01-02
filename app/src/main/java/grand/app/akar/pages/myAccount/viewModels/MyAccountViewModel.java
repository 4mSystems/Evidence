package grand.app.akar.pages.myAccount.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.myAccount.models.ProfileData;
import grand.app.akar.repository.SettingsRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class MyAccountViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    private ProfileData profileData;

    @Inject
    public MyAccountViewModel(SettingsRepository marketRepository) {
        profileData = new ProfileData();
        this.repository = marketRepository;
        this.liveData = new MutableLiveData<>();
        marketRepository.setLiveData(liveData);
    }

    public void toTerms() {
        liveData.setValue(new Mutable(Constants.TERMS));
    }

    public void toSettings() {
        liveData.setValue(new Mutable(Constants.CONTACT));
    }

    public void toShare() {
        liveData.setValue(new Mutable(Constants.SHARE_BAR));
    }

    public void toLogout() {
        liveData.setValue(new Mutable(Constants.LOGOUT));
    }

    public void toMyAds() {
        liveData.setValue(new Mutable(Constants.MY_ADS));
    }

    public void toMyPremiumAds() {
        liveData.setValue(new Mutable(Constants.MY_PREMIUM_ADS));
    }

    public void toAbout() {
        liveData.setValue(new Mutable(Constants.ABOUT));
    }

    public void rateApp() {
        liveData.setValue(new Mutable(Constants.RATE_APP));
    }

    public void toProfile() {
        liveData.setValue(new Mutable(Constants.PROFILE));
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Bindable
    public ProfileData getProfileData() {
        return profileData;
    }

    @Bindable
    public void setProfileData(ProfileData profileData) {
        notifyChange(BR.profileData);
        this.profileData = profileData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public SettingsRepository getRepository() {
        return repository;
    }
}
