package te.app.evidence.pages.home.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {

	@SerializedName("data")
	private HomeData homeData;

	public HomeData getHomeData(){
		return homeData;
	}

}