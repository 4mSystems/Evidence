package grand.app.akar.pages.adDetails.models;

import com.google.gson.annotations.SerializedName;


public class UpdatedImagesRequest {
    @SerializedName("listing_id")
    private int listing_id;

    public UpdatedImagesRequest() {
    }

    public UpdatedImagesRequest(int listing_id) {
        this.listing_id = listing_id;
    }

    public int getListing_id() {
        return listing_id;
    }

    public void setListing_id(int listing_id) {
        this.listing_id = listing_id;
    }
}
