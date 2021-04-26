package te.app.evidence.pages.cases.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.pages.clients.models.Category;
import te.app.evidence.pages.clients.models.Clients;

public class CaseClientsCategoriesData {

    @SerializedName("clients")
    private List<Clients> clients;

    @SerializedName("khesms")
    private List<Clients> khesm;

    @SerializedName("categories")
    private List<CategoriesData> categories;

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

    public List<CategoriesData> getCategories() {
        return categories;
    }
}