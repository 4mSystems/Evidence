package te.app.evidence.pages.home.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.mohdrs.models.ReportersData;
import te.app.evidence.pages.sessions.models.SessionItem;
import te.app.evidence.pages.sessions.models.SessionMainData;

public class HomeData {

    @SerializedName("coming_session")
    private SessionMainData comingSession;

//    @SerializedName("mohder")
//    private List<ReportersData> mohder;

    @SerializedName("previous_session")
    private SessionMainData previousSession;

    @SerializedName("count_data")
    private CountData countData;

    public SessionMainData getComingSession() {
        return comingSession;
    }

//    public List<ReportersData> getMohder() {
//        return mohder;
//    }

    public SessionMainData getPreviousSession() {
        return previousSession;
    }

    public CountData getCountData() {
        return countData;
    }
}