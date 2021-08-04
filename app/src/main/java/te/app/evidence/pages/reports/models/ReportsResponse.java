package te.app.evidence.pages.reports.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ReportsResponse extends StatusMessage {
	@SerializedName("data")
	private ReportsMain reportsMain;

	public ReportsMain getReportsMain(){
		return reportsMain;
	}
}