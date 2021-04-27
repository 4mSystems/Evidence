package te.app.evidence.pages.cases.models.caseDetails;

import com.google.gson.annotations.SerializedName;

public class CaseStatistics {

	@SerializedName("attachments_number")
	private String attachmentsNumber;

	@SerializedName("notes_number")
	private String notesNumber;

	@SerializedName("sessions_number")
	private String sessionsNumber;

	public String getAttachmentsNumber(){
		return attachmentsNumber;
	}

	public String getNotesNumber(){
		return notesNumber;
	}

	public String getSessionsNumber(){
		return sessionsNumber;
	}
}