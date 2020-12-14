package grand.app.akar.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.myAccount.models.ProfileDataResponse;
import grand.app.akar.pages.notifications.models.NotificationsResponse;
import grand.app.akar.pages.settings.models.AboutResponse;
import grand.app.akar.pages.settings.models.settings.SettingsResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.URLS;
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

    public Disposable getAbout() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.ABOUT, new Object(), AboutResponse.class,
                Constants.ABOUT, true);
    }

    public Disposable getTerms() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.TERMS, new Object(), AboutResponse.class,
                Constants.TERMS, true);
    }

    public Disposable getNotifications() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.NOTIFICATIONS, new Object(), NotificationsResponse.class,
                Constants.NOTIFICATIONS, true);
    }

    public Disposable getContact() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CONTACT_US, new Object(), SettingsResponse.class,
                Constants.CONTACT, true);
    }

    public Disposable getProfileData() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_PROFILE_DATA, new Object(), ProfileDataResponse.class,
                Constants.PROFILE_DATA, true);
    }
}