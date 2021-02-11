package te.app.evidence.pages.clients.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddClientResponse extends StatusMessage {
    @SerializedName("data")
    private Clients clients;

    public Clients getClients() {
        return clients;
    }
}
