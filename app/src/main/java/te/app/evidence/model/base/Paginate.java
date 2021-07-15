package te.app.evidence.model.base;

import com.google.gson.annotations.SerializedName;

public class Paginate {
    @SerializedName("current_page")
    private int currentPage;
    @SerializedName("next_page_url")
    private String nextPageUrl;

    public int getCurrentPage() {
        return currentPage;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }
}
