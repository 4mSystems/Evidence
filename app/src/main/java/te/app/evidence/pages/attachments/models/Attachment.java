package te.app.evidence.pages.attachments.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.URLS;

public class Attachment {

    @SerializedName("img_Description")
    private String imgDescription;

    @SerializedName("img_Url")
    private String imgUrl;
    @SerializedName("type")
    private String fileType;

    @SerializedName("id")
    private int id;

    public String getImgDescription() {
        return imgDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getFileType() {
        return fileType;
    }

    public int getId() {
        return id;
    }
}