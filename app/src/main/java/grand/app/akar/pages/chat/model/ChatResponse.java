package grand.app.akar.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.akar.model.base.StatusMessage;


public class ChatResponse extends StatusMessage {
    @SerializedName("data")
    @Expose
    private List<Chat> chats;

    public List<Chat> getChats() {
        return chats;
    }
}
