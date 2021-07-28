package te.app.evidence.pages.reports.viewModels;

import android.text.TextUtils;
import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.adapters.CategoriesAdapter;
import te.app.evidence.pages.categories.adapters.CategoriesDropAdapter;
import te.app.evidence.pages.clients.adapters.ClientsAdapter;
import te.app.evidence.pages.clients.models.ClientsMainData;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.utils.Constants;

public class ReportsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ClientsRepository clientsRepository;
    ClientsAdapter clientsAdapter;
    ClientsMainData clientsMainData, oldClientsMainData;
   public CategoriesDropAdapter categoriesAdapter;

    @Inject
    public ReportsViewModel(ClientsRepository clientsRepository) {
        clientsMainData = new ClientsMainData();
        oldClientsMainData = new ClientsMainData();
        this.clientsRepository = clientsRepository;
        this.liveData = new MutableLiveData<>();
        clientsRepository.setLiveData(liveData);
    }

    public void clients(int page, boolean showProgress) {
        compositeDisposable.add(clientsRepository.getClients(page, showProgress));
    }

    public void getCasesClientsCategories() {
        if (userData.getUserData().getType().equals("admin"))
            compositeDisposable.add(clientsRepository.getCategories());
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public ClientsMainData getClientsMainData() {
        return clientsMainData;
    }

    @Bindable
    public void setClientsMainData(ClientsMainData clientsMainData) {
        if (!TextUtils.isEmpty(searchRequest.getName())) { // if search required
            if (clientsMainData.getCurrentPage() > 1) {
                getClientsAdapter().loadMore(clientsMainData.getClientsList());
            } else {
                getClientsAdapter().update(clientsMainData.getClientsList());
                notifyChange(BR.clientsAdapter);
            }
        } else {
            if (getClientsAdapter().getClientsList().size() > 0) {
                getClientsAdapter().loadMore(clientsMainData.getClientsList());
            } else {
                oldClientsMainData = clientsMainData;
                getClientsAdapter().update(clientsMainData.getClientsList());
                notifyChange(BR.clientsAdapter);
            }
        }
        searchProgressVisible.set(false);
        this.clientsMainData = clientsMainData;
    }

    @Bindable
    public ClientsAdapter getClientsAdapter() {
        return this.clientsAdapter == null ? this.clientsAdapter = new ClientsAdapter() : this.clientsAdapter;
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            getClientsAdapter().getClientsList().clear();
            setClientsMainData(oldClientsMainData);
        }
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
