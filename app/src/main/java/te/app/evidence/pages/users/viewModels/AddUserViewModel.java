package te.app.evidence.pages.users.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.models.AddUserRequest;
import te.app.evidence.pages.users.models.SystemUserData;
import te.app.evidence.repository.SystemUsersRepository;
import te.app.evidence.utils.Constants;

public class AddUserViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SystemUsersRepository usersRepository;
    AddUserRequest addUserRequest;
    SystemUserData systemUserData;

    @Inject
    public AddUserViewModel(SystemUsersRepository usersRepository) {
        systemUserData = new SystemUserData();
        addUserRequest = new AddUserRequest();
        this.usersRepository = usersRepository;
        this.liveData = new MutableLiveData<>();
        usersRepository.setLiveData(liveData);
    }

    public void addNewUser() {
        if (getPassingObject().getObjectClass() != null) {
            if (getAddUserRequest().isUpdateValid()) {
                compositeDisposable.add(usersRepository.editUser(getAddUserRequest()));
            }
        } else {
            if (getAddUserRequest().isValid()) {
                compositeDisposable.add(usersRepository.addNewUser(getAddUserRequest()));
            }
        }
    }

    public void getCategories() {
        compositeDisposable.add(usersRepository.getCategories());
    }

    @Bindable
    public SystemUserData getSystemUserData() {
        return systemUserData;
    }

    @Bindable
    public void setSystemUserData(SystemUserData systemUserData) {
        if (systemUserData != null) {
            getAddUserRequest().setAddress(systemUserData.getAddress());
            getAddUserRequest().setEmail(systemUserData.getEmail());
            getAddUserRequest().setName(systemUserData.getName());
            getAddUserRequest().setPhone(systemUserData.getPhone());
            getAddUserRequest().setType(systemUserData.getType());
            getAddUserRequest().setId(String.valueOf(systemUserData.getId()));
        }
        notifyChange(BR.systemUserData);
        this.systemUserData = systemUserData;
    }

    public void showCategories() {
        liveData.setValue(new Mutable(Constants.SHOW_CATEGORIES));
    }

    public void showUserType() {
        liveData.setValue(new Mutable(Constants.SHOW_TYPE));
    }

    public AddUserRequest getAddUserRequest() {
        return addUserRequest;
    }

    public SystemUsersRepository getUsersRepository() {
        return usersRepository;
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

}
