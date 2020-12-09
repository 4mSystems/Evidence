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
import grand.app.akar.pages.auth.models.carNational.CarsNationalResponse;
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

//    public Disposable getCountries() {
//        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COUNTRIES, new Object(), CountriesResponse.class,
//                Constants.COUNTRIES, true);
//    }
//
//    public Disposable getCities(int countryId) {
//        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CITIES + countryId, new Object(), CountriesResponse.class,
//                Constants.CITIES, true);
//    }

    public Disposable getCarsNationals() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CARS_NATIONALS, new Object(), CarsNationalResponse.class,
                Constants.CARS_NATIONALS, true);
    }

    public Disposable getBoard() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BOARD, new Object(), BoardResponse.class,
                Constants.BOARD, true);
    }

    public Disposable loginPhone(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_PHONE, request, StatusMessage.class,
                Constants.PHONE_VERIFIED, true);
    }

    public Disposable loginPassword(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_PASSWORD, request, UsersResponse.class,
                Constants.LOGIN, true);
    }

    public Disposable register(RegisterRequest request, List<FileObject> fileObjects) {
        return connectionHelper.requestApi(URLS.REGISTER, request, fileObjects, StatusMessage.class,
                Constants.REGISTER, true);
    }

    public Disposable confirmCode(ConfirmCodeRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONFIRM_CODE, request, UsersResponse.class,
                Constants.CONFIRM_CODE, true);
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
//
    public Disposable forgetPassword(ForgetPasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.FORGET_PASSWORD, request, StatusMessage.class,
                Constants.FORGET_PASSWORD, true);
    }

    public Disposable changePassword(ChangePasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_PASSWORD, request, StatusMessage.class,
                Constants.CHANGE_PASSWORD, true);
    }

//    public Disposable getCountriesCodes() {
//        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_COUNTRIES_CODE, new Object(), CountriesCodesResponse.class,
//                Constants.GET_COUNTRIES_CODE, false);
//    }

    public Disposable getUserDocuments() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_USER_DOCUMENTS, new Object(), UserDocumentsResponse.class,
                Constants.GET_USER_DOCUMENTS, true);
    }
}