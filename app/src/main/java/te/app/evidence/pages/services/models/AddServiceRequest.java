package te.app.evidence.pages.services.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddServiceRequest {
    @SerializedName("service_title")
    private String serviceTitle;
    @SerializedName("service_price")
    private String servicePrice;
    @SerializedName("service_desc")
    private String serviceDesc;
    @SerializedName("phone")
    private String servicePhone;
    @SerializedName("service_whats")
    private String serviceWhats;
    private transient String serviceImage;
    public ObservableField<String> serviceTitleError = new ObservableField<>();
    public ObservableField<String> servicePriceError = new ObservableField<>();
    public ObservableField<String> servicePhoneError = new ObservableField<>();
    public ObservableField<String> serviceWhatseError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(serviceTitle, Constants.FIELD)) {
            serviceTitleError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(servicePrice, Constants.FIELD)) {
            servicePriceError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(servicePhone, Constants.FIELD)) {
            servicePhoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(serviceWhats, Constants.FIELD)) {
            serviceWhatseError.set(Validate.error);
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
        serviceWhatseError.set(null);
        this.serviceWhats = serviceWhats;
    }

}
