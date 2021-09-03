package te.app.evidence.pages.places.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.places.models.PlacesData;

public class ItemPlacesViewModel extends BaseViewModel {
    public PlacesData placesData;

    public ItemPlacesViewModel(PlacesData menuModel) {
        this.placesData = menuModel;
    }

    @Bindable
    public PlacesData getAgentData() {
        return placesData;
    }

}