package grand.app.akar.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChatRequest {

    @SerializedName("receiver_id")
    @Expose
    private String receiver_id;
    @SerializedName("listing_id")
    @Expose
    private String listing_id;
    @SerializedName("text")
    private String text;

    public String getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(String receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getListing_id() {
        return listing_id;
    }

    public void setListing_id(String listing_id) {
        this.listing_id = listing_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
