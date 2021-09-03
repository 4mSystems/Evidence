package te.app.evidence.pages.services.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.places.adapters.PlacesAdapter;
import te.app.evidence.pages.services.models.AddServiceRequest;
import te.app.evidence.repository.SettingsRepository;
import te.app.evidence.utils.Constants;

public class ServicesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    PlacesAdapter placesAdapter;
    AddServiceRequest addServiceRequest;
//    public List<GovsData> govsDataList;

    @Inject
    public ServicesViewModel(SettingsRepository repository) {
//        govsDataList = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    //
//    public void getAgents() {
//        compositeDisposable.add(repository.getAgents());
//    }
//
//    public void getClients(int govId) {
//        compositeDisposable.add(repository.getClients(govId));
//    }
//
//    public void getGovs() {
//        compositeDisposable.add(repository.getGovs());
//    }
//
    public void addNewService(){}
    public void showGovs() {
        liveData.setValue(new Mutable(Constants.SHOW_GOVS));
    }

    @Bindable
    public PlacesAdapter getPlacesAdapter() {
        return this.placesAdapter == null ? this.placesAdapter = new PlacesAdapter() : this.placesAdapter;
    }

    @Bindable
    public AddServiceRequest getAddServiceRequest() {
        return this.addServiceRequest == null ? this.addServiceRequest = new AddServiceRequest() : this.addServiceRequest;
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

    public SettingsRepository getRepository() {
        return repository;
    }

}
