package te.app.evidence.pages.categories.models;


import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class CategoriesResponse extends StatusMessage {
    @SerializedName("data")
    private CategoriesMainData mainData;

    public CategoriesMainData getMainData() {
        return mainData;
    }
}