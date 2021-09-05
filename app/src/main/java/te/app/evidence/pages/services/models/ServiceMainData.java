package te.app.evidence.pages.services.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class ServiceMainData extends Paginate {
    @SerializedName("data")
    private List<ServiceData> serviceDataList;

    public List<ServiceData> getServiceDataList() {
        return serviceDataList;
    }
}
