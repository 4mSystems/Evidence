package te.app.evidence.pages.users.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class UsersMainData extends Paginate {
    @SerializedName("data")
    private List<SystemUserData> systemUserDataList;

    public List<SystemUserData> getSystemUserDataList() {
        return systemUserDataList;
    }

}
