package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.settings.models.AboutResponse;
import te.app.evidence.pages.settings.models.ContactUsRequest;
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

    public Disposable getAbout() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.ABOUT, new Object(), AboutResponse.class,
                Constants.ABOUT, true);
    }

    public Disposable getTerms() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.TERMS, new Object(), AboutResponse.class,
                Constants.TERMS, true);
    }

    public Disposable sendContact(ContactUsRequest contactUsRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONTACT_US, contactUsRequest, StatusMessage.class,
                Constants.CONTACT, true);
    }
}