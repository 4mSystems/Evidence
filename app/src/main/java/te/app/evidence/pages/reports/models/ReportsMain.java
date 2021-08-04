package te.app.evidence.pages.reports.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.Paginate;

public class ReportsMain extends Paginate {

	@SerializedName("data")
	private List<ReportsData> reportsDataList;

	public List<ReportsData> getReportsDataList(){
		return reportsDataList;
	}

}