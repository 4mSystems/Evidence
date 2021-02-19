package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.models.AddClientRequest;
import te.app.evidence.pages.clients.models.AddClientResponse;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.users.models.AddUserRequest;
import te.app.evidence.pages.users.models.AddUserResponse;
import te.app.evidence.pages.users.models.SystemUserResponse;
import te.app.evidence.pages.users.models.userPermissions.UserPermissionsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;

@Singleton
public class SystemUsersRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public SystemUsersRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getUsers() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.USERS, new Object(), SystemUserResponse.class,
                Constants.USERS, true);
    }

    public Disposable addNewUser(AddUserRequest addUserRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_USER, addUserRequest, AddUserResponse.class,
                Constants.ADD_USER, true);
    }

    public Disposable editUser(AddUserRequest addUserRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_USER, addUserRequest, AddUserResponse.class,
                Constants.ADD_USER, true);
    }

    public Disposable deleteUser(int userId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_USER + userId, new Object(), StatusMessage.class,
                Constants.DELETE_USER, true);
    }


    public Disposable userPermissions(int userId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.USER_PERMISSIONS + userId, new Object(), UserPermissionsResponse.class,
                Constants.USER_PERMISSIONS, true);
    }
}