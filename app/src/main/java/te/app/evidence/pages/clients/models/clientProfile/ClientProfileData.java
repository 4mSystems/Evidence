package te.app.evidence.pages.clients.models.clientProfile;


import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.cases.models.cases.CasesMainData;
import te.app.evidence.pages.clients.notes.models.NotesMainData;

public class ClientProfileData {

    @SerializedName("cases")
    private CasesMainData casesMainData;
    @SerializedName("id")
    private int id;

    @SerializedName("client_notes_api")
    private NotesMainData notesMainData;

    public CasesMainData getCasesMainData() {
        return casesMainData;
    }

    public int getId() {
        return id;
    }

    public NotesMainData getNotesMainData() {
        return notesMainData;
    }
}