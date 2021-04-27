package te.app.evidence.pages.cases.models.cases;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AddCaseResponse extends StatusMessage {

    @SerializedName("data")
    private Cases data;

    public Cases getData() {
        return data;
    }
}