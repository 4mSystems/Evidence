package te.app.evidence.pages.clients.notes.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.pages.auth.models.UserData;

public class Notes {
    @SerializedName("note")
    private String notes;

    @SerializedName("status")
    private String status;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("id")
    private int id;

    @SerializedName("user")
    private UserData user;

    @SerializedName("client_id")
    private String clientId;
    private String whoNotes;

    public String getNotes() {
        return notes;
    }

    public String getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public UserData getUser() {
        return user;
    }

    public String getClientId() {
        return clientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWhoNotes() {
        return whoNotes;
    }

    public void setWhoNotes(String whoNotes) {
        this.whoNotes = whoNotes;
    }
}