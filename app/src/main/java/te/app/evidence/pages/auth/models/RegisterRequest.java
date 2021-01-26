package te.app.evidence.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class RegisterRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("password")
    private String password;
    private String confirmPassword;
    @SerializedName("city_id")
    private String city_id;
    @SerializedName("type")
    private String type;
    @SerializedName("firebase_token")
    private String firebase_token;
    @SerializedName("email")
    private String email;

    private int validator = 0;


    public RegisterRequest() {
    }

    public RegisterRequest(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(name)
                && !TextUtils.isEmpty(phone)
                && !TextUtils.isEmpty(password)
                && !TextUtils.isEmpty(email)
                && !TextUtils.isEmpty(type)
                && !TextUtils.isEmpty(city_id)

        );
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirebase_token() {
        return firebase_token;
    }

    public void setFirebase_token(String firebase_token) {
        this.firebase_token = firebase_token;
    }

    public boolean isUpdateValid() {
        return (!TextUtils.isEmpty(name)
                && !TextUtils.isEmpty(phone)
                && !TextUtils.isEmpty(email)
                && !TextUtils.isEmpty(type)
                && !TextUtils.isEmpty(city_id)

        );
    }

    public boolean isPasswordsValid() {
        return (!TextUtils.isEmpty(password) && !TextUtils.isEmpty(confirmPassword));
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }


}
