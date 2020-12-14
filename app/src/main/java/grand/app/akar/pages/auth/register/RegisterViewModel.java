package grand.app.akar.pages.auth.register;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.base.MyApplication;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.models.RegisterRequest;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.session.UserHelper;
import grand.app.akar.utils.validation.Validate;
import io.reactivex.disposables.CompositeDisposable;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    private List<FileObject> fileObject;
    String cpp;
    @Inject
    AuthRepository repository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private RegisterRequest request;
    private List<Cities> citiesList;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        citiesList = new ArrayList<>();
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
    }

    public void register() {
        getRequest().setFirebase_token(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getRequest().isValid()) {
            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword()))
                compositeDisposable.add(repository.register(request, fileObject));
            else
                liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void userType() {
        liveData.setValue(new Mutable(Constants.USER_TYPES));
    }

    public void cities() {
        liveData.setValue(new Mutable(Constants.SHOW_CITIES));
    }

    public void getCities() {
        compositeDisposable.add(repository.getCities());
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

    @Bindable
    public List<Cities> getCitiesList() {
        return citiesList;
    }

    @Bindable
    public void setCitiesList(List<Cities> citiesList) {
        notifyChange(BR.citiesList);
        this.citiesList = citiesList;
    }
}
