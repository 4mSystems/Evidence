package grand.app.akar.pages.auth.models;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.annotations.SerializedName;

public class RegisterRequest {
    @SerializedName("f_name")
    private String name;
    @SerializedName("l_name")
    private String l_name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("password")
    private String password;
    private String confirmPassword;
    @SerializedName("country_id")
    private int country_id;
    @SerializedName("city_id")
    private int city_id;
    @SerializedName("token")
    private String token;
    @SerializedName("email")
    private String email;
    @SerializedName("national_id_type")
    private String national_id_type;
    @SerializedName("national_id")
    private String national_id;
    @SerializedName("car_num")
    private String car_num;
    @SerializedName("car_text")
    private String car_text;
    @SerializedName("car_level")
    private int car_level;
    @SerializedName("bank_name")
    private String bank_name;
    @SerializedName("bank_account_name")
    private String bank_account_name;
    @SerializedName("bank_account_num")
    private String bank_account_num;
    @SerializedName("near_orders")
    private int near_orders;
    private String user_image;

    private int validator = 0;



    public RegisterRequest(int near_orders) {
        this.near_orders = near_orders;
    }

    public RegisterRequest() {
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(name)
                && !TextUtils.isEmpty(l_name)
                && !TextUtils.isEmpty(phone)
                && !TextUtils.isEmpty(password)
                && !TextUtils.isEmpty(token)
                && !TextUtils.isEmpty(bank_account_num)
                && !TextUtils.isEmpty(bank_account_name)
                && !TextUtils.isEmpty(bank_account_name)
                && !TextUtils.isEmpty(bank_name)
                && !TextUtils.isEmpty(car_text)
                && !TextUtils.isEmpty(car_num)
                && !TextUtils.isEmpty(national_id)
                && !TextUtils.isEmpty(national_id_type)
                && !TextUtils.isEmpty(car_num)
                && country_id != 0
                && city_id != 0
                && car_level != 0
        );
    }

    public boolean isUpdateValid() {
        return (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(phone));
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

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
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

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getNational_id_type() {
        return national_id_type;
    }

    public void setNational_id_type(String national_id_type) {
        this.national_id_type = national_id_type;
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getCar_num() {
        return car_num;
    }

    public void setCar_num(String car_num) {
        this.car_num = car_num;
    }

    public String getCar_text() {
        return car_text;
    }

    public void setCar_text(String car_text) {
        this.car_text = car_text;
    }

    public int getCar_level() {
        return car_level;
    }

    public void setCar_level(int car_level) {
        this.car_level = car_level;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_account_name() {
        return bank_account_name;
    }

    public void setBank_account_name(String bank_account_name) {
        this.bank_account_name = bank_account_name;
    }

    public String getBank_account_num() {
        return bank_account_num;
    }

    public void setBank_account_num(String bank_account_num) {
        this.bank_account_num = bank_account_num;
    }

    public int getNear_orders() {
        return near_orders;
    }

    public void setNear_orders(int near_orders) {
        this.near_orders = near_orders;
    }


    public void setValidator(int validator) {
        this.validator = validator;
    }

    public int getValidator() {
        Log.e("VAlidator request", validator+"");
        return validator;
    }

    public boolean validate() {
        return validator == 1;
    }


}
