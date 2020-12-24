package grand.app.akar.pages.auth.models.cities;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class CitiesResponse extends StatusMessage {

    @SerializedName("data")
    private List<Cities> citiesList;

    public List<Cities> getCitiesList() {
        return citiesList;
    }

}