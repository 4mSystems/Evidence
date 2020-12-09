package grand.app.akar.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChatRequest {

    @SerializedName("message")
    @Expose
    public String message = "";
}
