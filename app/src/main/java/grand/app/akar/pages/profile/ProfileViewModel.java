package grand.app.akar.pages.profile;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.RegisterRequest;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.validation.Validate;
import io.reactivex.disposables.CompositeDisposable;

public class ProfileViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    private ArrayList<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private RegisterRequest request;

    @Inject
    public ProfileViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
    }

    public void updateProfile() {
        notifyChange();
        if(getRequest().validate()) {
            if (getFileObject().size() > 0) {
                compositeDisposable.add(repository.updateProfile(null, getFileObject()));
            } else if (getRequest().isPasswordsValid())
                if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                    compositeDisposable.add(repository.updateProfile(request, getFileObject()));
                } else {
                    liveData.setValue(new Mutable(Constants.ERROR_TOAST));
                }
        }

    }

    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public RegisterRequest getRequest() {
        return request;
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

    public ArrayList<FileObject> getFileObject() {
        return fileObject;
    }
}
