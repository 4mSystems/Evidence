package te.app.evidence.pages.auth.register;

import android.text.TextUtils;
import android.widget.CompoundButton;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.base.MyApplication;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.models.RegisterRequest;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;
import te.app.evidence.utils.session.UserHelper;
import te.app.evidence.utils.validation.Validate;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;
    ArrayList<FileObject> fileObject;
    boolean isTermsAccepted = false;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void register() {
        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getRequest().isValid()) {
            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                if (!TextUtils.isEmpty(getRequest().getUserImage())) {
                    if (isTermsAccepted) {
                        setMessage(Constants.SHOW_PROGRESS);
                        compositeDisposable.add(repository.register(request, getFileObject()));
                    } else
                        liveData.setValue(new Mutable(Constants.ERROR_TOAST,ResourceManager.getString(R.string.terms_warning)));
                } else
                    liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.image_required)));
            } else
                liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.password_not_match)));
        } else
            liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.empty_warning)));
    }

    public void imageSubmit(String action) {
        liveData.setValue(new Mutable(action));
    }

    public void onCheckedChange(CompoundButton button, boolean check) {
        isTermsAccepted = check;
    }

    public ArrayList<FileObject> getFileObject() {
        return fileObject;
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

    @Bindable
    public RegisterRequest getRequest() {
        return this.request == null ? this.request = new RegisterRequest() : this.request;
    }

}
