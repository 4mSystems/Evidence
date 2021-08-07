package te.app.evidence.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.auth.models.ChangePasswordRequest;
import te.app.evidence.pages.auth.models.ConfirmCodeRequest;
import te.app.evidence.pages.auth.models.ForgetPasswordRequest;
import te.app.evidence.pages.auth.models.LoginRequest;
import te.app.evidence.pages.auth.models.RegisterRequest;
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.pages.onBoard.models.BoardResponse;
import te.app.evidence.pages.users.models.AddUserRequest;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class AuthRepository extends BaseRepository {

    @Inject
    public ConnectionHelper connectionHelper;

    protected MutableLiveData<Mutable> liveData;

    @Inject
    public AuthRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }


    public Disposable getBoard() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BOARD, new Object(), BoardResponse.class,
                Constants.BOARD, true);
    }

    public Disposable login(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN, request, UsersResponse.class,
                Constants.LOGIN, false);
    }

    public Disposable register(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REGISTER, request, StatusMessage.class,
                Constants.REGISTER, false);
    }

    public Disposable confirmCode(ConfirmCodeRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONFIRM_CODE, request, UsersResponse.class,
                Constants.CONFIRM_CODE, true);
    }


    public Disposable updateProfile(AddUserRequest request, ArrayList<FileObject> fileObjects) {
        if (fileObjects == null) {
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_PROFILE, request, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        } else {
            return connectionHelper.requestApi(URLS.UPDATE_PROFILE, request, fileObjects, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        }

    }

    public Disposable forgetPassword(ForgetPasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.FORGET_PASSWORD, request, StatusMessage.class,
                Constants.FORGET_PASSWORD, true);
    }

    public Disposable changePassword(ChangePasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_PASSWORD, request, StatusMessage.class,
                Constants.CHANGE_PASSWORD, true);
    }

}