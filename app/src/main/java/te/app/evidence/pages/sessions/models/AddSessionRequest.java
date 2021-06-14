package te.app.evidence.pages.sessions.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddSessionRequest {
    @SerializedName("case_Id")
    private String caseId;
    @SerializedName("session_date")
    private String sessionDate;
    @SerializedName("session_id")
    private String sessionId;

    public ObservableField<String> dateError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(sessionDate, Constants.FIELD)) {
            dateError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        dateError.set(null);
        this.sessionDate = sessionDate;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
