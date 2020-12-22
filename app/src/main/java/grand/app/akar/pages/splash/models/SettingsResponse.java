package grand.app.akar.pages.splash.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class SettingsResponse extends StatusMessage {

    @SerializedName("data")
    private SettingData data;

    public SettingData getData() {
        return data;
    }

}