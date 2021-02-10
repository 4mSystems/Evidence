package te.app.evidence.pages.auth.login;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.base.MyApplication;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.models.LoginRequest;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class LoginViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    LoginRequest loginRequest;
    private int loginStatus = View.VISIBLE;

    @Inject
    public LoginViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        loginRequest = new LoginRequest();
    }

    public void register() {
        liveData.setValue(new Mutable(Constants.REGISTER));
    }

    private static final String TAG = "LoginViewModel";

    public void forgetPassword() {
        liveData.setValue(new Mutable(Constants.FORGET_PASSWORD));
    }

    public void login() {
        getLoginRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getLoginRequest().isValid()) {
            repository.login(loginRequest);
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
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
