package grand.app.akar.pages.ads.itemViewModels;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.ads.models.CategoriesData;
import grand.app.akar.utils.Constants;

public class ItemCategoryViewModel extends BaseViewModel {
    public CategoriesData categoriesData;

    public ItemCategoryViewModel(CategoriesData categoriesData) {
        this.categoriesData = categoriesData;
    }

    @Bindable
    public CategoriesData getCategoriesData() {
        return categoriesData;
    }

    public void itemAction() {
        //TODO Item Action with liveData
        getLiveData().setValue(Constants.MENu);
    }

}
