package te.app.evidence.pages.users.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class SystemUserResponse extends StatusMessage {

	@SerializedName("data")
	private UsersMainData usersMainData;

    public UsersMainData getUsersMainData() {
        return usersMainData;
    }
}