package grand.app.akar.pages.adDetails.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.pages.home.models.HomeData;

public class AdDetailsData {

    @SerializedName("related_listings")
    private List<HomeData> relatedListings;

    @SerializedName("listing")
    private HomeData listing;

    public List<HomeData> getRelatedListings() {
        return relatedListings;
    }

    public HomeData getListing() {
        return listing;
    }
}