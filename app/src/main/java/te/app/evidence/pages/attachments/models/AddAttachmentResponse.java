package te.app.evidence.pages.attachments.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddAttachmentResponse extends StatusMessage {
    @SerializedName("data")
    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }
}
