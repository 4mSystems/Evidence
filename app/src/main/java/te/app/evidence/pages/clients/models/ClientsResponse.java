package te.app.evidence.pages.clients.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ClientsResponse extends StatusMessage {

    @SerializedName("data")
    private List<Clients> clientsList;

    public ClientsResponse() {
    }

    public ClientsResponse(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

}