package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.akar.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {
	@SerializedName("data")
	private List<HomeData> homeDataList;

	public List<HomeData> getHomeDataList() {
		return homeDataList;
	}
}