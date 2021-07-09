package te.app.evidence.pages.mohdrs.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.utils.Constants;
import te.app.evidence.utils.validation.Validate;

public class AddMohdrRequest {
    @SerializedName("court_mohdareen")
    private String courtMohdareen;
    @SerializedName("paper_type")
    private String paperType;
    @SerializedName("deliver_data")
    private String deliverData;
    @SerializedName("paper_Number")
    private String paperNumber;
    @SerializedName("session_Date")
    private String sessionDate;
    @SerializedName("mokel_Name")
    private String mokelName;
    @SerializedName("khesm_Name")
    private String khesmName;
    @SerializedName("case_number")
    private String casenumber;
    @SerializedName("cat_id")
    private String catid;
    @SerializedName("notes")
    private String notes;
    private String mokelText;
    private String khesmText;
    public transient ObservableField<String> invetationNumError = new ObservableField<>();
    public transient ObservableField<String> dateError = new ObservableField<>();
    public transient ObservableField<String> descionError = new ObservableField<>();
    public transient ObservableField<String> mokelError = new ObservableField<>();
    public transient ObservableField<String> khesmError = new ObservableField<>();
    public transient ObservableField<String> courtError = new ObservableField<>();
    public transient ObservableField<String> paperTypeError = new ObservableField<>();
    public transient ObservableField<String> deliverDateError = new ObservableField<>();
    public transient ObservableField<String> paperNumberError = new ObservableField<>();
    public transient ObservableField<String> catError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(courtMohdareen, Constants.FIELD)) {
            courtError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(paperType, Constants.FIELD)) {
            paperTypeError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(deliverData, Constants.FIELD)) {
            deliverDateError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(paperNumber, Constants.FIELD)) {
            paperNumberError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(sessionDate, Constants.FIELD)) {
            dateError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(mokelText, Constants.FIELD)) {
            mokelError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(khesmText, Constants.FIELD)) {
            khesmError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(casenumber, Constants.FIELD)) {
            invetationNumError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(catid, Constants.FIELD)) {
            catError.set(Validate.error);
            valid = false;
        }
        return valid;
    }


    public String getCourtMohdareen() {
        return courtMohdareen;
    }

    public void setCourtMohdareen(String courtMohdareen) {
        courtError.set(null);
        this.courtMohdareen = courtMohdareen;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        paperTypeError.set(null);
        this.paperType = paperType;
    }

    public String getDeliverData() {
        return deliverData;
    }

    public void setDeliverData(String deliverData) {
        deliverDateError.set(null);
        this.deliverData = deliverData;
    }

    public String getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(String paperNumber) {
        paperNumberError.set(null);
        this.paperNumber = paperNumber;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        dateError.set(null);
        this.sessionDate = sessionDate;
    }

    public String getMokelName() {
        return mokelName;
    }

    public void setMokelName(String mokelName) {
        this.mokelName = mokelName;
    }

    public String getKhesmName() {
        return khesmName;
    }

    public void setKhesmName(String khesmName) {
        this.khesmName = khesmName;
    }

    public String getCasenumber() {
        return casenumber;
    }

    public void setCasenumber(String casenumber) {
        invetationNumError.set(null);
        this.casenumber = casenumber;
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        catError.set(null);
        this.catid = catid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        descionError.set(null);
        this.notes = notes;
    }

    public String getMokelText() {
        return mokelText;
    }

    public void setMokelText(String mokelText) {
        mokelError.set(null);
        this.mokelText = mokelText;
    }

    public String getKhesmText() {
        return khesmText;
    }

    public void setKhesmText(String khesmText) {
        khesmError.set(null);
        this.khesmText = khesmText;
    }

}
