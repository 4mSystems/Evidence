package te.app.evidence.pages.clients.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.cases.models.cases.Cases;
import te.app.evidence.utils.Constants;

public class ClientCasesItemViewModel extends BaseViewModel {
    public Cases cases;

    public ClientCasesItemViewModel(Cases cases) {
        this.cases = cases;
    }

    @Bindable
    public Cases getCases() {
        return cases;
    }

    public void toEdit() {
        getLiveData().setValue(Constants.EDIT);
    }

    public void toDelete() {
        getLiveData().setValue(Constants.DELETE);
    }

    public void itemAction() {
        getLiveData().setValue(Constants.CASE_DETAILS);
    }

}