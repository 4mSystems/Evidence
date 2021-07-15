package te.app.evidence.pages.clients.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class ClientsMainData extends Paginate {
    @SerializedName("data")
    private List<Clients> clientsList;
    private int counter;

    public ClientsMainData() {
    }

    public ClientsMainData(List<Clients> clientsList) {
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
