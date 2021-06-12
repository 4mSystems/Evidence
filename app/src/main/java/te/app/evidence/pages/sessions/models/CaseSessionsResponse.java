package te.app.evidence.pages.sessions.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.StatusMessage;

public class CaseSessionsResponse extends StatusMessage {
    @SerializedName("data")
    private List<SessionItem> sessionItem;

    public List<SessionItem> getSessionItem() {
        return sessionItem;
    }
}
