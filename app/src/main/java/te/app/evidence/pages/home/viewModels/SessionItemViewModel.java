package te.app.evidence.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.sessions.SessionItem;

public class SessionItemViewModel extends BaseViewModel {
    public SessionItem sessionItem;

    public SessionItemViewModel(SessionItem sessionItem) {
        this.sessionItem = sessionItem;
    }

    @Bindable
    public SessionItem getSessionItem() {
        return sessionItem;
    }

    public void itemAction() {
//        getLiveData().setValue(Constants.DELETE);
    }

}
