
package te.app.evidence.model.base;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusMessage {

    @SerializedName("msg")
    @Expose
    public String mMessage;
    @SerializedName("status")
    @Expose
    public int code;
    @SerializedName("code")
    @Expose
    public int codes;


}
