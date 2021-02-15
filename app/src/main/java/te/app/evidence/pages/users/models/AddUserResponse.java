package te.app.evidence.pages.users.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddUserResponse extends StatusMessage {
    @SerializedName("data")
    SystemUserData systemUserData;

    public SystemUserData getSystemUserData() {
        return systemUserData;
    }
}
