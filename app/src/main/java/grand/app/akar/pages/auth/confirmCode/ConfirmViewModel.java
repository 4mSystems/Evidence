package grand.app.akar.pages.auth.confirmCode;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.ConfirmCodeRequest;
import grand.app.akar.pages.auth.models.ForgetPasswordRequest;
import grand.app.akar.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;

public class ConfirmViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private ConfirmCodeRequest request;

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
            compositeDisposable.add(repository.confirmCode(request));
        }
    }

    public void resendCode() {
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
