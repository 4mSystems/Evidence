package te.app.evidence.pages.services.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddServiceRequest {
    @SerializedName("title")
    private String serviceTitle;
    @SerializedName("price")
    private String servicePrice;
    @SerializedName("desc")
    private String serviceDesc;
    @SerializedName("phone")
    private String servicePhone;
    @SerializedName("whatsapp")
    private String serviceWhats;
    @SerializedName("time")
    private String time;
    private transient int id;

    private transient String serviceImage;
    public transient ObservableField<String> serviceTitleError = new ObservableField<>();
    public transient ObservableField<String> servicePriceError = new ObservableField<>();
    public transient ObservableField<String> servicePhoneError = new ObservableField<>();
    public transient ObservableField<String> serviceWhatsError = new ObservableField<>();
    public transient ObservableField<String> serviceTimeError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(serviceTitle, Constants.FIELD)) {
            serviceTitleError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(servicePrice, Constants.FIELD)) {
            servicePriceError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(time, Constants.FIELD)) {
            serviceTimeError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(servicePhone, Constants.FIELD)) {
            servicePhoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(serviceWhats, Constants.FIELD)) {
            serviceWhatsError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        serviceTitleError.set(null);
        this.serviceTitle = serviceTitle;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        servicePriceError.set(null);

        this.servicePrice = servicePrice;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        servicePhoneError.set(null);
        this.servicePhone = servicePhone;
    }

    public String getServiceWhats() {
        return serviceWhats;
    }

    public void setServiceWhats(String serviceWhats) {
        serviceWhatsError.set(null);
        this.serviceWhats = serviceWhats;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        serviceTimeError.set(null);
        this.time = time;
    }

    public String getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(String serviceImage) {
        this.serviceImage = serviceImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
