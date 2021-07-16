package te.app.evidence.pages.attachments.models;


import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AttachmentsResponse extends StatusMessage {

    @SerializedName("data")
    private AttachmentsMainData mainData;

    public AttachmentsMainData getMainData() {
        return mainData;
    }
}