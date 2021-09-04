package te.app.evidence.pages.places.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.places.models.PlacesData;
import te.app.evidence.utils.Constants;

public class ItemPlacesViewModel extends BaseViewModel {
    public PlacesData placesData;

    public ItemPlacesViewModel(PlacesData menuModel) {
        this.placesData = menuModel;
    }

    @Bindable
    public PlacesData getPlacesData() {
        return placesData;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }
}
