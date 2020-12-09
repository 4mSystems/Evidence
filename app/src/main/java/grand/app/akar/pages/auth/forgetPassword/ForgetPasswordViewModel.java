package grand.app.akar.pages.auth.forgetPassword;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.ForgetPasswordRequest;
import grand.app.akar.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;

public class ForgetPasswordViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    String cpp;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private ForgetPasswordRequest request;

    @Inject
    public ForgetPasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new ForgetPasswordRequest();
    }

    public void sendCode() {
        if (getRequest().isValid()) {
            if (!getRequest().getPhone().contains(cpp)) {
                getRequest().setPhone(cpp + request.getPhone());
            }
            compositeDisposable.add(repository.forgetPassword(request));
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

    public ForgetPasswordRequest getRequest() {
        return request;
    }
}
