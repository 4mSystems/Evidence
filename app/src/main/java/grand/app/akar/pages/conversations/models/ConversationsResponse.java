package grand.app.akar.pages.conversations.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import grand.app.akar.model.base.StatusMessage;

public class ConversationsResponse extends StatusMessage {
	@SerializedName("data")
	private List<ConversationsData> data;

	public List<ConversationsData> getData(){
		return data;
	}

}