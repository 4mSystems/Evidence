package grand.app.akar.pages.auth.changePassword;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.RegisterRequest;
import grand.app.akar.pages.auth.models.UserData;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.validation.Validate;
import io.reactivex.disposables.CompositeDisposable;

public class ChangePasswordViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private RegisterRequest request;
    private UserData userData;

    @Inject
    public ChangePasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
        userData = new UserData();
    }

    public void submit() {
        if (request.isPasswordsValid()) {
            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword()))
                compositeDisposable.add(repository.updateProfile(getRequest(), null));
            else
                liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
        }
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public RegisterRequest getRequest() {
        return request;
    }

    @Bindable
    public UserData getUserData() {
        return userData;
    }

    @Bindable
    public void setUserData(UserData userData) {
        getRequest().setCountry_id(userData.getCountryId());
        getRequest().setName(userData.getName());
        getRequest().setPhone(userData.getPhone());
        getRequest().setToken(userData.getToken());
        notifyChange(BR.userData);
        this.userData = userData;
    }
}
