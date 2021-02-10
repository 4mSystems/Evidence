package te.app.evidence.pages.profile;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.models.RegisterRequest;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.utils.Constants;
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
//        request.setCity_id(String.valueOf(userData.getCityId()));
//        request.setEmail(userData.getEmail());
//        request.setName(userData.getName());
//        request.setPhone(userData.getPhone());
//        request.setType(String.valueOf(userData.getType()));
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
