package te.app.evidence.pages.cases.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.models.Clients;

public class CaseClientsResponse extends StatusMessage {
    @SerializedName("data")
    private List<Clients> clientsList;

    public List<Clients> getClientsList() {
        return clientsList;
    }
}
