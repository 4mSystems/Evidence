package grand.app.akar.pages.settings.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AboutData {

    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("name")
    @Expose
    private String name;

    public String getBody() {
        return body;
    }

    public String getName() {
        return name;
    }
}