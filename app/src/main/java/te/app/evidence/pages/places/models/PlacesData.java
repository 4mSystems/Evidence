package te.app.evidence.pages.places.models;

import com.google.gson.annotations.SerializedName;

public class PlacesData {

	@SerializedName("image")
	private String image;

	@SerializedName("address")
	private String address;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public String getImage(){
		return image;
	}

	public String getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}