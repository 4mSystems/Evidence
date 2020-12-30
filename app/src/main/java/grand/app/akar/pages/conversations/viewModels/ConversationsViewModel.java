package grand.app.akar.pages.conversations.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.conversations.adapters.ConversationsAdapter;
import grand.app.akar.repository.ChatRepository;

public class ConversationsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
     CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ChatRepository repository;
     ConversationsAdapter conversationsAdapter;

    @Inject
    public ConversationsViewModel(ChatRepository repository) {
        conversationsAdapter = new ConversationsAdapter();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getConversations() {
        compositeDisposable.add(repository.getConversations());
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public ChatRepository getRepository() {
        return repository;
    }

    public ConversationsAdapter getConversationsAdapter() {
        return conversationsAdapter;
    }
}
