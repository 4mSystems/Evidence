package te.app.evidence.pages.categories.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.utils.Constants;

public class CategoriesItemViewModel extends BaseViewModel {
    public CategoriesData categoriesData;

    public CategoriesItemViewModel(CategoriesData qualificationsItem) {
        this.categoriesData = qualificationsItem;
    }

    @Bindable
    public CategoriesData getCategoriesData() {
        return categoriesData;
    }

    public void toEdit() {
        getLiveData().setValue(Constants.EDIT);
    }

    public void toDelete() {
        getLiveData().setValue(Constants.DELETE);
    }

}
