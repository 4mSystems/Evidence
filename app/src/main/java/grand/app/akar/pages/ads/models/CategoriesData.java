package grand.app.akar.pages.ads.models;

import com.google.gson.annotations.SerializedName;

public class CategoriesData {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    private String formPage;

    public CategoriesData() {
    }

    public CategoriesData(int id, String name, String formPage) {
        this.id = id;
        this.name = name;
        this.formPage = formPage;
    }

    public String getFormPage() {
        return formPage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
