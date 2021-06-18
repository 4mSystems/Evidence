package te.app.evidence.pages.attachments.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AttachmentsResponse extends StatusMessage {

    @SerializedName("data")
    private List<Attachment> attachmentList;

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }

}