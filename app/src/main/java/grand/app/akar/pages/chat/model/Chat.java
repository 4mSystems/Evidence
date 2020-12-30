package grand.app.akar.pages.chat.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import grand.app.akar.pages.auth.models.UserData;
import grand.app.akar.pages.home.models.DefaultImg;

public class Chat {

	@SerializedName("listing_id")
	private int listingId;

	@SerializedName("receiver")
	private UserData receiver;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("text")
	private String text;

	@SerializedName("media")
	private List<DefaultImg> media;

	public int getListingId(){
		return listingId;
	}

	public UserData getReceiver(){
		return receiver;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getText(){
		return text;
	}

	public List<DefaultImg> getMedia(){
		return media;
	}
}