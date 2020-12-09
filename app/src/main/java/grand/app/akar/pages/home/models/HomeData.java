package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class HomeData {

	@SerializedName("image")
	private String image;

	@SerializedName("address")
	private String address;

	@SerializedName("lng")
	private String lng;

	@SerializedName("distance")
	private String distance;

	@SerializedName("description")
	private String description;

	@SerializedName("delegate_count")
	private int delegateCount;

	@SerializedName("orders_count")
	private int ordersCount;

	@SerializedName("is_delegate_subscribe")
	private int isDelegateSubscribe;

	@SerializedName("rate")
	private String rate;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("cover_image")
	private String coverImage;

	@SerializedName("lat")
	private String lat;

	public String getImage(){
		return image;
	}

	public String getAddress(){
		return address;
	}

	public String getLng(){
		return lng;
	}

	public String getDistance(){
		return distance;
	}

	public String getDescription(){
		return description;
	}

	public int getDelegateCount(){
		return delegateCount;
	}

	public int getOrdersCount(){
		return ordersCount;
	}

	public int getIsDelegateSubscribe(){
		return isDelegateSubscribe;
	}

	public String getRate(){
		return rate;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getCoverImage(){
		return coverImage;
	}

	public String getLat(){
		return lat;
	}
}