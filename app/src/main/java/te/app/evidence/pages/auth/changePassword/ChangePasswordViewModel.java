package te.app.evidence.pages.auth.changePassword;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;
import te.app.evidence.utils.validation.Validate;

public class ChangePasswordViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ChangePasswordRequest request;

    @Inject
    public ChangePasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void submit() {
        if (getPassingObject() != null && getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_FORGET) {
            if (request.isPasswordsValid()) {
                changePassword();
            }
        } else {
            if (request.updateValid()) {
                changePassword();
            }
        }
    }

    private void changePassword() {
        if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.changePassword(getRequest()));
        } else
            liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.password_not_match)));
    }

    @Bindable
    public ChangePasswordRequest getRequest() {
        return this.request == null ? this.request = new ChangePasswordRequest() : this.request;
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
