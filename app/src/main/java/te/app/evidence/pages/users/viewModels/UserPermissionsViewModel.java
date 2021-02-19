package te.app.evidence.pages.users.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.models.userPermissions.UserPermissionsData;
import te.app.evidence.repository.SystemUsersRepository;
import te.app.evidence.utils.resources.ResourceManager;

public class UserPermissionsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SystemUsersRepository usersRepository;
    UserPermissionsData userPermissionsData;

    @Inject
    public UserPermissionsViewModel(SystemUsersRepository usersRepository) {
        userPermissionsData = new UserPermissionsData();
        this.usersRepository = usersRepository;
        this.liveData = new MutableLiveData<>();
        usersRepository.setLiveData(liveData);
    }

    public void userPermissions() {
        compositeDisposable.add(usersRepository.userPermissions(getPassingObject().getId()));
    }

    public void changeStatus(String viewText) {

        if (viewText.equals(ResourceManager.getString(R.string.menuUsers))) {
            getUserPermissionsData().setUsers(getUserPermissionsData().getUsers().equals("yes") ? "no" : "yes");
        }
        if (viewText.equals(ResourceManager.getString(R.string.menuClients))) {
            getUserPermissionsData().setClients(getUserPermissionsData().getClients().equals("yes") ? "no" : "yes");
        }
        if (viewText.equals(ResourceManager.getString(R.string.add_case))) {
            getUserPermissionsData().setAddcases(getUserPermissionsData().getAddcases().equals("yes") ? "no" : "yes");
        }
        if (viewText.equals(ResourceManager.getString(R.string.search_case))) {
            getUserPermissionsData().setSearchCase(getUserPermissionsData().getSearchCase().equals("yes") ? "no" : "yes");
        }
        if (viewText.equals(ResourceManager.getString(R.string.menuMohdar))) {
            getUserPermissionsData().setMohdreen(getUserPermissionsData().getMohdreen().equals("yes") ? "no" : "yes");
        }
        if (viewText.equals(ResourceManager.getString(R.string.menuCat))) {
            getUserPermissionsData().setCategory(getUserPermissionsData().getCategory().equals("yes") ? "no" : "yes");
        }
        if (viewText.equals(ResourceManager.getString(R.string.daily_reports))) {
            getUserPermissionsData().setDailyReport(getUserPermissionsData().getDailyReport().equals("yes") ? "no" : "yes");
        }
        if (viewText.equals(ResourceManager.getString(R.string.monthly_reports))) {
            getUserPermissionsData().setMonthlyReport(getUserPermissionsData().getMonthlyReport().equals("yes") ? "no" : "yes");
        }
        setUserPermissionsData(getUserPermissionsData());
    }

    @Bindable
    public UserPermissionsData getUserPermissionsData() {
        return userPermissionsData;
    }

    @Bindable
    public void setUserPermissionsData(UserPermissionsData userPermissionsData) {
        notifyChange(BR.userPermissionsData);
        this.userPermissionsData = userPermissionsData;
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
