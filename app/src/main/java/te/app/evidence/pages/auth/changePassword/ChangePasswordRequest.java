package te.app.evidence.pages.auth.changePassword;

import android.text.TextUtils;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class ChangePasswordRequest {
    @SerializedName("password")
    private String password;
    @SerializedName("old_password")
    private String oldPassword;
    private String confirmPassword;
    public transient ObservableField<String> passwordError = new ObservableField<>();
    public transient ObservableField<String> oldError = new ObservableField<>();
    public transient ObservableField<String> confirmError = new ObservableField<>();

    public boolean isPasswordsValid() {
        boolean valid = true;
        if (!Validate.isValid(password, Constants.FIELD)) {
            passwordError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(confirmPassword, Constants.FIELD)) {
            confirmError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean updateValid() {
        boolean valid = true;
        if (!Validate.isValid(oldPassword, Constants.FIELD)) {
            oldError.set(Validate.error);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        passwordError.set(null);
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmError.set(null);
        this.confirmPassword = confirmPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        oldError.set(null);
        this.oldPassword = oldPassword;
    }
}
