package te.app.evidence.pages.publicFiles.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.publicFiles.models.PublicFilesData;
import te.app.evidence.utils.Constants;

public class ItemFilesViewModel extends BaseViewModel {
    public PublicFilesData publicFilesData;

    public ItemFilesViewModel(PublicFilesData publicFilesData) {
        this.publicFilesData = publicFilesData;
    }

    @Bindable
    public PublicFilesData getPublicFilesData() {
        return publicFilesData;
    }

    public void action() {
        getLiveData().setValue(Constants.MENu);
    }
}
