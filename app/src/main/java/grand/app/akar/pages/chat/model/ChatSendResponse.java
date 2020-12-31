package grand.app.akar.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;


public class ChatSendResponse extends StatusMessage {

    @SerializedName("data")
    @Expose
    private Chat data;

    public Chat getData() {
        return data;
    }
}
