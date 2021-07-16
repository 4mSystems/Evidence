package te.app.evidence.pages.cases.models.cases;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.StatusMessage;

public class AllCasesResponse extends StatusMessage {

    @SerializedName("data")
    private CasesMainData data;

    public CasesMainData getData() {
        return data;
    }
}