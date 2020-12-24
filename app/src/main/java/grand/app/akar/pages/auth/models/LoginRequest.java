package grand.app.akar.pages.auth.models;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRequest {
    @SerializedName("loginkey")
    @Expose
    private String loginkey;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("firebase_token")
    @Expose
    private String token;
    private int validator = 0;

    public String getLoginkey() {
        return loginkey;
    }

    public void setLoginkey(String loginkey) {
        this.loginkey = loginkey;
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


    public boolean isValid() {
        return (!TextUtils.isEmpty(loginkey) && !TextUtils.isEmpty(password));
    }


    public void setValidator(int validator) {
        this.validator = validator;
    }


    public int getValidator() {
        return validator;
    }


    public boolean validate() {
        Log.e("validator", " Validatorz " + validator);
        return validator == 2;
    }
}
