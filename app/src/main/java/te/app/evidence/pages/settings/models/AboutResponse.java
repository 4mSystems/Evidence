package te.app.evidence.pages.settings.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class AboutResponse extends StatusMessage {
    @SerializedName("data")
    @Expose
    private AboutData aboutData;

	public AboutData getAboutData() {
		return aboutData;
	}
}