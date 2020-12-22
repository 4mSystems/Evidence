package grand.app.akar.pages.ads.viewModels;

import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.adapter.CitiesAdapter;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class AdsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;
    private List<Cities> citiesList;
    private CitiesAdapter citiesAdapter;

    @Inject
    public AdsViewModel(AuthRepository repository) {
        citiesAdapter= new CitiesAdapter();
        citiesList = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public CitiesAdapter getCitiesAdapter() {
        return citiesAdapter;
    }

    public List<Cities> getCitiesList() {
        return citiesList;
    }

    @Bindable
    public void setCitiesList(List<Cities> citiesList) {
        Log.e("setCitiesList", "setCitiesList: " + citiesList.size());
        notifyChange(BR.citiesList);
        this.citiesList = citiesList;
    }

    public void cities() {
        compositeDisposable.add(repository.getCities());
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void toCities() {
        liveData.setValue(new Mutable(Constants.CHOOSE_CITY));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public AuthRepository getRepository() {
        return repository;
    }

}
