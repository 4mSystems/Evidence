package te.app.evidence.pages.mohdrs.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ChangeStatusResponse extends StatusMessage {
    @SerializedName("data")
    private String status;

    public String getStatus() {
        return status;
    }
}
