package te.app.evidence.pages.sessions.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.clients.notes.models.Notes;
import te.app.evidence.pages.clients.notes.models.NotesMainData;

public class SessionNotesResponse extends StatusMessage {
    @SerializedName("data")
    private NotesMainData notesMainData;

    public NotesMainData getNotesMainData() {
        return notesMainData;
    }
}
