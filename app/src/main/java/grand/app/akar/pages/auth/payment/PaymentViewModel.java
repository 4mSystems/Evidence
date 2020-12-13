package grand.app.akar.pages.auth.payment;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.LoginRequest;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class PaymentViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private LoginRequest loginRequest;
    private int loginStatus = View.VISIBLE;
    String cpp;

    @Inject
    public PaymentViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        loginRequest = new LoginRequest();
    }

    public void register() {
        liveData.setValue(new Mutable(Constants.REGISTER));
    }

    public void forgetPassword() {
        liveData.setValue(new Mutable(Constants.FORGET_PASSWORD));
    }

    public void loginPhone() {
        if (getLoginRequest().isValid()) {
            if (!getLoginRequest().getPhone().contains(cpp)) {
                getLoginRequest().setPhone(cpp + getLoginRequest().getPhone());
            }
            repository.loginPhone(loginRequest);
        }
    }

    public void toRegister() {
        liveData.setValue(new Mutable(Constants.REGISTER));
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

    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

    @Bindable
    public int getLoginStatus() {
        return loginStatus;
    }

    @Bindable
    public void setLoginStatus(int loginStatus) {
        notifyChange(BR.loginStatus);
        this.loginStatus = loginStatus;
    }
}
