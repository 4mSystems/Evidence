package grand.app.akar.pages.adDetails.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReportRequest {
    @SerializedName("listing_id")
    private int listing_id;
    @SerializedName("reason_id")
    private List<Integer> reason_id;
    @SerializedName("text")
    private String text;

    public int getListing_id() {
        return listing_id;
    }

    public void setListing_id(int listing_id) {
        this.listing_id = listing_id;
    }

    public List<Integer> getReason_id() {
        return reason_id;
    }

    public void setReason_id(List<Integer> reason_id) {
        this.reason_id = reason_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
