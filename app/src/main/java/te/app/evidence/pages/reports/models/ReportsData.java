package te.app.evidence.pages.reports.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.cases.models.cases.Cases;
import te.app.evidence.pages.clients.notes.models.Notes;

public class ReportsData {

    @SerializedName("cases")
    private Cases cases;

    @SerializedName("year")
    private String year;

    @SerializedName("session_date")
    private String sessionDate;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("printnotes")
    private Notes printnotes;

    @SerializedName("month")
    private String month;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("parent_id")
    private String parentId;

    @SerializedName("khesm")
    private String khesm;

    @SerializedName("case_Id")
    private String caseId;

    @SerializedName("client")
    private String client;

    @SerializedName("id")
    private int id;

    @SerializedName("status")
    private String status;

    public Cases getCases() {
        return cases;
    }

    public String getYear() {
        return year;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Notes getPrintnotes() {
        return printnotes;
    }

    public String getMonth() {
        return month;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getParentId() {
        return parentId;
    }

    public String getKhesm() {
        return khesm;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getClient() {
        return client;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}