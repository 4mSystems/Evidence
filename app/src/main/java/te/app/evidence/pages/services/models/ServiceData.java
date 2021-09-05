package te.app.evidence.pages.services.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.auth.models.UserData;

public class ServiceData {

	@SerializedName("whatsapp")
	private String whatsapp;

	@SerializedName("image")
	private String image;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("phone")
	private String phone;

	@SerializedName("price")
	private String price;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("time")
	private String time;

	@SerializedName("title")
	private String title;

	@SerializedName("user")
	private UserData user;

	@SerializedName("desc")
	private String desc;

	public String getWhatsapp(){
		return whatsapp;
	}

	public String getImage(){
		return image;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getUserId(){
		return userId;
	}

	public String getPhone(){
		return phone;
	}

	public String getPrice(){
		return price;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getTime(){
		return time;
	}

	public String getTitle(){
		return title;
	}

	public UserData getUser(){
		return user;
	}

	public String getDesc(){
		return desc;
	}
}