package te.app.evidence.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class CountData{

	@SerializedName("sessions")
	private String sessions;

	@SerializedName("cases")
	private String cases;

	@SerializedName("mohdreen")
	private String mohdreen;

	@SerializedName("users")
	private String users;

	public String getSessions(){
		return sessions;
	}

	public String getCases() {
		return cases;
	}

	public String getMohdreen() {
		return mohdreen;
	}

	public String getUsers() {
		return users;
	}
}