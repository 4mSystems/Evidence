package te.app.evidence.pages.categories.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddCategoryRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String id;
    public ObservableField<String> userNameError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            userNameError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        userNameError.set(null);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
