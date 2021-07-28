package te.app.evidence.pages.cases.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.adapters.InputTagClientsAdapter;
import te.app.evidence.pages.clients.models.AddClientRequest;
import te.app.evidence.pages.clients.models.ClientsMainData;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class CaseClientsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    InputTagClientsAdapter clientsAdapter;
    AddClientRequest clientRequest;

    @Inject
    public CaseClientsViewModel(CasesRepository casesRepository) {
        clientRequest = new AddClientRequest();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void clients(int page, boolean showProgress) {
        compositeDisposable.add(casesRepository.getCaseClients(getPassingObject().getId(), getPassingObject().getObject(), page, showProgress));
    }

    public void deleteClient() {
        getClientRequest().setClient_id(String.valueOf(getClientsAdapter().getClientsList().get(getClientsAdapter().lastSelected).getClientId()));
        getClientRequest().setCaseId(String.valueOf(getPassingObject().getId()));
        compositeDisposable.add(casesRepository.deleteClientFromCase(clientRequest));
    }

    public void toNewClient() {
        liveData.setValue(new Mutable(Constants.ADD_CLIENTS));
    }

    @Bindable
    public InputTagClientsAdapter getClientsAdapter() {
        return this.clientsAdapter == null ? this.clientsAdapter = new InputTagClientsAdapter() : this.clientsAdapter;
    }

    public AddClientRequest getClientRequest() {
        return clientRequest;
    }

    public CasesRepository getCasesRepository() {
        return casesRepository;
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
