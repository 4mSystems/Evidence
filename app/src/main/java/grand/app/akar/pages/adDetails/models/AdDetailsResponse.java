package grand.app.akar.pages.adDetails.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class AdDetailsResponse extends StatusMessage {
	@SerializedName("data")
	private AdDetailsData data;

	public AdDetailsData getData(){
		return data;
	}

}