package te.app.evidence.pages.clients.notes.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddNoteRequest {
    @SerializedName("note")
    private String notes;
    @SerializedName("id")
    private String note_id;
    @SerializedName("client_id")
    private String client_id;
    @SerializedName("session_Id")
    private String sessionId;

    public ObservableField<String> noteError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(notes, Constants.FIELD)) {
            noteError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        noteError.set(null);
        this.notes = notes;
    }

    public String getNote_id() {
        return note_id;
    }

    public void setNote_id(String note_id) {
        this.note_id = note_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
