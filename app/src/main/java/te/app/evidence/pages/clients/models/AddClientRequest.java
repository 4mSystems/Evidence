package te.app.evidence.pages.clients.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddClientRequest {
    @SerializedName("client_Name")
    private String client_Name;
    @SerializedName("client_Unit")
    private String client_Unit;
    @SerializedName("client_Address")
    private String client_Address;
    @SerializedName("notes")
    private String notes;
    @SerializedName("type")
    private String type;
    @SerializedName("cat_id")
    private String cat_id;
    @SerializedName("client_id")
    private String client_id;
    @SerializedName("case_id")
    private String caseId;
    private transient String catName;
    public ObservableField<String> clientNameError = new ObservableField<>();
    public ObservableField<String> clientUnitError = new ObservableField<>();
    public ObservableField<String> clientAddressError = new ObservableField<>();
    public ObservableField<String> clientNoteError = new ObservableField<>();
    public ObservableField<String> clientTypeError = new ObservableField<>();
    public ObservableField<String> clientCatError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(client_Name, Constants.FIELD)) {
            clientNameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(client_Unit, Constants.FIELD)) {
            clientUnitError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(client_Address, Constants.FIELD)) {
            clientAddressError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(type, Constants.FIELD)) {
            clientTypeError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(cat_id, Constants.FIELD)) {
            clientCatError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(notes, Constants.FIELD)) {
            clientNoteError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getClient_Name() {
        return client_Name;
    }

    public void setClient_Name(String client_Name) {
        clientNameError.set(null);
        this.client_Name = client_Name;
    }

    public String getClient_Unit() {
        return client_Unit;
    }

    public void setClient_Unit(String client_Unit) {
        clientUnitError.set(null);

        this.client_Unit = client_Unit;
    }

    public String getClient_Address() {
        return client_Address;
    }

    public void setClient_Address(String client_Address) {
        clientAddressError.set(null);
        this.client_Address = client_Address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        clientNoteError.set(null);
        this.notes = notes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        clientTypeError.set(null);
        this.type = type;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        clientCatError.set(null);
        this.cat_id = cat_id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
}
