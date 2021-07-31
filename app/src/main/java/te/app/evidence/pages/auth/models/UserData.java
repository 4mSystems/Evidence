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

    public String getImage() {
        return URLS.USER_PROFILE_BASE_URL.concat(image);
    }

    public String getAddress() {
        return address;
    }

    public String getApiToken() {
        return apiToken;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Object getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getType() {
        return type;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getPhone() {
        return phone;
    }

    public Object getParentId() {
        return parentId;
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
}