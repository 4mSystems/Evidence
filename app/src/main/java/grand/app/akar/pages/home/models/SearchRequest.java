package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class SearchRequest {
    @SerializedName("listing_type")
    private int listing_type;
    @SerializedName("min_price")
    private String min_price;
    @SerializedName("max_price")
    private String max_price;
    @SerializedName("area")
    private String area;
    @SerializedName("floor_no")
    private String floor_no = "1";
    @SerializedName("front_no")
    private String front_no = "1";
    @SerializedName("room_no")
    private String room_no = "1";
    @SerializedName("bathroom_no")
    private String bathroom_no = "1";
    @SerializedName("kitchen_no")
    private String kitchen_no = "1";
    @SerializedName("building_year")
    private String building_year;
    @SerializedName("doc_type")
    private String doc_type;
    @SerializedName("city_id")
    private int city_id;
    @SerializedName("category_id")
    private int category_id;
    @SerializedName("pool")
    private String pool = "0";
    @SerializedName("lift")
    private String lift = "0";
    @SerializedName("garage")
    private String garage = "0";
    @SerializedName("furniture")
    private String furniture = "0";

    public int getListing_type() {
        return listing_type;
    }

    public void setListing_type(int listing_type) {
        this.listing_type = listing_type;
    }

    public String getMin_price() {
        return min_price;
    }

    public void setMin_price(String min_price) {
        this.min_price = min_price;
    }

    public String getMax_price() {
        return max_price;
    }

    public void setMax_price(String max_price) {
        this.max_price = max_price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(String floor_no) {
        this.floor_no = floor_no;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getBathroom_no() {
        return bathroom_no;
    }

    public void setBathroom_no(String bathroom_no) {
        this.bathroom_no = bathroom_no;
    }

    public String getKitchen_no() {
        return kitchen_no;
    }

    public void setKitchen_no(String kitchen_no) {
        this.kitchen_no = kitchen_no;
    }

    public String getBuilding_year() {
        return building_year;
    }

    public void setBuilding_year(String building_year) {
        this.building_year = building_year;
    }

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
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

    public String getFront_no() {
        return front_no;
    }

    public void setFront_no(String front_no) {
        this.front_no = front_no;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }
}
