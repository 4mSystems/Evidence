package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.pages.points.models.EarnPointsResponse;
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


}