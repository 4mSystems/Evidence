package te.app.evidence.pages.clients.models.clientProfile;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ClientProfileResponse extends StatusMessage {

    @SerializedName("data")
    private ClientProfileData clientProfileData;

    public ClientProfileData getClientProfileData() {
        return clientProfileData;
    }

}