package te.app.evidence.pages.mohdrs.models.details;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ReporterDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private ReportersDetailsData data;

    public ReportersDetailsData getData() {
        return data;
    }

}