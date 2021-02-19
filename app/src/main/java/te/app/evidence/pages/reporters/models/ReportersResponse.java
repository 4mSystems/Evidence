package te.app.evidence.pages.reporters.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ReportersResponse extends StatusMessage {

	@SerializedName("data")
	private List<ReportersData> data;

	public List<ReportersData> getData(){
		return data;
	}

}