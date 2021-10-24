package te.app.evidence.pages.auth.login;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

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

    @Inject
    public LoginViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        loginRequest = new LoginRequest();
    }

    public void login() {
        getLoginRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getLoginRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            repository.login(loginRequest);
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void actions(String action) {
        liveData.setValue(new Mutable(action));
    }

    public LoginRequest getLoginRequest() {
        return loginRequest;
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


}
