package te.app.evidence.pages.notes.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddNoteRequest {
    @SerializedName("notes")
    private String notes;
    @SerializedName("client_id")
    private int client_id;
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

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
}
