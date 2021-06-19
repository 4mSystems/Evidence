package te.app.evidence.pages.mohdrs.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddMohdrResponse extends StatusMessage {
    @SerializedName("data")
    private ReportersData reportersData;

    public ReportersData getReportersData() {
        return reportersData;
    }
}
