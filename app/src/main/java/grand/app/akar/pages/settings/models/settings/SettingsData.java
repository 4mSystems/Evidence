package grand.app.akar.pages.settings.models.settings;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.akar.pages.ads.models.CategoriesData;

public class SettingsData {

    @SerializedName("second_phone")
    private String secondPhone;

    @SerializedName("lng")
    private String lng;

    @SerializedName("phone")
    private String phone;

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;

    @SerializedName("lat")
    private String lat;
    @SerializedName("categories")
    private List<CategoriesData> categoriesDataList;

    public List<CategoriesData> getCategoriesDataList() {
        return categoriesDataList;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public String getLng() {
        return lng;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLat() {
        return lat;
    }
}