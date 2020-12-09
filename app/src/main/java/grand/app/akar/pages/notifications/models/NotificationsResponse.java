package grand.app.akar.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.akar.ResponseHeader;


public class NotificationsResponse extends ResponseHeader {
    @SerializedName("data")
    private List<NotificationsData> data;
    public void setData(List<NotificationsData> data) {
        this.data = data;
    }

    public List<NotificationsData> getData() {
        return data;
    }

}