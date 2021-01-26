package te.app.evidence.pages.settings.viewModels;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.AppHelper;
import io.reactivex.disposables.CompositeDisposable;

public class MyAccountSettingsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;

    @Inject
    public MyAccountSettingsViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void toRegisteredShop() {
        liveData.setValue(new Mutable(Constants.REGISTER_SHOPS));
    }

    public void toProfile() {
        liveData.setValue(new Mutable(Constants.PROFILE));
    }

    public void switchNearOrders() {
//        compositeDisposable.add(repository.updateProfile(new RegisterRequest(userData.getNear_orders() ? 0 : 1), null));
    }

    public void toTerms() {
        liveData.setValue(new Mutable(Constants.TERMS));
    }

    public void toAbout() {
        liveData.setValue(new Mutable(Constants.ABOUT));
    }

    public void toContact() {
        liveData.setValue(new Mutable(Constants.CONTACT));
    }

    public void toDocuments() {
        liveData.setValue(new Mutable(Constants.DELEGATE_DOCUMNET));
    }

    public void toRate(Context context) {
        AppHelper.rateApp(context);
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public AuthRepository getRepository() {
        return repository;
    }

}
