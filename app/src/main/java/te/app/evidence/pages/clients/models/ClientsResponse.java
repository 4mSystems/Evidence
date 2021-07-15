package te.app.evidence.pages.clients.models;


import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ClientsResponse extends StatusMessage {

    @SerializedName("data")
    private ClientsMainData clientsMainData;

    public ClientsMainData getClientsMainData() {
        return clientsMainData;
    }
}