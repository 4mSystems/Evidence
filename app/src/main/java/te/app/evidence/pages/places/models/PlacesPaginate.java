package te.app.evidence.pages.places.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class PlacesPaginate extends Paginate {
    @SerializedName("data")
    private List<PlacesData> placesData;

    public List<PlacesData> getPlacesData() {
        return placesData;
    }
}
