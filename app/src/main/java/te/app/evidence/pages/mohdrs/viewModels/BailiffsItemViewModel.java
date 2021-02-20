package te.app.evidence.pages.mohdrs.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.mohdrs.models.ReportersData;
import te.app.evidence.utils.Constants;

public class BailiffsItemViewModel extends BaseViewModel {
    public ReportersData bailiffsData;

    public BailiffsItemViewModel(ReportersData bailiffsData) {
        this.bailiffsData = bailiffsData;
    }

    @Bindable
    public ReportersData getBailiffsData() {
        return bailiffsData;
    }

    public void changeStatus() {
        getLiveData().setValue(Constants.CHANGE_STATUS);
    }

    public void delete() {
        getLiveData().setValue(Constants.DELETE);
    }

    public void view() {
        getLiveData().setValue(Constants.VIEW);
    }

}
