package te.app.evidence.pages.users.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.models.AddUserRequest;
import te.app.evidence.pages.users.models.SystemUserData;
import te.app.evidence.repository.SystemUsersRepository;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;

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
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(usersRepository.editUser(getAddUserRequest()));
            }
        } else {
            if (userData.getUserData().getType().equals("User"))
                getAddUserRequest().setCat_id(userData.getUserData().getCatId());
            if (getAddUserRequest().isValid()) {
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(usersRepository.addNewUser(getAddUserRequest()));
            }
        }
    }

    public void getCategories() {
        if (userData.getUserData().getType().equals("admin"))
            compositeDisposable.add(usersRepository.getCategories());
    }

    @Bindable
    public void setSystemUserData(SystemUserData systemUserData) {
        if (systemUserData != null) {
            getAddUserRequest().setAddress(systemUserData.getAddress());
            getAddUserRequest().setEmail(systemUserData.getEmail());
            getAddUserRequest().setName(systemUserData.getName());
            getAddUserRequest().setPhone(systemUserData.getPhone());
            getAddUserRequest().setType(systemUserData.getType().equals(ResourceManager.getString(R.string.admin)) ? "admin" : "User");
            getAddUserRequest().setId(String.valueOf(systemUserData.getId()));
            getAddUserRequest().setCat_id(String.valueOf(systemUserData.getCat_id()));
            getAddUserRequest().setCatName(String.valueOf(systemUserData.getCategoriesData().getName()));
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
