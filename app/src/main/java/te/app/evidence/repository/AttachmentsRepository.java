package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.models.AddClientRequest;
import te.app.evidence.pages.clients.models.AddClientResponse;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.clients.models.clientProfile.ClientProfileResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;

@Singleton
public class AttachmentsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public AttachmentsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getAttachments() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CLIENTS, new Object(), ClientsResponse.class,
                Constants.CLIENTS, true);
    }

    public Disposable addNewClient(AddClientRequest addClientRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_CLIENTS, addClientRequest, AddClientResponse.class,
                Constants.ADD_CLIENTS, true);
    }

    public Disposable editClient(AddClientRequest addClientRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_CLIENTS, addClientRequest, AddClientResponse.class,
                Constants.ADD_CLIENTS, true);
    }

    public Disposable deleteClient(int clientId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_CLIENT + clientId, new Object(), StatusMessage.class,
                Constants.DELETE_CLIENT, true);
    }


}