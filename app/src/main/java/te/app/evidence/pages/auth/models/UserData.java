package te.app.evidence.pages.auth.models;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.URLS;

public class UserData {

    @SerializedName("image")
    private String image;

    @SerializedName("address")
    private String address;

    @SerializedName("api_token")
    private String apiToken;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("email_verified_at")
    private Object emailVerifiedAt;

    @SerializedName("package_id")
    private String packageId;

    @SerializedName("type")
    private String type;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("phone")
    private String phone;

    @SerializedName("parent_id")
    private Object parentId;

    @SerializedName("cat_id")
    private String catId;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;

    @SerializedName("status")
    private String status;
    @SerializedName("warning_date")
    private String warning_date;
    @SerializedName("expiry_date")
    private String expiry_date;
    @SerializedName("expiry_package")
    private String expiry_package;
    @SerializedName("package_name")
    private String packageName;
    @SerializedName("my_points")
    private String my_points;
    @SerializedName("user_code")
    private String user_code;

    public String getImage() {
        return URLS.USER_PROFILE_BASE_URL.concat(image);
    }

    public String getApiToken() {
        return apiToken;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getType() {
        return type;
    }

    public String getPhone() {
        return phone;
    }

    public String getCatId() {
        return catId;
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

    public String getStatus() {
        return status;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public String getExpiry_package() {
        return expiry_package;
    }

    public String getMy_points() {
        return my_points;
    }

    public String getPackageName() {
        return packageName;
    }
}