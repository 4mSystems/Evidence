package te.app.evidence.pages.auth.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import te.app.evidence.R;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;
import te.app.evidence.utils.validation.Validate;

public class RegisterRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("password")
    private String password;
    private String confirmPassword;
    @SerializedName("email")
    private String email;
    @SerializedName("address")
    private String address;
    @SerializedName("cat_name")
    private String catName;
    @SerializedName("invite_code")
    private String inviteCode;
    @SerializedName("device_token")
    @Expose
    private String token;
    private transient String memberShipImage;
    private transient String userImage;

    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> phoneError = new ObservableField<>();
    public transient ObservableField<String> passwordError = new ObservableField<>();
    public transient ObservableField<String> confirmError = new ObservableField<>();
    public transient ObservableField<String> emailError = new ObservableField<>();
    public transient ObservableField<String> addressError = new ObservableField<>();
    public transient ObservableField<String> catError = new ObservableField<>();
    public transient ObservableField<String> memberShipImageError = new ObservableField<>();


    public RegisterRequest() {
    }


    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(catName, Constants.FIELD)) {
            catError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(phone, Constants.PHONE_VALID)) {
            phoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(address, Constants.FIELD)) {
            addressError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(memberShipImage, Constants.FIELD)) {
            memberShipImageError.set(ResourceManager.getString(R.string.memberShipImage));
            valid = false;
        } else if (!Validate.isValid(password, Constants.FIELD)) {
            passwordError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(confirmPassword, Constants.FIELD)) {
            confirmError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        addressError.set(null);
        this.address = address;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmError.set(null);
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        nameError.set(null);
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        phoneError.set(null);
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        passwordError.set(null);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        emailError.set(null);
        this.email = email;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        catError.set(null);
        this.catName = catName;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getMemberShipImage() {
        return memberShipImage;
    }

    public void setMemberShipImage(String memberShipImage) {
        memberShipImageError.set(null);
        this.memberShipImage = memberShipImage;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserImage() {
        return userImage;
    }
}
