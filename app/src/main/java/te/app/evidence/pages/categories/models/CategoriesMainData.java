package te.app.evidence.pages.categories.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.Paginate;

public class CategoriesMainData extends Paginate {
    @SerializedName("data")
    private List<CategoriesData> categoriesDataList;

    public List<CategoriesData> getCategoriesDataList() {
        return categoriesDataList;
    }

}
