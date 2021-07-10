package te.app.evidence.customViews.menu;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.utils.Constants;

public class MenuViewModel extends BaseViewModel {

    public void logout() {
        getLiveData().setValue(Constants.REMOVE_DIALOG);
    }


    public void changeLanguage() {
        getLiveData().setValue(Constants.LANGUAGE);
    }

    public void buttonAction(String action) {
        if (!action.equals(Constants.ERROR_TOAST)) {
            getLiveData().setValue(action);
        } else
            getLiveData().setValue(Constants.ERROR_TOAST);
    }
}
