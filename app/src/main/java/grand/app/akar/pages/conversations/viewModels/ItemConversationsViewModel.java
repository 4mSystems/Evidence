package grand.app.akar.pages.conversations.viewModels;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.utils.Constants;

public class ItemConversationsViewModel extends BaseViewModel {
    public StatusMessage homeData;

    public ItemConversationsViewModel(StatusMessage homeData) {
        this.homeData = homeData;

    }

    @Bindable
    public StatusMessage getHomeData() {
        return homeData;
    }

    public void itemAction() {
        //TODO Item Action with liveData
        getLiveData().setValue(Constants.MENu);
    }

}
