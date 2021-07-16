package te.app.evidence.pages.mohdrs.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ReportersResponse extends StatusMessage {

    @SerializedName("data")
    private ReportersMainData mainData;

    public ReportersMainData getMainData() {
        return mainData;
    }
}