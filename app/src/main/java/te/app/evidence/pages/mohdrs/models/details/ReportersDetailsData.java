package te.app.evidence.pages.mohdrs.models.details;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.clients.models.Category;
import te.app.evidence.pages.mohdrs.models.ReportersData;

public class ReportersDetailsData extends ReportersData {

    @SerializedName("notes")
    private String notes;

    @SerializedName("court_mohdareen")
    private String courtMohdareen;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("paper_type")
    private String paperType;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("parent_id")
    private String parentId;

    @SerializedName("cat_id")
    private String catId;

    @SerializedName("deliver_data")
    private String deliverData;

    @SerializedName("case_number")
    private String caseNumber;

    @SerializedName("category")
    private Category category;


    public String getNotes() {
        return notes;
    }

    public String getCourtMohdareen() {
        return courtMohdareen;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getPaperType() {
        return paperType;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getParentId() {
        return parentId;
    }

    public String getCatId() {
        return catId;
    }


    public String getDeliverData() {
        return deliverData;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public Category getCategory() {
        return category;
    }

}