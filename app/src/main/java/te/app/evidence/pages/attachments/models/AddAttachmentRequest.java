package te.app.evidence.pages.attachments.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddAttachmentRequest {
    @SerializedName("img_Description")
    private String desc;
    @SerializedName("client_id")
    private String clientId;
    @SerializedName("case_Id")
    private String caseId;
    private transient String image;
    public ObservableField<String> descError = new ObservableField<>();
    public ObservableField<String> fileError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(image, Constants.FIELD)) {
            fileError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(desc, Constants.FIELD)) {
            descError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        descError.set(null);
        this.desc = desc;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        fileError.set(null);
        this.image = image;
    }
}
