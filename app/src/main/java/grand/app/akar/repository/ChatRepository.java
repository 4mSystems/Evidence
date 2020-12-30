package grand.app.akar.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.akar.connection.FileObject;
import grand.app.akar.pages.chat.model.ChatRequest;
import grand.app.akar.pages.chat.model.ChatResponse;
import grand.app.akar.pages.conversations.models.ConversationsResponse;
import io.reactivex.disposables.Disposable;
import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.settings.models.AboutResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.URLS;

@Singleton
public class ChatRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ChatRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getConversations() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CONVERSATIONS, new Object(), ConversationsResponse.class,
                Constants.CONVERSATIONS, true);
    }

    public Disposable getChat(int listingId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CHAT + listingId, new Object(), ChatResponse.class,
                Constants.CHAT, true);
    }

    public void sendChat(ChatRequest request, FileObject image) {

    }
}