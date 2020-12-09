package grand.app.akar.pages.notifications.itemViewModels;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.notifications.models.NotificationsData;


public class NotificationsItemViewModels extends BaseViewModel {
    private NotificationsData notificationsData;

    public NotificationsItemViewModels(NotificationsData notificationsData) {
        this.notificationsData = notificationsData;
     }


    @Bindable
    public NotificationsData getNotificationsData() {
        return notificationsData;
    }


    public void itemAction() {
        notifyChange();
     }

}
