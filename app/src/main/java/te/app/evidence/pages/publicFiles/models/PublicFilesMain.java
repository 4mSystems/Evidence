package te.app.evidence.pages.publicFiles.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class PublicFilesMain extends Paginate {
    @SerializedName("data")
    private List<PublicFilesData> publicFilesData;
    public List<PublicFilesData> getPublicFilesData(){
        return publicFilesData;
    }

}
