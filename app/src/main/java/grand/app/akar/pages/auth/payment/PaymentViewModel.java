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

    @Inject
    public PaymentViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void register() {
        liveData.setValue(new Mutable(Constants.REGISTER));
    }

    public void forgetPassword() {
        liveData.setValue(new Mutable(Constants.FORGET_PASSWORD));
    }

    public void updatePayment() {
        repository.updatePayment();
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
