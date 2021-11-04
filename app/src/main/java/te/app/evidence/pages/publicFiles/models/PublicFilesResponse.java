package te.app.evidence.pages.publicFiles.models;


import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class PublicFilesResponse extends StatusMessage {
    @SerializedName("data")
    private PublicFilesMain publicFilesMain;

    public PublicFilesMain getPublicFilesMain() {
        return publicFilesMain;
    }
}