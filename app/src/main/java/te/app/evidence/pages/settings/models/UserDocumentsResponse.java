package te.app.evidence.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class UserDocumentsResponse extends StatusMessage {
    @SerializedName("data")
    private UserDocuments data;

    public UserDocuments getData() {
        return data;
    }

}