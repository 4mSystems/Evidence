package grand.app.akar.pages.auth.models;

import com.google.gson.annotations.SerializedName;

public class UserData {

	@SerializedName("img")
	private String img;

	@SerializedName("verified_status")
	private int verifiedStatus;

	@SerializedName("phone")
	private String phone;

	@SerializedName("jwt")
	private String jwt;

	@SerializedName("payment_status")
	private int paymentStatus;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private int type;

	@SerializedName("email")
	private String email;

	@SerializedName("city_id")
	private int cityId;

	public String getImg(){
		return img;
	}

	public int getVerifiedStatus(){
		return verifiedStatus;
	}

	public String getPhone(){
		return phone;
	}

	public String getJwt(){
		return jwt;
	}

	public int getPaymentStatus(){
		return paymentStatus;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public int getType(){
		return type;
	}

	public String getEmail(){
		return email;
	}

	public int getCityId(){
		return cityId;
	}
}