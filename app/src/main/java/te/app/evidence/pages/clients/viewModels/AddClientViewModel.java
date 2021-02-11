package te.app.evidence.pages.clients.viewModels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.pages.clients.models.AddClientRequest;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.utils.Constants;

public class AddClientViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    AddClientRequest addClientRequest;
    @Inject
    ClientsRepository clientsRepository;
    List<CategoriesData> categoriesDataList;

    @Inject
    public AddClientViewModel(ClientsRepository clientsRepository) {
        categoriesDataList = new ArrayList<>();
        this.clientsRepository = clientsRepository;
        this.liveData = new MutableLiveData<>();
        clientsRepository.setLiveData(liveData);
        addClientRequest = new AddClientRequest();
    }

    public void addNewClient() {
        if (getAddClientRequest().isValid())
            compositeDisposable.add(clientsRepository.addNewClient(getAddClientRequest()));
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

    public List<CategoriesData> getCategoriesDataList() {
        return categoriesDataList;
    }

    public void setCategoriesDataList(List<CategoriesData> categoriesDataList) {
        this.categoriesDataList = categoriesDataList;
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
