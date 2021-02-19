package te.app.evidence.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;


import java.util.ArrayList;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.settings.models.UserDocuments;
import te.app.evidence.repository.AuthRepository;
import te.app.evidence.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class DocumentsViewModel extends BaseViewModel {
    private ArrayList<FileObject> fileObjects;
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;
    private UserDocuments userDocuments;

    @Inject
    public DocumentsViewModel(AuthRepository repository) {
        userDocuments = new UserDocuments();
        this.repository = repository;
        fileObjects = new ArrayList<>();
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void userDocuments() {
        compositeDisposable.add(repository.getUserDocuments());
    }

    public void uploadDocs() {
        compositeDisposable.add(repository.updateProfile(null, getFileObjects()));
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public ArrayList<FileObject> getFileObjects() {
        return fileObjects;
    }

    public AuthRepository getRepository() {
        return repository;
    }

    @Bindable
    public UserDocuments getUserDocuments() {
        return userDocuments;
    }

    @Bindable
    public void setUserDocuments(UserDocuments userDocuments) {
        notifyChange(BR.userDocuments);
        this.userDocuments = userDocuments;
    }

    public void toBackImage() {
        liveData.setValue(new Mutable(Constants.back_car_image));
    }

    public void toFrontImage() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public void toInsuranceImage() {
        liveData.setValue(new Mutable(Constants.insurance_image));
    }

    public void toLicenseImage() {
        liveData.setValue(new Mutable(Constants.license_image));
    }

    public void toCivilImage() {
        liveData.setValue(new Mutable(Constants.civil_image));
    }

}
