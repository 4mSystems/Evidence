
package grand.app.akar.pages.chat.viewmodel;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.chat.adapter.ChatAdapter;
import grand.app.akar.pages.chat.model.ChatRequest;
import grand.app.akar.pages.chat.model.ChatResponse;
import io.reactivex.disposables.CompositeDisposable;


/**
 * Created by Gregory Rasmussen on 7/26/17.
 */
public class ChatViewModel extends BaseViewModel {

    public
    MutableLiveData<Mutable> liveData;

//    @Inject
//    public ChatRepository repository;

    public ChatResponse response;

    public ChatAdapter adapter = new ChatAdapter();
    public ChatRequest request = new ChatRequest();
    public FileObject image;


    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public ObservableField<String> chatNumber = new ObservableField<>();


//    @Inject
//    public ChatViewModel(ChatRepository repository){
//        this.repository = repository;
//        this.liveData = new MutableLiveData<>();
//        repository.setLiveData(liveData);
//        call();
//    }
//
//    public void call(){
//        compositeDisposable.add(repository.getChat());
//    }
//
//    private void unSubscribeFromObservable() {
//        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
//            compositeDisposable.dispose();
//        }
//    }
//
//    public void noData(){
//        noDataTextDisplay.set(true);
//        notifyChange();
//    }
//
//    @Override
//    protected void onCleared() {
//        super.onCleared();
//        unSubscribeFromObservable();
//    }
//
//    public void select(){
//        liveData.setValue(new Mutable(Constants.SELECT));
//    }
//
//    public void sendMessage(){
//        if(!request.message.trim().equals("")) {
//            Timber.e("action:sendMessage");
//            repository.sendChat(request,image);
//        }
//    }
//
//    public void updateChatCount(){
//        chatNumber.set(response.messageCount + " "+getString(R.string.message));
//    }
//
//    public void updateAdapter() {
//        updateChatCount();
//        adapter.update(response.chats);
////        notifyChange();
//    }


//    public void successSendChat(Chat data) {
//        adapter.add(data);
//    }
}
