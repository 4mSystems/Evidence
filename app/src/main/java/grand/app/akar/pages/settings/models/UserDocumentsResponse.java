package grand.app.akar.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class UserDocumentsResponse extends StatusMessage {
    @SerializedName("data")
    private UserDocuments data;

    public UserDocuments getData() {
        return data;
    }

}