package grand.app.akar.pages.myAccount.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class ProfileDataResponse extends StatusMessage {
	@SerializedName("data")
	private ProfileData data;
	public ProfileData getData(){
		return data;
	}

}