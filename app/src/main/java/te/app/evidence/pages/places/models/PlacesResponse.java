package te.app.evidence.pages.places.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.StatusMessage;


public class PlacesResponse extends StatusMessage {

    @SerializedName("data")
    private List<PlacesData> data;

    public List<PlacesData> getData() {
        return data;
    }
}