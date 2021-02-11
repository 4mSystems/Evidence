package te.app.evidence.pages.categories.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.evidence.model.base.StatusMessage;

public class CategoriesResponse extends StatusMessage {

    @SerializedName("data")
    private List<CategoriesData> categoriesDataList;

    public List<CategoriesData> getCategoriesDataList() {
        return categoriesDataList;
    }

}