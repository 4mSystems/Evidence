package grand.app.akar.pages.chat.viewmodel;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.home.models.DefaultImg;

public class ItemChatImagesViewModel extends BaseViewModel {
    public DefaultImg defaultImg;

    public ItemChatImagesViewModel(DefaultImg defaultImg) {
        this.defaultImg = defaultImg;

    }

    @Bindable
    public DefaultImg getDefaultImg() {
        return defaultImg;
    }

}
