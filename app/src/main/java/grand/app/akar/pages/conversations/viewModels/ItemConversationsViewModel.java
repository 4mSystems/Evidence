package grand.app.akar.pages.conversations.viewModels;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.conversations.models.ConversationsData;
import grand.app.akar.utils.Constants;

public class ItemConversationsViewModel extends BaseViewModel {
    public ConversationsData conversationsData;

    public ItemConversationsViewModel(ConversationsData conversationsData) {
        this.conversationsData = conversationsData;

    }

    @Bindable
    public ConversationsData getConversationsData() {
        return conversationsData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
