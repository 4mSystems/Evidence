package te.app.evidence.pages.places.models;

import com.google.gson.annotations.SerializedName;

public class GovernmentData {

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}