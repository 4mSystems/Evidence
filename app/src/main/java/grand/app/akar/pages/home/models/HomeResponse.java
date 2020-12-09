package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {

	@SerializedName("data")
	private HomeMainData data;

	public HomeMainData getData(){
		return data;
	}

}