package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class HomeData {

	@SerializedName("floor_no")
	private String floorNo;

	@SerializedName("total_area")
	private String totalArea;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("doc_type")
	private String docType;

	@SerializedName("type")
	private String type;

	@SerializedName("bathroom_no")
	private String bathroomNo;

	@SerializedName("premium")
	private String premium;

	@SerializedName("price")
	private String price;

	@SerializedName("listing_num")
	private String listingNum;

	@SerializedName("room_no")
	private String roomNo;

	@SerializedName("id")
	private int id;

	@SerializedName("payment_method")
	private String paymentMethod;

	@SerializedName("lat")
	private String lat;

	@SerializedName("area")
	private String area;

	@SerializedName("address")
	private String address;

	@SerializedName("lng")
	private String lng;

	@SerializedName("categories_id")
	private int categoriesId;

	@SerializedName("listing_type")
	private int listingType;

	@SerializedName("floor_area")
	private String floorArea;

	@SerializedName("kitchen_no")
	private String kitchenNo;

	@SerializedName("building_year")
	private String buildingYear;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("default_img")
	private DefaultImg defaultImg;

	@SerializedName("status")
	private String status;

	@SerializedName("city_id")
	private String cityId;

	public String getFloorNo() {
		return floorNo;
	}

	public String getTotalArea() {
		return totalArea;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getDocType() {
		return docType;
	}

	public String getType() {
		return type;
	}

	public String getBathroomNo() {
		return bathroomNo;
	}

	public String getPremium() {
		return premium;
	}

	public String getPrice() {
		return price;
	}

	public String getListingNum() {
		return listingNum;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public int getId() {
		return id;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getLat() {
		return lat;
	}

	public String getArea() {
		return area;
	}

	public String getAddress() {
		return address;
	}

	public String getLng() {
		return lng;
	}

	public int getCategoriesId() {
		return categoriesId;
	}

	public int getListingType() {
		return listingType;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public String getKitchenNo() {
		return kitchenNo;
	}

	public String getBuildingYear() {
		return buildingYear;
	}

	public String getUserId() {
		return userId;
	}

	public DefaultImg getDefaultImg() {
		return defaultImg;
	}

	public String getStatus() {
		return status;
	}

	public String getCityId() {
		return cityId;
	}
}