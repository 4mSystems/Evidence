package te.app.evidence.pages.clients.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.pages.clients.models.AddClientRequest;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.utils.Constants;

public class AddClientViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    AddClientRequest addClientRequest;
    @Inject
    ClientsRepository clientsRepository;
    Clients clients;

    @Inject
    public AddClientViewModel(ClientsRepository clientsRepository) {
        clients = new Clients();
        this.clientsRepository = clientsRepository;
        this.liveData = new MutableLiveData<>();
        clientsRepository.setLiveData(liveData);
        addClientRequest = new AddClientRequest();
        if (userData.getUserData().getType().equals("admin"))
            getCategories();
        else
            getAddClientRequest().setCat_id(userData.getUserData().getCatId());

    }

    public void addNewClient() {
        if (getAddClientRequest().isValid())
            if (getPassingObject().getObjectClass() == null)
                compositeDisposable.add(clientsRepository.addNewClient(getAddClientRequest()));
            else
                compositeDisposable.add(clientsRepository.editClient(getAddClientRequest()));
    }

    public void getCategories() {
        compositeDisposable.add(clientsRepository.getCategories());
    }

    public void showCategories() {
        liveData.setValue(new Mutable(Constants.SHOW_CATEGORIES));
    }

    public void showClientType() {
        liveData.setValue(new Mutable(Constants.SHOW_CLIENT_TYPE));
    }

    public AddClientRequest getAddClientRequest() {
        return addClientRequest;
    }

    public ClientsRepository getClientsRepository() {
        return clientsRepository;
    }

    @Bindable
    public Clients getClients() {
        return clients;
    }

    @Bindable
    public void setClients(Clients clients) {
        if (clients != null) {
            getAddClientRequest().setCat_id(String.valueOf(clients.getCategory().getId()));
            getAddClientRequest().setCatName(clients.getCategory().getName());
            getAddClientRequest().setClient_Name(clients.getClientName());
            getAddClientRequest().setClient_Unit(clients.getClientUnit());
            getAddClientRequest().setClient_Address(clients.getClientAddress());
            getAddClientRequest().setType("client");
            getAddClientRequest().setNotes(clients.getNotes());
            getAddClientRequest().setClient_id(String.valueOf(clients.getId()));
        }
        notifyChange(BR.clients);
        this.clients = clients;
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
