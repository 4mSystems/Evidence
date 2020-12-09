package grand.app.akar.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chat {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("message")
    @Expose
    public String message = "";
    @SerializedName("type")
    @Expose
    public int type;
    @SerializedName("image")
    @Expose
    public String image = "";
    @SerializedName("time")
    @Expose
    public String time = "";
    @SerializedName("is_read")
    @Expose
    public Integer isRead;

}
