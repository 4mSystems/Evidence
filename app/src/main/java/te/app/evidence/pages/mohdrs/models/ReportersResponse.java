package te.app.evidence.pages.mohdrs.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class ReportersResponse extends StatusMessage {

	@SerializedName("data")
	private List<ReportersData> bailiffsDataList;

	public List<ReportersData> getBailiffsDataList(){
		return bailiffsDataList;
	}

}