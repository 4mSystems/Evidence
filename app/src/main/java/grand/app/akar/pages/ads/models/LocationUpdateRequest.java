package grand.app.akar.pages.ads.models;

import com.google.gson.annotations.SerializedName;

public class LocationUpdateRequest {
    @SerializedName("city_id")
    private int cityId;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("address")
    private String address;
    @SerializedName("listing_id")
    private int listing_id;

    public LocationUpdateRequest(int cityId, String lat, String lng, String address, int listing_id) {
        this.cityId = cityId;
        this.lat = lat;
        this.lng = lng;
        this.address = address;
        this.listing_id = listing_id;
    }

    public LocationUpdateRequest() {
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
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
        this.address = address;
    }

    public int getListing_id() {
        return listing_id;
    }

    public void setListing_id(int listing_id) {
        this.listing_id = listing_id;
    }
}
