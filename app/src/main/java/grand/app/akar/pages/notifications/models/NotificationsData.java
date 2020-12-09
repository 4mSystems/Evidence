package grand.app.akar.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

public class NotificationsData {

    @SerializedName("created_at")
    private String created_at;

    @SerializedName("body")
    private String body;

    @SerializedName("title")
    private String title;
    @SerializedName("id")
    private int id;

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}