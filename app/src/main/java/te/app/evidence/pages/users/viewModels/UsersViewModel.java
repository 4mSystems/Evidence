package te.app.evidence.pages.users.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.adapters.UsersAdapter;
import te.app.evidence.pages.users.models.UsersMainData;
import te.app.evidence.repository.SystemUsersRepository;
import te.app.evidence.utils.Constants;

public class UsersViewModel extends BaseViewModel {
    UsersAdapter usersAdapter;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SystemUsersRepository usersRepository;
    UsersMainData usersMainData;

    @Inject
    public UsersViewModel(SystemUsersRepository usersRepository) {
        usersMainData = new UsersMainData();
        this.usersRepository = usersRepository;
        this.liveData = new MutableLiveData<>();
        usersRepository.setLiveData(liveData);
    }

    public void systemUsers(int page, boolean showProgress) {
        compositeDisposable.add(usersRepository.getUsers(page,showProgress));
    }

    public void toNewUser() {
        liveData.setValue(new Mutable(Constants.ADD_USER));
    }

    public void deleteUser() {
        compositeDisposable.add(usersRepository.deleteUser(getUsersAdapter().getSystemUserDataList().get(getUsersAdapter().lastSelected).getId()));
    }

    @Bindable
    public UsersAdapter getUsersAdapter() {
        return this.usersAdapter == null ? this.usersAdapter = new UsersAdapter() : this.usersAdapter;
    }

    @Bindable
    public UsersMainData getUsersMainData() {
        return usersMainData;
    }

    @Bindable
    public void setUsersMainData(UsersMainData usersMainData) {
        if (getUsersAdapter().getSystemUserDataList().size() > 0) {
            getUsersAdapter().loadMore(usersMainData.getSystemUserDataList());
        } else {
            getUsersAdapter().update(usersMainData.getSystemUserDataList());
            notifyChange(BR.usersAdapter);
        }
        searchProgressVisible.set(false);
        this.usersMainData = usersMainData;
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
