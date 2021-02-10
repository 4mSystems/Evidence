package te.app.evidence.pages.auth.models;

import com.google.gson.annotations.SerializedName;

public class UserMainData {
    @SerializedName("user")
    private UserData userData;
    @SerializedName("permission")
    private Permission permission;

    public UserData getUserData() {
        return userData;
    }

    public Permission getPermission() {
        return permission;
    }
}
