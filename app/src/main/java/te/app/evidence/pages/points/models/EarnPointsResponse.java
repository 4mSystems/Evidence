package te.app.evidence.pages.points.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class EarnPointsResponse extends StatusMessage {

	@SerializedName("data")
	private List<ReplacedPoints> data;

	public List<ReplacedPoints> getData(){
		return data;
	}

}