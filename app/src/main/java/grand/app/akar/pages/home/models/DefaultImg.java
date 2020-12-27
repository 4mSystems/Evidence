package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class DefaultImg {
    @SerializedName("id")
    private int id;
    @SerializedName("media")
    private String media;
    @SerializedName("type")
    private int type;
    @SerializedName("listing_id")
    private int listing_id;

    public int getId() {
        return id;
    }

    public String getMedia() {
        return media;
    }

    public int getType() {
        return type;
    }

    public int getListing_id() {
        return listing_id;
    }
}
