package grand.app.akar.pages.adDetails.models;

import com.google.gson.annotations.SerializedName;

public class SliderItem{

	@SerializedName("listing_id")
	private int listingId;

	@SerializedName("id")
	private int id;

	@SerializedName("media")
	private String media;

	@SerializedName("type")
	private int type;

	public SliderItem(int listingId, int id, String media, int type) {
		this.listingId = listingId;
		this.id = id;
		this.media = media;
		this.type = type;
	}

	public SliderItem() {
	}

	public int getListingId(){
		return listingId;
	}

	public int getId(){
		return id;
	}

	public String getMedia(){
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public int getType(){
		return type;
	}
}