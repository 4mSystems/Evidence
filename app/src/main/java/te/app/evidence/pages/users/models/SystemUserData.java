package te.app.evidence.pages.users.models;

import com.google.gson.annotations.SerializedName;

public class SystemUserData {

    @SerializedName("parent_id")
    private String parentId;

    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;

    @SerializedName("id")
    private int id;

    @SerializedName("type")
    private String type;

    @SerializedName("email")
    private String email;

    public String getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}