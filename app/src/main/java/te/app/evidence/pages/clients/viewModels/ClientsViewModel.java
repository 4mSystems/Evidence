package te.app.evidence.pages.clients.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.clients.adapters.ClientsAdapter;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.utils.Constants;

public class ClientsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ClientsRepository clientsRepository;
    ClientsAdapter clientsAdapter;

    @Inject
    public ClientsViewModel(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
        this.liveData = new MutableLiveData<>();
        clientsRepository.setLiveData(liveData);
    }

    public void clients() {
        compositeDisposable.add(clientsRepository.getClients());
    }

    @Bindable
    public ClientsAdapter getClientsAdapter() {
        return this.clientsAdapter == null ? this.clientsAdapter = new ClientsAdapter() : this.clientsAdapter;
    }

    public void toNewClient() {
        liveData.setValue(new Mutable(Constants.ADD_CLIENTS));
    }

    public ClientsRepository getClientsRepository() {
        return clientsRepository;
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
}
