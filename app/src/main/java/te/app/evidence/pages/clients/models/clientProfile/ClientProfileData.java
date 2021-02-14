package te.app.evidence.pages.clients.models.clientProfile;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.notes.models.Notes;

public class ClientProfileData {

	@SerializedName("cases")
	private List<Cases> cases;

	@SerializedName("id")
	private int id;

	@SerializedName("client_notes")
	private List<Notes> clientNotes;

	public List<Cases> getCases(){
		return cases;
	}

	public int getId(){
		return id;
	}

	public List<Notes> getClientNotes(){
		return clientNotes;
	}
}