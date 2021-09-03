package te.app.evidence.pages.services.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.places.models.PlacesData;

public class ItemServicesViewModel extends BaseViewModel {
    public PlacesData placesData;

    public ItemServicesViewModel(PlacesData menuModel) {
        this.placesData = menuModel;
    }

    @Bindable
    public PlacesData getAgentData() {
        return placesData;
    }

}
