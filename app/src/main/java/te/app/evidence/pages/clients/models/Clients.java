package te.app.evidence.pages.clients.models;

import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.google.gson.annotations.SerializedName;
import com.pchmn.materialchips.model.ChipInterface;

public class Clients implements ChipInterface {

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

    @Override
    public Object getId() {
        return clientId;
    }

    @Override
    public Uri getAvatarUri() {
        return null;
    }

    @Override
    public Drawable getAvatarDrawable() {
        return null;
    }

    @Override
    public String getLabel() {
        return clientName;
    }

    @Override
    public String getInfo() {
        return clientUnit;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}