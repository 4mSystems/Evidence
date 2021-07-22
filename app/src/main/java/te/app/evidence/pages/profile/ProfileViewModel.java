package te.app.evidence.pages.profile;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.models.AddUserRequest;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ProfileViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    ArrayList<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    AddUserRequest addUserRequest;
    private int type;

    @Inject
    public ProfileViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        addUserRequest = new AddUserRequest();
        getAddUserRequest().setName(userData.getUserData().getName());
        getAddUserRequest().setEmail(userData.getUserData().getEmail());
        getAddUserRequest().setPhone(userData.getUserData().getPhone());
    }

    public void updateProfile() {
        if (getAddUserRequest().isUpdateProfileValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.updateProfile(getAddUserRequest(), getFileObject()));
        }

    }

    public void changePassword() {
        liveData.setValue(new Mutable(Constants.CHANGE_PASSWORD));
    }

    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public AddUserRequest getAddUserRequest() {
        return addUserRequest;
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
