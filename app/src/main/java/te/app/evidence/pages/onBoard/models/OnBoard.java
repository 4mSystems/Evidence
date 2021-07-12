package te.app.evidence.pages.onBoard.models;

import android.graphics.drawable.Drawable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OnBoard {

    @SerializedName("img")
    @Expose
    private int image;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("id")
    @Expose
    private int id;

    public OnBoard(int image, String title, String desc, int id) {
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.id = id;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getId() {
        return id;
    }
}