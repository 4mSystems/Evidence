package te.app.evidence.pages.settings.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.settings.models.Packages;
import te.app.evidence.utils.Constants;

public class ItemPackagesViewModel extends BaseViewModel {
    public Packages packages;

    public ItemPackagesViewModel(Packages packages) {
        this.packages = packages;
    }

    @Bindable
    public Packages getReportsData() {
        return packages;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.PACKAGES);
    }
}
