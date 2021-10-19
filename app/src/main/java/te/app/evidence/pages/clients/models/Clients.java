package te.app.evidence.pages.clients.models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Clients {

    @SerializedName("client_Address")
    private String clientAddress;

    @SerializedName("notes")
    private String notes;

    @SerializedName("parent_id")
    private String parentId;

    @SerializedName("cat_id")
    private String catId;

    @SerializedName("id")
    private int clientId;

    @SerializedName("client_Name")
    private String clientName;

    @SerializedName("type")
    private String type;

    @SerializedName("category")
    private Category category;

    @SerializedName("client_Unit")
    private String clientUnit;
    private boolean checked;

    public String getClientAddress() {
        return clientAddress;
    }

    public String getNotes() {
        return notes;
    }

    public String getParentId() {
        return parentId;
    }

    public String getCatId() {
        return catId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

    public String getClientUnit() {
        return clientUnit;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return clientId == clients.clientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }
}