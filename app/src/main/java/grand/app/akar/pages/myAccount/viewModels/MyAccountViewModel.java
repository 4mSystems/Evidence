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

    public void toMyPoints() {
        liveData.setValue(new Mutable(Constants.MY_POINTS));
    }

    public void toLogout() {
        liveData.setValue(new Mutable(Constants.LOGOUT));
    }

    public void toMyOrders() {
        liveData.setValue(new Mutable(Constants.MY_ORDERS));
    }

    public void toAbout() {
        liveData.setValue(new Mutable(Constants.ABOUT));
    }

    public void toReviews() {
        liveData.setValue(new Mutable(Constants.CLIENTS_REVIEWS));
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
