package te.app.evidence.pages.users.models.userPermissions;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class UserPermissionsResponse extends StatusMessage {

    @SerializedName("data")
    private UserPermissionsData permissionsData;

    public UserPermissionsData getPermissionsData() {
        return permissionsData;
    }
}