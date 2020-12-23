package grand.app.akar.pages.ads.models;
import androidx.databinding.ObservableField;
import com.google.gson.annotations.SerializedName;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.validation.Validate;

public class CreateAdRequest {
    @SerializedName("city_id")
    private int cityId;
    private String cityName;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("address")
    private String address;
    @SerializedName("categories_id")
    private int categories_id;
    @SerializedName("listing_type")
    private int listing_type;
    @SerializedName("price")
    private String price;
    @SerializedName("area")
    private String area;
    @SerializedName("total_area")
    private String total_area;
    @SerializedName("floor_area")
    private String floor_area;
    @SerializedName("floor_no")
    private String floor_no = "1";
    @SerializedName("room_no")
    private String room_no = "1";
    @SerializedName("bathroom_no")
    private String bathroom_no = "1";
    @SerializedName("kitchen_no")
    private String kitchen_no = "1";
    @SerializedName("building_year")
    private String building_year;
    @SerializedName("payment_method")
    private String payment_method;
    @SerializedName("doc_type")
    private String doc_type;
    @SerializedName("street_width")
    private String street_width;
    @SerializedName("front_no")
    private String front_no = "0";
    @SerializedName("swimming_pool")
    private int swimming_pool;
    @SerializedName("lift")
    private String lift;
    @SerializedName("garage")
    private String garage;
    @SerializedName("furniture")
    private String furniture;
    @SerializedName("services")
    private String services;
    @SerializedName("desc")
    private String desc;
    public ObservableField<String> priceError = new ObservableField<>();
    public ObservableField<String> addressError = new ObservableField<>();
    public ObservableField<String> areaError = new ObservableField<>();
    public ObservableField<String> totalAreaError = new ObservableField<>();
    public ObservableField<String> floorAreaError = new ObservableField<>();
    public ObservableField<String> floorNoError = new ObservableField<>();
    public ObservableField<String> roomNoError = new ObservableField<>();
    public ObservableField<String> bathroomNoError = new ObservableField<>();
    public ObservableField<String> kitchenNoError = new ObservableField<>();
    public ObservableField<String> buildingYearError = new ObservableField<>();
    public ObservableField<String> paymentMethodError = new ObservableField<>();
    public ObservableField<String> docTypeError = new ObservableField<>();

    public boolean isVillaHouseManagementValid() {
        boolean valid = true;
        if (!Validate.isValid(price, Constants.FIELD)) {
            priceError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(address, Constants.FIELD)) {
            addressError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(area, Constants.FIELD)) {
            areaError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(total_area, Constants.FIELD)) {
            totalAreaError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(floor_area, Constants.FIELD)) {
            floorAreaError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(building_year, Constants.FIELD)) {
            buildingYearError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        addressError.set(null);
        this.address = address;
    }

    public int getCategories_id() {
        return categories_id;
    }

    public void setCategories_id(int categories_id) {
        this.categories_id = categories_id;
    }

    public int getListing_type() {
        return listing_type;
    }

    public void setListing_type(int listing_type) {
        this.listing_type = listing_type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        priceError.set(null);
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        areaError.set(null);
        this.area = area;
    }

    public String getTotal_area() {
        return total_area;
    }

    public void setTotal_area(String total_area) {
        totalAreaError.set(null);
        this.total_area = total_area;
    }

    public String getFloor_area() {
        return floor_area;
    }

    public void setFloor_area(String floor_area) {
        floorAreaError.set(null);
        this.floor_area = floor_area;
    }

    public String getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(String floor_no) {
        floorNoError.set(null);
        this.floor_no = floor_no;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        roomNoError.set(null);
        this.room_no = room_no;
    }

    public String getBathroom_no() {
        return bathroom_no;
    }

    public void setBathroom_no(String bathroom_no) {
        bathroomNoError.set(null);
        this.bathroom_no = bathroom_no;
    }

    public String getKitchen_no() {
        return kitchen_no;
    }

    public void setKitchen_no(String kitchen_no) {
        kitchenNoError.set(null);
        this.kitchen_no = kitchen_no;
    }

    public String getBuilding_year() {
        return building_year;
    }

    public void setBuilding_year(String building_year) {
        buildingYearError.set(null);
        this.building_year = building_year;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        paymentMethodError.set(null);
        this.payment_method = payment_method;
    }

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        docTypeError.set(null);
        this.doc_type = doc_type;
    }

    public String getStreet_width() {
        return street_width;
    }

    public void setStreet_width(String street_width) {
        this.street_width = street_width;
    }

    public String getFront_no() {
        return front_no;
    }

    public void setFront_no(String front_no) {
        this.front_no = front_no;
    }

    public int getSwimming_pool() {
        return swimming_pool;
    }

    public void setSwimming_pool(int swimming_pool) {
        this.swimming_pool = swimming_pool;
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

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ObservableField<String> getAddressError() {
        return addressError;
    }

    public void setAddressError(ObservableField<String> addressError) {
        this.addressError = addressError;
    }

    @Override
    public String toString() {
        return "CreateAdRequest{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", address='" + address + '\'' +
                ", categories_id=" + categories_id +
                ", listing_type=" + listing_type +
                ", price='" + price + '\'' +
                ", area='" + area + '\'' +
                ", total_area='" + total_area + '\'' +
                ", floor_area='" + floor_area + '\'' +
                ", floor_no='" + floor_no + '\'' +
                ", room_no='" + room_no + '\'' +
                ", bathroom_no='" + bathroom_no + '\'' +
                ", kitchen_no='" + kitchen_no + '\'' +
                ", building_year='" + building_year + '\'' +
                ", payment_method='" + payment_method + '\'' +
                ", doc_type='" + doc_type + '\'' +
                ", street_width='" + street_width + '\'' +
                ", front_no='" + front_no + '\'' +
                ", swimming_pool=" + swimming_pool +
                ", lift='" + lift + '\'' +
                ", garage='" + garage + '\'' +
                ", furniture='" + furniture + '\'' +
                ", services='" + services + '\'' +
                ", desc='" + desc + '\'' +
                ", priceError=" + priceError +
                ", addressError=" + addressError +
                ", areaError=" + areaError +
                ", totalAreaError=" + totalAreaError +
                ", floorAreaError=" + floorAreaError +
                ", floorNoError=" + floorNoError +
                ", roomNoError=" + roomNoError +
                ", bathroomNoError=" + bathroomNoError +
                ", kitchenNoError=" + kitchenNoError +
                ", buildingYearError=" + buildingYearError +
                ", paymentMethodError=" + paymentMethodError +
                ", docTypeError=" + docTypeError +
                '}';
    }
}
