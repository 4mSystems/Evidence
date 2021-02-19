package te.app.evidence.pages.categories.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.evidence.model.base.StatusMessage;

public class AddCategoryResponse extends StatusMessage {

    @SerializedName("data")
    private CategoriesData categoriesData;

    public CategoriesData getCategoriesData() {
        return categoriesData;
    }
}