package grand.app.akar.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRequest {
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("token")
    @Expose
    private String token;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private static final String TAG = "LoginRequest";

    public boolean isValid() {
        return (!TextUtils.isEmpty(phone));
    }

    public boolean isPasswordValid() {
        return (!TextUtils.isEmpty(password) && !TextUtils.isEmpty(token));
    }
}
