package te.app.evidence.pages.clients.notes.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class NotesResponse extends StatusMessage {
    @SerializedName("data")
    private NotesMainData mainData;

    public NotesMainData getMainData() {
        return mainData;
    }
}
