package grand.app.akar.pages.auth.register;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.base.MyApplication;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.RegisterRequest;
import grand.app.akar.pages.auth.models.carNational.CarsNationals;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.resources.ResourceManager;
import grand.app.akar.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    private List<FileObject> fileObject;
    String cpp;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private RegisterRequest request;
    private CarsNationals carsNationals;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        carsNationals = new CarsNationals();
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
    }

    public void register() {
        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getRequest().isValid()) {
            if (fileObject != null) {
                if (!getRequest().getPhone().contains(cpp)) {
                    getRequest().setPhone(cpp + getRequest().getPhone());
                }
                compositeDisposable.add(repository.register(request, fileObject));
            } else {
                liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.select_image_profile)));
            }
        }
    }



    public void carTypes() {
        compositeDisposable.add(repository.getCarsNationals());
    }

    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
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


    public RegisterRequest getRequest() {
        return request;
    }

    public List<FileObject> getFileObject() {
        return fileObject;
    }

    public CarsNationals getCarsNationals() {
        return carsNationals;
    }

    @Bindable
    public void setCarsNationals(CarsNationals carsNationals) {
        notifyChange(BR.carsNationals);
        this.carsNationals = carsNationals;
    }
}
