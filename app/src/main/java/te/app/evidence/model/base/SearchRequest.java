package te.app.evidence.model.base;

import com.google.gson.annotations.SerializedName;

public class SearchRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("case_id")
    private String caseId;
    @SerializedName("session_date")
    private String sessionDate;
    @SerializedName("note")
    private String note;
    @SerializedName("session_id")
    private String sessionId;
    @SerializedName("search")
    private String search;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
