package te.app.evidence.customViews.menu;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.utils.Constants;

public class MenuViewModel extends BaseViewModel {
    public void toClients() {
        getLiveData().setValue(Constants.CLIENTS);
    }

    public void toUsers() {
        getLiveData().setValue(Constants.USERS);
    }

    public void toCategories() {
        getLiveData().setValue(Constants.CATEGORIES);
    }

    public void addCase() {
        getLiveData().setValue(Constants.ADD_CASE);
    }

    public void toReporters() {
        getLiveData().setValue(Constants.GET_MOHDAREEN);
    }

    public void changeLanguage() {
        getLiveData().setValue(Constants.LANGUAGE);
    }
}
