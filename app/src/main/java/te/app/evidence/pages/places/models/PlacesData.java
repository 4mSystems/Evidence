package te.app.evidence.pages.places.models;

import com.google.gson.annotations.SerializedName;

public class PlacesData {

    @SerializedName("lat")
    private String lat;
    @SerializedName("long")
    private String lng;

    @SerializedName("address")
    private String address;

    @SerializedName("type")
    private String type;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}