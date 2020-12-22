package grand.app.akar.pages.ads.itemViewModels;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.utils.Constants;

public class ItemCityViewModel extends BaseViewModel {
    public Cities cities;

    public ItemCityViewModel(Cities cities) {
        this.cities = cities;
    }

    @Bindable
    public Cities getCities() {
        return cities;
    }

    public void itemAction() {
        //TODO Item Action with liveData
        getLiveData().setValue(Constants.MENu);
    }

}
