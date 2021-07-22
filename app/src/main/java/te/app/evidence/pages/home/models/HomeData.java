package te.app.evidence.pages.home.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.mohdrs.models.ReportersMainData;
import te.app.evidence.pages.sessions.models.SessionMainData;

public class HomeData {

    @SerializedName("coming_session")
    private SessionMainData comingSession;

    @SerializedName("mohder")
    private ReportersMainData reportersMainData;
    @SerializedName("previous_session")
    private SessionMainData previousSession;

    @SerializedName("count_data")
    private CountData countData;

    public SessionMainData getComingSession() {
        return comingSession;
    }

    public ReportersMainData getReportersMainData() {
        return reportersMainData;
    }

    public SessionMainData getPreviousSession() {
        return previousSession;
    }

    public CountData getCountData() {
        return countData;
    }
}