package te.app.evidence.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class UserPackage {
    @SerializedName("package_id")
    private int packageId;
    @SerializedName("warning_date")
    private String warningDate;
    @SerializedName("expiry_date")
    private String expiryDate;
    @SerializedName("expiry_package")
    private String expiryPackage;

    public int getPackageId() {
        return packageId;
    }

    public String getWarningDate() {
        return warningDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getExpiryPackage() {
        return expiryPackage;
    }
}
