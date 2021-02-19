package te.app.evidence.pages.cases.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddCaseRequest {
    @SerializedName("invetation_num")
    private String invetation_num;
    @SerializedName("circle_num")
    private String circle_num;
    @SerializedName("first_session_date")
    private String first_session_date;
    @SerializedName("inventation_type")
    private String inventation_type;
    @SerializedName("descion")
    private String descion;
    @SerializedName("to_whome")
    private String to_whome;
    @SerializedName("mokel_Name")
    private List<Integer> mokel_Name;
    @SerializedName("khesm_Name")
    private List<Integer> khesm_Name;
    @SerializedName("court")
    private String court;
    public ObservableField<String> invetationNumError = new ObservableField<>();
    public ObservableField<String> circleNumError = new ObservableField<>();
    public ObservableField<String> dateError = new ObservableField<>();
    public ObservableField<String> invetationTypeError = new ObservableField<>();
    public ObservableField<String> descionError = new ObservableField<>();
    public ObservableField<String> mokelError = new ObservableField<>();
    public ObservableField<String> khesmError = new ObservableField<>();
    public ObservableField<String> courtError = new ObservableField<>();
    public ObservableField<String> catError = new ObservableField<>();

    public String getInvetation_num() {
        return invetation_num;
    }

    public void setInvetation_num(String invetation_num) {
        invetationNumError.set(null);
        this.invetation_num = invetation_num;
    }

    public String getCircle_num() {
        return circle_num;
    }

    public void setCircle_num(String circle_num) {
        circleNumError.set(null);
        this.circle_num = circle_num;
    }

    public String getFirst_session_date() {
        return first_session_date;
    }

    public void setFirst_session_date(String first_session_date) {
        dateError.set(null);
        this.first_session_date = first_session_date;
    }

    public String getInventation_type() {
        return inventation_type;
    }

    public void setInventation_type(String inventation_type) {
        invetationTypeError.set(null);
        this.inventation_type = inventation_type;
    }

    public String getDescion() {
        return descion;
    }

    public void setDescion(String descion) {
        descionError.set(null);
        this.descion = descion;
    }

    public String getTo_whome() {
        return to_whome;
    }

    public void setTo_whome(String to_whome) {
        catError.set(null);
        this.to_whome = to_whome;
    }

    public List<Integer> getMokel_Name() {
        return mokel_Name;
    }

    public void setMokel_Name(List<Integer> mokel_Name) {
        mokelError.set(null);
        this.mokel_Name = mokel_Name;
    }

    public List<Integer> getKhesm_Name() {
        return khesm_Name;
    }

    public void setKhesm_Name(List<Integer> khesm_Name) {
        khesmError.set(null);
        this.khesm_Name = khesm_Name;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        courtError.set(null);
        this.court = court;
    }
}
