package te.app.evidence.pages.cases.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.adapters.SearchClientsAdapter;
import te.app.evidence.pages.clients.models.ClientsMainData;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class SearchClientsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    SearchClientsAdapter clientsAdapter;
    ClientsMainData clientsResponse;

    @Inject
    public SearchClientsViewModel(CasesRepository casesRepository) {
        clientsResponse = new ClientsMainData();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void confirmSelection() {
        liveData.setValue(new Mutable(Constants.CONFIRM_CODE));
    }

    public void setClientsResponse(ClientsMainData clientsResponse) {
        getClientsAdapter().update(clientsResponse.getClientsList());
        notifyChange(BR.clientsAdapter);
        this.clientsResponse = clientsResponse;
    }

    @Bindable
    public SearchClientsAdapter getClientsAdapter() {
        return this.clientsAdapter == null ? this.clientsAdapter = new SearchClientsAdapter() : this.clientsAdapter;
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
