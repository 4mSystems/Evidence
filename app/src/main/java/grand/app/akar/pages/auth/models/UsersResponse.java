package grand.app.akar.pages.auth.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class UsersResponse extends StatusMessage {

	@SerializedName("data")
	private UserData data;

	public UserData getData(){
		return data;
	}
}