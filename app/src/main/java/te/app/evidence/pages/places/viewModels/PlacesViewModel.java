package te.app.evidence.pages.places.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.places.adapters.PlacesAdapter;
import te.app.evidence.repository.SettingsRepository;
import te.app.evidence.utils.Constants;

public class PlacesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    PlacesAdapter placesAdapter;
//    public List<GovsData> govsDataList;

    @Inject
    public PlacesViewModel(SettingsRepository repository) {
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
    public void showGovs() {
        liveData.setValue(new Mutable(Constants.SHOW_GOVS));
    }

    @Bindable
    public PlacesAdapter getPlacesAdapter() {
        return this.placesAdapter == null ? this.placesAdapter = new PlacesAdapter() : this.placesAdapter;
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
