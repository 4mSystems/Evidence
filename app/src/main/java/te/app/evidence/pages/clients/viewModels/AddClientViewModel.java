package te.app.evidence.pages.clients.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.clients.models.AddClientRequest;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;

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
        if (getAddClientRequest().isValid()) {
            if (userData.getUserData().getType().equals("user"))
                getAddClientRequest().setCat_id(userData.getUserData().getCatId());
            setMessage(Constants.SHOW_PROGRESS);
            if (getPassingObject().getObjectClass() == null)
                compositeDisposable.add(clientsRepository.addNewClient(getAddClientRequest()));
            else
                compositeDisposable.add(clientsRepository.editClient(getAddClientRequest()));
        }
    }

    public void getCategories() {
        if (userData.getUserData().getType().equals("admin"))
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
            getAddClientRequest().setCat_id(String.valueOf(clients.getCatId()));
            getAddClientRequest().setCatName(clients.getCategory().getName());
            getAddClientRequest().setClient_Name(clients.getClientName());
            getAddClientRequest().setClient_Unit(clients.getClientUnit());
            getAddClientRequest().setClient_Address(clients.getClientAddress());
            getAddClientRequest().setType(clients.getType().equals(ResourceManager.getString(R.string.client)) ? "client" : "khesm");
            getAddClientRequest().setNotes(clients.getNotes());
            getAddClientRequest().setClient_id(String.valueOf(clients.getClientId()));
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
