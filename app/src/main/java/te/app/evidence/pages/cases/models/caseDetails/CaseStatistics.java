package te.app.evidence.pages.cases.models.caseDetails;

import com.google.gson.annotations.SerializedName;

public class CaseStatistics {

    @SerializedName("attachments_number")
    private String attachmentsNumber;

    @SerializedName("notes_number")
    private String notesNumber;

    @SerializedName("sessions_number")
    private String sessionsNumber;
    @SerializedName("clients")
    private String clients;
    @SerializedName("khesm")
    private String khesm;

    public String getAttachmentsNumber() {
        return attachmentsNumber;
    }

    public String getNotesNumber() {
        return notesNumber;
    }

    public String getSessionsNumber() {
        return sessionsNumber;
    }

    public String getClients() {
        return clients;
    }

    public String getKhesm() {
        return khesm;
    }

    public void setAttachmentsNumber(String attachmentsNumber) {
        this.attachmentsNumber = attachmentsNumber;
    }

    public void setNotesNumber(String notesNumber) {
        this.notesNumber = notesNumber;
    }

    public void setSessionsNumber(String sessionsNumber) {
        this.sessionsNumber = sessionsNumber;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    public void setKhesm(String khesm) {
        this.khesm = khesm;
    }
}