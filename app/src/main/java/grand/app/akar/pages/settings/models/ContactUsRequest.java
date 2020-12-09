package grand.app.akar.pages.settings.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class ContactUsRequest {
    @SerializedName("type")
    private int type;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("message")
    private String message;

    public boolean isValid() {
        return (!TextUtils.isEmpty(name) & !TextUtils.isEmpty(email) & !TextUtils.isEmpty(phone) & !TextUtils.isEmpty(message));
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
