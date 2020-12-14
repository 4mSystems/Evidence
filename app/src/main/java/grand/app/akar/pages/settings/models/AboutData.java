package grand.app.akar.pages.settings.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AboutData {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("desc")
    @Expose
    private String desc;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}