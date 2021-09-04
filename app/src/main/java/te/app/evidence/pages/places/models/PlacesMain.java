package te.app.evidence.pages.places.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlacesMain {
    @SerializedName("governments")
    private List<GovernmentData> governmentDataList;
    @SerializedName("gov_locations")
    PlacesPaginate placesPaginate;

    public List<GovernmentData> getGovernmentDataList() {
        return governmentDataList;
    }

    public PlacesPaginate getPlacesPaginate() {
        return placesPaginate;
    }
}
