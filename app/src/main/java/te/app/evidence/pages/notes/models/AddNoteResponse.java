package te.app.evidence.pages.notes.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddNoteResponse extends StatusMessage {
    @SerializedName("data")
    private Notes notes;

    public Notes getNotes() {
        return notes;
    }
}
