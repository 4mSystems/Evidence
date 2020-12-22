package grand.app.akar.base.maps;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CurrentAddressModel implements Serializable {
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;
    @SerializedName("address")
    private String userAddress;

    public CurrentAddressModel() {
    }

    public CurrentAddressModel(double lat, double lng, String userAddress) {
        this.lat = lat;
        this.lng = lng;
        this.userAddress = userAddress;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
