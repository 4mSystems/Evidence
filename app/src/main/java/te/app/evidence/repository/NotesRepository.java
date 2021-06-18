package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.models.clientProfile.ClientProfileResponse;
import te.app.evidence.pages.clients.notes.models.AddNoteRequest;
import te.app.evidence.pages.clients.notes.models.AddNoteResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;

@Singleton
public class NotesRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public NotesRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }


    public Disposable addNewNote(AddNoteRequest addNoteRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_NOTE, addNoteRequest, AddNoteResponse.class,
                Constants.ADD_NOTE, false);
    }

    public Disposable addNewSessionNote(AddNoteRequest addNoteRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_SESSION_NOTE, addNoteRequest, AddNoteResponse.class,
                Constants.ADD_NOTE, false);
    }

    public Disposable editNote(AddNoteRequest addNoteRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_NOTE, addNoteRequest, AddNoteResponse.class,
                Constants.ADD_NOTE, false);
    }

    public Disposable editSessionNote(AddNoteRequest addNoteRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_SESSION_NOTE, addNoteRequest, AddNoteResponse.class,
                Constants.ADD_NOTE, false);
    }

    public Disposable deleteClient(int clientId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_CLIENT + clientId, new Object(), StatusMessage.class,
                Constants.DELETE_CLIENT, true);
    }

    public Disposable getClientProfile(int clientId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CLIENT_PROFILE + clientId, new Object(), ClientProfileResponse.class,
                Constants.CLIENT_PROFILE, true);
    }
}