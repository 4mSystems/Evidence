package te.app.evidence.pages.users.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class SystemUserResponse extends StatusMessage {

	@SerializedName("data")
	private List<SystemUserData> systemUserDataList;
	public List<SystemUserData> getSystemUserDataList(){
		return systemUserDataList;
	}

}