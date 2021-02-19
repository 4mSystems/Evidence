package te.app.evidence.pages.reporters.models;

import com.google.gson.annotations.SerializedName;

public class ReportersData {

	@SerializedName("mokel_Name")
	private String mokelName;

	@SerializedName("session_Date")
	private String sessionDate;

	@SerializedName("moh_Id")
	private int mohId;

	@SerializedName("paper_Number")
	private String paperNumber;

	@SerializedName("khesm_Name")
	private String khesmName;

	@SerializedName("status")
	private String status;

	public String getMokelName(){
		return mokelName;
	}

	public String getSessionDate(){
		return sessionDate;
	}

	public int getMohId(){
		return mohId;
	}

	public String getPaperNumber(){
		return paperNumber;
	}

	public String getKhesmName(){
		return khesmName;
	}

	public String getStatus(){
		return status;
	}
}