package grand.app.akar.pages.onBoard.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OnBoard {

    @SerializedName("img")
    @Expose
    private String image;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("desc")
    @Expose
    private String desc;

    @SerializedName("type")
    @Expose
    private int type;
    @SerializedName("id")
    @Expose
    private int id;

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}