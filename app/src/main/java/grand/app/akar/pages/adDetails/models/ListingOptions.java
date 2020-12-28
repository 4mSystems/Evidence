package grand.app.akar.pages.adDetails.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ListingOptions {

    @SerializedName("listing_id")
    private int listingId;

    @SerializedName("furniture")
    private int furniture;

    @SerializedName("garage")
    private int garage;

    @SerializedName("lift")
    private int lift;

    @SerializedName("id")
    private int id;

    @SerializedName("front_no")
    private int frontNo;

    @SerializedName("services")
    private List<String> services;

    @SerializedName("street_width")
    private int streetWidth;

    @SerializedName("swimming_pool")
    private int swimmingPool;

    @SerializedName("desc")
    private String desc;

    public int getListingId() {
        return listingId;
    }

    public int getFurniture() {
        return furniture;
    }

    public int getGarage() {
        return garage;
    }

    public int getLift() {
        return lift;
    }

    public int getId() {
        return id;
    }

    public int getFrontNo() {
        return frontNo;
    }

    public List<String> getServices() {
        return services;
    }

    public int getStreetWidth() {
        return streetWidth;
    }

    public int getSwimmingPool() {
        return swimmingPool;
    }

    public String getDesc() {
        return desc;
    }
}