package te.app.evidence.pages.cases.models.cases;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.clients.models.Category;

public class Cases {

    @SerializedName("inventation_type")
    private String inventationType;

    @SerializedName("first_session_date")
    private String firstSessionDate;

    @SerializedName("circle_num")
    private String circleNum;

    @SerializedName("id")
    private int id;

    @SerializedName("court")
    private String court;
    @SerializedName("clients")
    private String clients;
    @SerializedName("khesms")
    private String khesms;

    @SerializedName("invetation_num")
    private String invetationNum;
    @SerializedName("category")
    private Category category;

    public String getInventationType() {
        return inventationType;
    }

    public String getFirstSessionDate() {
        return firstSessionDate;
    }

    public String getCircleNum() {
        return circleNum;
    }

    public int getId() {
        return id;
    }

    public String getCourt() {
        return court;
    }

    public String getInvetationNum() {
        return invetationNum;
    }

    public Category getCategory() {
        return category;
    }

    public String getClients() {
        return clients;
    }

    public String getKhesms() {
        return khesms;
    }
}