package te.app.evidence.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.home.models.HomeMainObject;

public class ItemMainObjectViewModel extends BaseViewModel {
    public HomeMainObject mainObject;

    public ItemMainObjectViewModel(HomeMainObject mainObject) {
        this.mainObject = mainObject;
    }

    @Bindable
    public HomeMainObject getMainObject() {
        return mainObject;
    }

    public void buttonAction(String action) {
        getLiveData().setValue(action);
    }

}
