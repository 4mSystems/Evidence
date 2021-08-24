package te.app.evidence.pages.settings.models;

import com.google.gson.annotations.SerializedName;

public class Packages {

    @SerializedName("duration")
    private String duration;

    @SerializedName("cost")
    private String cost;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;
    @SerializedName("renew_points")
    private String renew_points;

    @SerializedName("id")
    private int id;

    public String getDuration() {
        return duration;
    }

    public String getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getRenew_points() {
        return renew_points;
    }
}