package te.app.evidence.pages.auth.models;



import androidx.databinding.ObservableField;
import com.google.gson.annotations.SerializedName;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class LoginRequest {
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("device_token")
    private String token;
    public transient ObservableField<String> emailError = new ObservableField<>();
    public transient ObservableField<String> passwordError = new ObservableField<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        emailError.set(null);
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        passwordError.set(null);
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(password, Constants.FIELD)) {
            passwordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

}
