package te.app.evidence.pages.clients.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.clients.adapters.ClientsAdapter;
import te.app.evidence.pages.clients.models.ClientsMainData;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.utils.Constants;

public class ClientsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ClientsRepository clientsRepository;
    ClientsAdapter clientsAdapter;
    ClientsMainData clientsMainData;

    @Inject
    public ClientsViewModel(ClientsRepository clientsRepository) {
        clientsMainData = new ClientsMainData();
        this.clientsRepository = clientsRepository;
        this.liveData = new MutableLiveData<>();
        clientsRepository.setLiveData(liveData);
    }

    public void clients(int page, boolean showProgress) {
        compositeDisposable.add(clientsRepository.getClients(page,showProgress));
    }

    public void deleteClient() {
        compositeDisposable.add(clientsRepository.deleteClient(getClientsAdapter().getClientsList().get(getClientsAdapter().lastSelected).getClientId()));
    }

    @Bindable
    public ClientsMainData getClientsMainData() {
        return clientsMainData;
    }

    @Bindable
    public void setClientsMainData(ClientsMainData clientsMainData) {
        if (getClientsAdapter().getClientsList().size() > 0) {
            getClientsAdapter().loadMore(clientsMainData.getClientsList());
        } else {
            getClientsAdapter().update(clientsMainData.getClientsList());
            notifyChange(BR.clientsAdapter);
        }
        searchProgressVisible.set(false);
        this.clientsMainData = clientsMainData;
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
