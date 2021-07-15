package te.app.evidence.pages.clients.notes.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class NotesMainData extends Paginate {
    @SerializedName("data")
    private List<Notes> clientNotes;

    public List<Notes> getClientNotes() {
        return clientNotes;
    }
}
