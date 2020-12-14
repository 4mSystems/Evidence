package grand.app.akar.pages.settings.models.settings;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class SettingsResponse extends StatusMessage {
	@SerializedName("data")
	private SettingsData data;
	public SettingsData getData(){
		return data;
	}
}