package grand.app.akar.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.auth.models.ChangePasswordRequest;
import grand.app.akar.pages.auth.models.ConfirmCodeRequest;
import grand.app.akar.pages.auth.models.ForgetPasswordRequest;
import grand.app.akar.pages.auth.models.LoginRequest;
import grand.app.akar.pages.auth.models.RegisterRequest;
import grand.app.akar.pages.auth.models.UsersResponse;
import grand.app.akar.pages.auth.models.cities.CitiesResponse;
import grand.app.akar.pages.onBoard.models.BoardResponse;
import grand.app.akar.pages.settings.models.UserDocumentsResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.URLS;
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

    public Disposable getCities() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CITIES, new Object(), CitiesResponse.class,
                Constants.CITIES, true);
    }


    public Disposable getBoard() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BOARD, new Object(), BoardResponse.class,
                Constants.BOARD, true);
    }

    public Disposable login(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_PHONE, request, UsersResponse.class,
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

//    public Disposable updateToken(String token) {
//        return connectionHelper.requestApiBackground(Constants.POST_REQUEST, URLS.UPDATE_TOKEN, new TokenRequest(token));
//    }

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