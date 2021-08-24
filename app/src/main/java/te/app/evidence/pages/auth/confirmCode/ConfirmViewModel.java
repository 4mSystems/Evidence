package te.app.evidence.pages.auth.confirmCode;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.models.ConfirmCodeRequest;
import te.app.evidence.pages.auth.models.ForgetPasswordRequest;
import te.app.evidence.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.utils.Constants;

public class ConfirmViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ConfirmCodeRequest request;

    @Inject
    public ConfirmViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new ConfirmCodeRequest();
    }

    public void confirmCode() {
        getRequest().setPhone(getPassingObject().getObject());
        if (request.isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            if (getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_REGISTER) {
                compositeDisposable.add(repository.confirmAccount(request));
            } else
                compositeDisposable.add(repository.confirmCode(request));
        }
    }

    public void resendCode() {
        setMessage(Constants.SHOW_PROGRESS);
        compositeDisposable.add(repository.forgetPassword(new ForgetPasswordRequest(getPassingObject().getObject())));
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

    public ConfirmCodeRequest getRequest() {
        return request;
    }
}
