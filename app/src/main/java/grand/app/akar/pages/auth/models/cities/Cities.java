package grand.app.akar.pages.auth.models.cities;

import com.google.gson.annotations.SerializedName;

public class Cities {
    @SerializedName("name")
    private String name;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;

    @SerializedName("id")
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}