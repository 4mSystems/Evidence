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

	public int getListingId(){
		return listingId;
	}

	public int getId(){
		return id;
	}

	public String getMedia(){
		return media;
	}

	public int getType(){
		return type;
	}
}