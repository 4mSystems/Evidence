package grand.app.akar.pages.favorites.models;

import com.google.gson.annotations.SerializedName;

public class FavoriteRequest {
    @SerializedName("listing_id")
    private int listing_id;
    @SerializedName("type")
    private int type;

    public FavoriteRequest(int listing_id, int type) {
        this.listing_id = listing_id;
        this.type = type;
    }

    public int getListing_id() {
        return listing_id;
    }

    public void setListing_id(int listing_id) {
        this.listing_id = listing_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
