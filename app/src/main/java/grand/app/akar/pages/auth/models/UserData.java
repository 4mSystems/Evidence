package grand.app.akar.pages.auth.models;

import com.google.gson.annotations.SerializedName;

public class UserData {
    @SerializedName("suspend")
    private int suspend;

    @SerializedName("wallet_flag")
    private int walletFlag;

    @SerializedName("image")
    private String image;

    @SerializedName("wallet")
    private double wallet;

    @SerializedName("lng")
    private String lng;

    @SerializedName("jwt")
    private String jwt;

    @SerializedName("verified")
    private int verified;

    @SerializedName("active")
    private int active;

    @SerializedName("promo_code")
    private String promoCode;

    @SerializedName("token")
    private String token;

    @SerializedName("points")
    private int points;
    @SerializedName("near_orders")
    private boolean near_orders;

    @SerializedName("user_code")
    private String userCode;

    @SerializedName("phone")
    private String phone;

    @SerializedName("f_name")
    private String name;
    @SerializedName("name")
    private String orderUserName;

    @SerializedName("l_name")
    private String last_name;

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;

    @SerializedName("country_id")
    private int countryId;

    @SerializedName("lat")
    private String lat;
    @SerializedName("rate")
    private String rate;

    public int getSuspend() {
        return suspend;
    }

    public int getWalletFlag() {
        return walletFlag;
    }

    public String getImage() {
        return image;
    }

    public double getWallet() {
        return wallet;
    }

    public String getLng() {
        return lng;
    }

    public String getJwt() {
        return jwt;
    }

    public int getVerified() {
        return verified;
    }

    public int getActive() {
        return active;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public String getToken() {
        return token;
    }

    public int getPoints() {
        return points;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getCountryId() {
        return countryId;
    }

    public Object getLat() {
        return lat;
    }

    public String getRate() {
        return rate;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public boolean getNear_orders() {
        return near_orders;
    }
}