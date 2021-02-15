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
}
