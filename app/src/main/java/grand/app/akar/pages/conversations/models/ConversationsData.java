package grand.app.akar.pages.conversations.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.pages.auth.models.UserData;

public class ConversationsData {

    @SerializedName("listing_id")
    private int listingId;

    @SerializedName("receiver")
    private UserData receiver;

    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("address")
    private String address;

    @SerializedName("id")
    private int id;

    @SerializedName("text")
    private String text;

    public int getListingId() {
        return listingId;
    }

    public UserData getReceiver() {
        return receiver;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

	public String getAddress() {
		return address;
	}
}