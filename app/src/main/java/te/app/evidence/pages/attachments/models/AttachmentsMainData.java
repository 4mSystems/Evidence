package te.app.evidence.pages.attachments.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class AttachmentsMainData extends Paginate {
    @SerializedName("data")
    private List<Attachment> attachmentList;

    public List<Attachment> getAttachmentList() {
        return attachmentList;
    }
}
