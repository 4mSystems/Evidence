package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.SearchRequest;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.cases.models.AddCaseRequest;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesResponse;
import te.app.evidence.pages.cases.models.CaseClientsResponse;
import te.app.evidence.pages.cases.models.caseDetails.CaseDetailsResponse;
import te.app.evidence.pages.cases.models.cases.AddCaseResponse;
import te.app.evidence.pages.cases.models.cases.AllCasesResponse;
import te.app.evidence.pages.clients.models.AddClientRequest;
import te.app.evidence.pages.mohdrs.models.AddMohdrRequest;
import te.app.evidence.pages.mohdrs.models.AddMohdrResponse;
import te.app.evidence.pages.mohdrs.models.ReportersResponse;
import te.app.evidence.pages.mohdrs.models.ChangeStatusResponse;
import te.app.evidence.pages.mohdrs.models.details.ReporterDetailsResponse;
import te.app.evidence.pages.sessions.models.AddSessionRequest;
import te.app.evidence.pages.sessions.models.AddSessionResponse;
import te.app.evidence.pages.sessions.models.CaseSessionsResponse;
import te.app.evidence.pages.sessions.models.SessionNotesResponse;
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

    public Disposable getMohdareen(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_MOHDAREEN + page, new Object(), ReportersResponse.class,
                Constants.GET_MOHDAREEN, showProgress);
    }

    public Disposable searchMohdr(int page, boolean showProgress, SearchRequest searchRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEARCH_MOHDR + page, searchRequest, ReportersResponse.class,
                Constants.SEARCH, showProgress);
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

    public Disposable createCase(AddCaseRequest addCaseRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_CASE, addCaseRequest, AddCaseResponse.class,
                Constants.ADD_CASE, false);
    }

    public Disposable editCase(AddCaseRequest addCaseRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_CASE, addCaseRequest, AddCaseResponse.class,
                Constants.EDIT_CASE, false);
    }

    public Disposable addClientToCase(AddCaseRequest addCaseRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_CLIENT_CASE, addCaseRequest, StatusMessage.class,
                Constants.ADD_CLIENTS, false);
    }

    public Disposable allCases(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ALL_CASES + page, new Object(), AllCasesResponse.class,
                Constants.ALL_CASES, showProgress);
    }

    public Disposable search(int page, boolean showProgress, SearchRequest searchRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEARCH_CASES + page, searchRequest, AllCasesResponse.class,
                Constants.SEARCH, showProgress);
    }

    public Disposable caseDetails(int caseId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CASE_DETAILS + caseId, new Object(), CaseDetailsResponse.class,
                Constants.CASE_DETAILS, true);
    }

    public Disposable getCaseClients(int caseId, String type, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CASE_CLIENTS + caseId + "/" + type + "?page=" + page, new Object(), CaseClientsResponse.class,
                Constants.CLIENTS, showProgress);
    }

    public Disposable deleteCCase(int caseId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_CASE + caseId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable deleteClientFromCase(AddClientRequest addClientRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.DELETE_CLIENT_FROM_CASE, addClientRequest, StatusMessage.class,
                Constants.DELETE_CLIENT, true);
    }

    public Disposable getCaseSessions(int caseId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CASE_SESSIONS + caseId + "&page=" + page, new Object(), CaseSessionsResponse.class,
                Constants.CASE_SESSIONS, showProgress);
    }

    public Disposable searchSessions(int page, boolean showProgress, SearchRequest searchRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEARCH_SESSIONS + page, searchRequest, CaseSessionsResponse.class,
                Constants.CASE_SESSIONS, showProgress);
    }

    public Disposable ChangeSessionStatus(int sessionId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CHANGE_SESSION_STATUS + sessionId, new Object(), ChangeStatusResponse.class,
                Constants.CHANGE_STATUS, true);
    }

    public Disposable deleteSession(int sessionId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_SESSION + sessionId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable addNewSession(AddSessionRequest addSessionRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_NEW_SESSION, addSessionRequest, AddSessionResponse.class,
                Constants.NEW_SESSION, false);
    }

    public Disposable editNewSession(AddSessionRequest addSessionRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_SESSION, addSessionRequest, AddSessionResponse.class,
                Constants.NEW_SESSION, false);
    }

    public Disposable getSessionNotes(int sessionId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CASE_SESSION_NOTES + sessionId + "?page=" + page, new Object(), SessionNotesResponse.class,
                Constants.SESSION_NOTES, showProgress);
    }

    public Disposable searchNotes(int page, boolean showProgress, SearchRequest searchRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CASE_SESSION_NOTES_SEARCH + page, searchRequest, SessionNotesResponse.class,
                Constants.SESSION_NOTES, showProgress);
    }

    public Disposable deleteSessionNote(int noteId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_SESSION_NOTE + noteId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable changeNoteSessionStatus(int noteId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CHANGE_SESSION_NOTE_STATUS + noteId, new Object(), ChangeStatusResponse.class,
                Constants.CHANGE_STATUS, true);
    }

    public Disposable createMohdr(AddMohdrRequest addMohdrRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_MOHDR, addMohdrRequest, AddMohdrResponse.class,
                Constants.ADD_MOHDR, false);
    }
}