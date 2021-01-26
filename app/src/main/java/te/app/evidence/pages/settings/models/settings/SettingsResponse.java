package te.app.evidence.pages.settings.models.settings;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class SettingsResponse extends StatusMessage {
	@SerializedName("data")
	private SettingsData data;
	public SettingsData getData(){
		return data;
	}
}