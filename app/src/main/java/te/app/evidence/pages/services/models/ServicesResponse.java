package te.app.evidence.pages.services.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ServicesResponse extends StatusMessage {
    @SerializedName("data")
    private ServiceMainData serviceMainData;

    public ServiceMainData getServiceMainData() {
        return serviceMainData;
    }
}
