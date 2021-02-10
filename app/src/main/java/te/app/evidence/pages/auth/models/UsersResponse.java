package te.app.evidence.pages.auth.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class UsersResponse extends StatusMessage {

	@SerializedName("data")
	private UserMainData data;

	public UserMainData getData(){
		return data;
	}
}