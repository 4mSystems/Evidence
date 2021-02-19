package te.app.evidence.pages.users.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.adapters.UsersAdapter;
import te.app.evidence.repository.SystemUsersRepository;
import te.app.evidence.utils.Constants;

public class UsersViewModel extends BaseViewModel {
    UsersAdapter usersAdapter;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SystemUsersRepository usersRepository;

    @Inject
    public UsersViewModel(SystemUsersRepository usersRepository) {
        this.usersRepository = usersRepository;
        this.liveData = new MutableLiveData<>();
        usersRepository.setLiveData(liveData);
    }

    public void systemUsers() {
        compositeDisposable.add(usersRepository.getUsers());
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
