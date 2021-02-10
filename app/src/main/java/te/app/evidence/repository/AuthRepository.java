package te.app.evidence.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

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
import te.app.evidence.pages.settings.models.UserDocumentsResponse;
import te.app.evidence.pages.settings.models.settings.SettingsResponse;
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

    public Disposable getSettings() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SETTINGS, new Object(), SettingsResponse.class,
                Constants.SETTINGS, false);
    }

    public Disposable login(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN, request, UsersResponse.class,
                Constants.LOGIN, true);
    }

    public Disposable register(RegisterRequest request, List<FileObject> fileObjects) {
        if (fileObjects != null && fileObjects.size() > 0)
            return connectionHelper.requestApi(URLS.REGISTER, request, fileObjects, StatusMessage.class,
                    Constants.REGISTER, true);
        else
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REGISTER, request, StatusMessage.class,
                    Constants.REGISTER, true);
    }

    public Disposable confirmCode(ConfirmCodeRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONFIRM_CODE, request, UsersResponse.class,
                Constants.CONFIRM_CODE, true);
    }

    public Disposable updatePayment() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.UPDATE_PAYMENT, new Object(), UsersResponse.class,
                Constants.UPDATE_PAYMENT, true);
    }


    public Disposable updateProfile(RegisterRequest request, ArrayList<FileObject> fileObjects) {
        if (fileObjects == null) {
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_PROFILE, request, UsersResponse.class,
                    Constants.UPDATE_PROFILE, true);
        } else {
            return connectionHelper.requestApi(URLS.UPDATE_PROFILE, request, fileObjects, UsersResponse.class,
                    Constants.UPDATE_PROFILE, true);
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

    public Disposable getUserDocuments() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_USER_DOCUMENTS, new Object(), UserDocumentsResponse.class,
                Constants.GET_USER_DOCUMENTS, true);
    }

}