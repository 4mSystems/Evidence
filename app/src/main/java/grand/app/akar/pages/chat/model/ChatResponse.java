package grand.app.akar.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.akar.model.base.StatusMessage;


public class ChatResponse extends StatusMessage {
    @SerializedName("chats")
    @Expose
    public List<Chat> chats = null;

    @SerializedName("message_count")
    @Expose
    public int messageCount;
}
