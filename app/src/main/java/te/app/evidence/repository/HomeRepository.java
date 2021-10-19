package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.home.models.HomeResponse;
import te.app.evidence.pages.mohdrs.models.ReportersResponse;
import te.app.evidence.pages.sessions.models.CaseSessionsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class HomeRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public HomeRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getHome() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME, new Object(), HomeResponse.class,
                Constants.HOME, true);
    }

    public Disposable getPrevSessions(int page) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME_PREV_SESSIONS + page, new Object(), CaseSessionsResponse.class,
                Constants.PREV_SESSIONS, false);
    }

    public Disposable getComingSessions(int page) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME_COMING_SESSIONS + page, new Object(), CaseSessionsResponse.class,
                Constants.COMING_SESSIONS, false);
    }
      public Disposable getReporters(int page) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME_REPORTERS + page, new Object(), ReportersResponse.class,
                Constants.COMING_SESSIONS, false);
    }

}