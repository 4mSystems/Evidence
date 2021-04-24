package te.app.evidence.pages.clients.viewModels;

import android.widget.CompoundButton;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.utils.Constants;

public class ClientsItemViewModel extends BaseViewModel {
    public Clients clients;

    public ClientsItemViewModel(Clients clients) {
        this.clients = clients;
    }

    @Bindable
    public Clients getClients() {
        return clients;
    }

    public void toEdit() {
        getLiveData().setValue(Constants.EDIT);
    }

    public void toDelete() {
        getLiveData().setValue(Constants.DELETE);
    }

    public void toClientProfile() {
        getLiveData().setValue(Constants.CLIENT_PROFILE);
    }

    public void onCheckedChange(CompoundButton button, boolean check) {
        clients.setChecked(check);
    }

}
