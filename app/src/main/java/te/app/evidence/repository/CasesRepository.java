package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesResponse;
import te.app.evidence.pages.mohdrs.models.ReportersResponse;
import te.app.evidence.pages.mohdrs.models.ChangeStatusResponse;
import te.app.evidence.pages.mohdrs.models.details.ReporterDetailsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;

@Singleton
public class CasesRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public CasesRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getCasesClientsCategories() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CASE_CLIENTS_CATEGORIES, new Object(), CaseClientsCategoriesResponse.class,
                Constants.CASE_CLIENTS_CATEGORIES, true);
    }

    public Disposable getMohdareen() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_MOHDAREEN, new Object(), ReportersResponse.class,
                Constants.GET_MOHDAREEN, true);
    }

    public Disposable ChangeStatus(int mohId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CHANGE_MOH_STATUS + mohId, new Object(), ChangeStatusResponse.class,
                Constants.CHANGE_STATUS, true);
    }

    public Disposable deleteMohdr(int mohId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_MOHDR + mohId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable getReportersDetails(int mohId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.REPORTER_DETAILS + mohId, new Object(), ReporterDetailsResponse.class,
                Constants.REPOTERS, true);
    }
}