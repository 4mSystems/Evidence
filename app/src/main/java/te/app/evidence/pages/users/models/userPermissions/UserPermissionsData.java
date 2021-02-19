package te.app.evidence.pages.users.models.userPermissions;

import com.google.gson.annotations.SerializedName;

public class UserPermissionsData {

    @SerializedName("monthly_report")
    private String monthlyReport;

    @SerializedName("clients")
    private String clients;

    @SerializedName("search_case")
    private String searchCase;

    @SerializedName("addcases")
    private String addcases;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("mohdreen")
    private String mohdreen;

    @SerializedName("category")
    private String category;

    @SerializedName("users")
    private String users;

    @SerializedName("daily_report")
    private String dailyReport;

    public String getMonthlyReport() {
        return monthlyReport;
    }

    public String getClients() {
        return clients;
    }

    public String getSearchCase() {
        return searchCase;
    }

    public String getAddcases() {
        return addcases;
    }

    public String getUserId() {
        return userId;
    }

    public String getMohdreen() {
        return mohdreen;
    }

    public String getCategory() {
        return category;
    }

    public String getUsers() {
        return users;
    }

    public String getDailyReport() {
        return dailyReport;
    }

    public void setMonthlyReport(String monthlyReport) {
        this.monthlyReport = monthlyReport;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    public void setSearchCase(String searchCase) {
        this.searchCase = searchCase;
    }

    public void setAddcases(String addcases) {
        this.addcases = addcases;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setMohdreen(String mohdreen) {
        this.mohdreen = mohdreen;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public void setDailyReport(String dailyReport) {
        this.dailyReport = dailyReport;
    }
}