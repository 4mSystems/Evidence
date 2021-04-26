package te.app.evidence.pages.sessions;

import com.google.gson.annotations.SerializedName;

public class SessionItem {

    @SerializedName("month")
    private String month;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("year")
    private String year;

    @SerializedName("session_date")
    private String sessionDate;

    @SerializedName("parent_id")
    private String parentId;

    @SerializedName("case_Id")
    private String caseId;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("id")
    private int id;

    @SerializedName("status")
    private String status;
    @SerializedName("invetation_num")
    private String invetation_num;

    public String getMonth() {
        return month;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getYear() {
        return year;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public String getParentId() {
        return parentId;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getInvetation_num() {
        return invetation_num;
    }
}