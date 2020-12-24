package grand.app.akar.pages.settings.viewModels;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.RegisterRequest;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.AppHelper;
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
