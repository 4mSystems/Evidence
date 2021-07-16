package te.app.evidence.pages.mohdrs.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class ReportersMainData extends Paginate {
    @SerializedName("data")
    private List<ReportersData> bailiffsDataList;

    public List<ReportersData> getBailiffsDataList() {
        return bailiffsDataList;
    }
}
