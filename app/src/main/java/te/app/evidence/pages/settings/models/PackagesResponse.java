package te.app.evidence.pages.settings.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class PackagesResponse extends StatusMessage {

    @SerializedName("data")
    private List<Packages> packagesList;

    public List<Packages> getPackagesList() {
        return packagesList;
    }
}