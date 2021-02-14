package te.app.evidence.pages.notes.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.auth.models.UserData;

public class Notes {

	@SerializedName("notes")
	private String notes;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("id")
	private int id;

	@SerializedName("user")
	private UserData user;

	@SerializedName("client_id")
	private String clientId;

	public String getNotes(){
		return notes;
	}

	public String getUserId(){
		return userId;
	}

	public int getId(){
		return id;
	}

	public UserData getUser(){
		return user;
	}

	public String getClientId(){
		return clientId;
	}
}