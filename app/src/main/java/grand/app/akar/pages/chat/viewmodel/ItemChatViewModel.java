package grand.app.akar.pages.chat.viewmodel;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.chat.adapter.ChatImagesAdapter;
import grand.app.akar.pages.chat.model.Chat;

public class ItemChatViewModel extends BaseViewModel {
    Chat chat;
    ChatImagesAdapter imagesAdapter;

    public ItemChatViewModel(Chat chat) {
        this.chat = chat;
        imagesAdapter = new ChatImagesAdapter();
        imagesAdapter.update(chat.getMedia());
    }

    public ChatImagesAdapter getImagesAdapter() {
        return imagesAdapter;
    }

    @Bindable
    public Chat getChat() {
        return chat;
    }
}
