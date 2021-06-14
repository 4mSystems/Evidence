package te.app.evidence.pages.sessions.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddSessionResponse extends StatusMessage {
    @SerializedName("data")
    private SessionItem sessionItem;

    public SessionItem getSessionItem() {
        return sessionItem;
    }
}
