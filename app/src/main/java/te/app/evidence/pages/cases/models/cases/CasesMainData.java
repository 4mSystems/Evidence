package te.app.evidence.pages.cases.models.cases;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class CasesMainData extends Paginate {
    @SerializedName("data")
    private List<Cases> cases;

    public List<Cases> getCases() {
        return cases;
    }
}
