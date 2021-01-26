package te.app.evidence.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.customViews.menu.MenuModel;
import te.app.evidence.utils.Constants;

public class ItemHomeSliderViewModel extends BaseViewModel {
    public MenuModel menuModel;

    public ItemHomeSliderViewModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }

    @Bindable
    public MenuModel getMenuModel() {
        return menuModel;
    }

    public void itemAction() {
        //TODO Item Action with liveData
        getLiveData().setValue(Constants.MENu);
    }

}
