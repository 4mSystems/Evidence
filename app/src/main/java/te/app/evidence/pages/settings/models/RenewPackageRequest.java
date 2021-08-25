package te.app.evidence.pages.settings.models;

import com.google.gson.annotations.SerializedName;

public class RenewPackageRequest {
    @SerializedName("package_id")
    private int packageId;
    @SerializedName("type")
    private int type;

    public RenewPackageRequest(int packageId, int type) {
        this.packageId = packageId;
        this.type = type;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
