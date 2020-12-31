package grand.app.akar.pages.profile;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import grand.app.akar.BR;
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
    private int type;

    @Inject
    public ProfileViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
        request.setCity_id(String.valueOf(userData.getCityId()));
        request.setEmail(userData.getEmail());
        request.setName(userData.getName());
        request.setPhone(userData.getPhone());
        request.setType(String.valueOf(userData.getType()));
    }

    public void updateProfile() {
        if (getRequest().isUpdateValid()) {
            compositeDisposable.add(repository.updateProfile(request, getFileObject()));
        }

    }

    public void changeUserType(int type) {
        setType(type);
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

    @Bindable
    public int getType() {
        return type;
    }

    @Bindable
    public void setType(int type) {
        notifyChange(BR.type);
        this.type = type;
    }

    public ArrayList<FileObject> getFileObject() {
        return fileObject;
    }
}
