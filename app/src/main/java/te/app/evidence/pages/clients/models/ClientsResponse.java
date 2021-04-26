package te.app.evidence.pages.clients.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ClientsResponse extends StatusMessage {

    @SerializedName("data")
    private List<Clients> clientsList;
    private int counter;

    public ClientsResponse() {
    }

    public ClientsResponse(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}