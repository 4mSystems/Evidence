package grand.app.akar.pages.home.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeMainData {
    @SerializedName("files_completed")
    private int files_completed;
    @SerializedName("shops")
    private List<HomeData> homeDataList;

    public int getFiles_completed() {
        return files_completed;
    }

    public List<HomeData> getHomeDataList() {
        return homeDataList;
    }
}
