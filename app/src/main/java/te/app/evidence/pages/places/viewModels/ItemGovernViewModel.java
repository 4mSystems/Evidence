package te.app.evidence.pages.places.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.places.models.GovernmentData;
import te.app.evidence.utils.Constants;

public class ItemGovernViewModel extends BaseViewModel {
    public GovernmentData governmentData;

    public ItemGovernViewModel(GovernmentData governmentData) {
        this.governmentData = governmentData;
    }

    @Bindable
    public GovernmentData getGovernmentData() {
        return governmentData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }
}
