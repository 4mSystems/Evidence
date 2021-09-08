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
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.pages.places.models.PlacesByGovernResponse;
import te.app.evidence.pages.places.models.PlacesResponse;
import te.app.evidence.pages.points.models.EarnPointsResponse;
import te.app.evidence.pages.services.models.AddServiceRequest;
import te.app.evidence.pages.services.models.AddServiceResponse;
import te.app.evidence.pages.services.models.ServicesResponse;
import te.app.evidence.pages.settings.models.AboutResponse;
import te.app.evidence.pages.settings.models.ContactUsRequest;
import te.app.evidence.pages.settings.models.PackagesResponse;
import te.app.evidence.pages.settings.models.RenewPackageRequest;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class SettingsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public SettingsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getPackages() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PACKAGES, new Object(), PackagesResponse.class,
                Constants.PACKAGES, true);
    }

    public Disposable subscribePackage(int packageId, int type) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SUBSCRIBE, new RenewPackageRequest(packageId, type), UsersResponse.class,
                Constants.SUBSCRIBE, true);
    }

    public Disposable sendContact(ContactUsRequest contactUsRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONTACT_US, contactUsRequest, StatusMessage.class,
                Constants.CONTACT, true);
    }

    public Disposable getReplacedPoints() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.REPLACED_POINTS, new Object(), EarnPointsResponse.class,
                Constants.POINTS, true);
    }

    public Disposable getPlaces() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PLACES, new Object(), PlacesResponse.class,
                Constants.LOCATIONS, true);
    }

    public Disposable getPlacesByGovernId(int governId, String type, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PLACES_BY_GOVERN + governId + "/" + type + "?page=" + page, new Object(), PlacesByGovernResponse.class,
                Constants.PLACES_BY_GOVERN, showProgress);
    }

    public Disposable getServices(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_SERVICES + page, new Object(), ServicesResponse.class,
                Constants.SERVICES, showProgress);
    }

    public Disposable deleteService(int serviceId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_SERVICES + serviceId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable addServices(AddServiceRequest addServiceRequest, ArrayList<FileObject> fileObjects) {
        return connectionHelper.requestApi(URLS.ADD_SERVICE_REQUEST, addServiceRequest, fileObjects, AddServiceResponse.class,
                Constants.ADD_SERVICE, false);
    }

    public Disposable editServices(AddServiceRequest addServiceRequest, ArrayList<FileObject> fileObjects) {
        return connectionHelper.requestApi(URLS.EDIT_SERVICE_REQUEST + addServiceRequest.getId(), addServiceRequest, fileObjects, AddServiceResponse.class,
                Constants.ADD_SERVICE, false);
    }


}