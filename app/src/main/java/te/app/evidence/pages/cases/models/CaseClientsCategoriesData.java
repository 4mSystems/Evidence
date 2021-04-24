package te.app.evidence.pages.cases.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.clients.models.Category;
import te.app.evidence.pages.clients.models.Clients;

public class CaseClientsCategoriesData {

    @SerializedName("clients")
    private List<Clients> clients;

    @SerializedName("khesm")
    private List<Clients> khesm;

    @SerializedName("categories")
    private List<Category> categories;

    public List<Clients> getClients() {
        return clients;
    }

    public void setClients(List<Clients> clients) {
        this.clients = clients;
    }

    public List<Clients> getKhesm() {
        return khesm;
    }

    public void setKhesm(List<Clients> khesm) {
        this.khesm = khesm;
    }

    public List<Category> getCategories() {
        return categories;
    }
}