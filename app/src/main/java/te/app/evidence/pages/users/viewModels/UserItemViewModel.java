package te.app.evidence.pages.users.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.users.models.SystemUserData;
import te.app.evidence.utils.Constants;

public class UserItemViewModel extends BaseViewModel {
    public SystemUserData systemUserData;

    public UserItemViewModel(SystemUserData qualificationsItem) {
        this.systemUserData = qualificationsItem;
    }

    @Bindable
    public SystemUserData getSystemUserData() {
        return systemUserData;
    }

    public void toEdit() {
        getLiveData().setValue(Constants.EDIT);
    }

    public void toDelete() {
        getLiveData().setValue(Constants.DELETE);
    }
    public void toUserPermission() {
        getLiveData().setValue(Constants.USER_PERMISSION);
    }

}
