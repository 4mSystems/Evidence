package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class SearchRequest {
    @SerializedName("listing_type")
    private int listing_type;
    @SerializedName("min_price")
    private int min_price;
    @SerializedName("max_price")
    private int max_price;
    @SerializedName("area")
    private int area;
    @SerializedName("floor_no")
    private int floor_no;
    @SerializedName("room_no")
    private int room_no;
    @SerializedName("bathroom_no")
    private int bathroom_no;
    @SerializedName("kitchen_no")
    private int kitchen_no;
    @SerializedName("building_year")
    private int building_year;
    @SerializedName("doc_type")
    private int doc_type;
    @SerializedName("city_id")
    private int city_id;
    @SerializedName("category_id")
    private int category_id;

    public int getListing_type() {
        return listing_type;
    }

    public void setListing_type(int listing_type) {
        this.listing_type = listing_type;
    }

    public int getMin_price() {
        return min_price;
    }

    public void setMin_price(int min_price) {
        this.min_price = min_price;
    }

    public int getMax_price() {
        return max_price;
    }

    public void setMax_price(int max_price) {
        this.max_price = max_price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(int floor_no) {
        this.floor_no = floor_no;
    }

    public int getRoom_no() {
        return room_no;
    }

    public void setRoom_no(int room_no) {
        this.room_no = room_no;
    }

    public int getBathroom_no() {
        return bathroom_no;
    }

    public void setBathroom_no(int bathroom_no) {
        this.bathroom_no = bathroom_no;
    }

    public int getKitchen_no() {
        return kitchen_no;
    }

    public void setKitchen_no(int kitchen_no) {
        this.kitchen_no = kitchen_no;
    }

    public int getBuilding_year() {
        return building_year;
    }

    public void setBuilding_year(int building_year) {
        this.building_year = building_year;
    }

    public int getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(int doc_type) {
        this.doc_type = doc_type;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
