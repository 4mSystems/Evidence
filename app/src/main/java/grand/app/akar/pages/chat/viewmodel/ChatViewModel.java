
package grand.app.akar.pages.chat.viewmodel;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.chat.adapter.ChatAdapter;
import grand.app.akar.pages.chat.model.ChatRequest;
import grand.app.akar.pages.chat.model.ChatResponse;
import grand.app.akar.repository.ChatRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ChatViewModel extends BaseViewModel {
    public
    MutableLiveData<Mutable> liveData;
    @Inject
    public ChatRepository repository;
    public ChatAdapter adapter = new ChatAdapter();
    public ChatRequest request = new ChatRequest();
    public FileObject image;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Inject
    public ChatViewModel(ChatRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void chat() {
        compositeDisposable.add(repository.getChat(getPassingObject().getId()));
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public void select() {
        liveData.setValue(new Mutable(Constants.SELECT));
    }

    public void sendMessage() {
        if (!request.message.trim().equals("")) {
            repository.sendChat(request, image);
        }
    }
}
