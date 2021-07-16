package te.app.evidence.pages.sessions.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class SessionMainData extends Paginate {
    @SerializedName("data")
    private List<SessionItem> sessionItem;

    public List<SessionItem> getSessionItem() {
        return sessionItem;
    }
}
