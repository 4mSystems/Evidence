package te.app.evidence.pages.reports.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.helper.AppHelper;

public class SearchReportRequest {
    @SerializedName("month")
    private String month;
    @SerializedName("year")
    private String year;
    @SerializedName("category_id")
    private String category_id;
    @SerializedName("session_date")
    private String session_date = AppHelper.selectDate();

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getSession_date() {
        return session_date;
    }

    public void setSession_date(String session_date) {
        this.session_date = session_date;
    }
}
