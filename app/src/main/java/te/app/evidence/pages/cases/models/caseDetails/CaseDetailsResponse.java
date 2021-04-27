package te.app.evidence.pages.cases.models.caseDetails;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class CaseDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private CaseDetails caseDetails;

    public CaseDetails getCaseDetails() {
        return caseDetails;
    }
}