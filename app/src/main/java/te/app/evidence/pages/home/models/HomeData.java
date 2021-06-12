package te.app.evidence.pages.home.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.mohdrs.models.ReportersData;
import te.app.evidence.pages.sessions.models.SessionItem;

public class HomeData {

	@SerializedName("coming_session")
	private List<SessionItem> comingSession;

	@SerializedName("mohder")
	private List<ReportersData> mohder;

	@SerializedName("previous_session")
	private List<SessionItem> previousSession;

	@SerializedName("count_data")
	private CountData countData;

	public List<SessionItem> getComingSession(){
		return comingSession;
	}

	public List<ReportersData> getMohder(){
		return mohder;
	}

	public List<SessionItem> getPreviousSession(){
		return previousSession;
	}

	public CountData getCountData(){
		return countData;
	}
}