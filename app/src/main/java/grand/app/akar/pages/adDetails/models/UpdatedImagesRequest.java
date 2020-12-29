package grand.app.akar.pages.adDetails.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpdatedImagesRequest {
    @SerializedName("deleted_ids")
    private String deletedIdsList;
    @SerializedName("listing_id")
    private int listing_id;

    public UpdatedImagesRequest() {
    }

    public UpdatedImagesRequest(String deletedIdsList, int listing_id) {
        this.deletedIdsList = deletedIdsList;
        this.listing_id = listing_id;
    }

    public String getDeletedIdsList() {
        return deletedIdsList;
    }

    public void setDeletedIdsList(String deletedIdsList) {
        this.deletedIdsList = deletedIdsList;
    }

    public int getListing_id() {
        return listing_id;
    }

    public void setListing_id(int listing_id) {
        this.listing_id = listing_id;
    }
}
