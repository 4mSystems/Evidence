package te.app.evidence.pages.places.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class PlacesByGovernResponse extends StatusMessage {
    @SerializedName("data")
    private PlacesPaginate placesPaginate;

    public PlacesPaginate getPlacesPaginate() {
        return placesPaginate;
    }
}
