package te.app.evidence.pages.clients.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.clients.models.Clients;

public class ClientsItemViewModel extends BaseViewModel {
    public Clients clients;

    public ClientsItemViewModel(Clients clients) {
        this.clients = clients;
    }

    @Bindable
    public Clients getClients() {
        return clients;
    }

    public void itemAction() {
//        getLiveData().setValue(Constants.DELETE);
    }

}
