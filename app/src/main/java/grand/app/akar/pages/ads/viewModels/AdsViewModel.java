package grand.app.akar.pages.ads.viewModels;

import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.maps.MapHelper;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.adapter.CitiesAdapter;
import grand.app.akar.pages.ads.models.CreateAdRequest;
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
    private CreateAdRequest createAdRequest;

    @Inject
    public AdsViewModel(AuthRepository repository) {
        createAdRequest = new CreateAdRequest();
        citiesAdapter = new CitiesAdapter();
        citiesList = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    @Bindable
    public void setCitiesList(List<Cities> citiesList) {
        notifyChange(BR.citiesList);
        getCreateAdRequest().setCityName(citiesList.get(0).getName());
        getCreateAdRequest().setCityId(citiesList.get(0).getId());
        getCreateAdRequest().setLat(citiesList.get(0).getLat());
        getCreateAdRequest().setLng(citiesList.get(0).getLng());
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

    public CreateAdRequest getCreateAdRequest() {
        return createAdRequest;
    }

    public CitiesAdapter getCitiesAdapter() {
        return citiesAdapter;
    }

    public List<Cities> getCitiesList() {
        return citiesList;
    }

    public AuthRepository getRepository() {
        return repository;
    }

    public void toAdFee() {
        liveData.setValue(new Mutable(Constants.AD_INFO_1));
    }

    public void toAdLocations() {
        liveData.setValue(new Mutable(Constants.MAP_LOCATION));
    }

    public void toCategories() {
        liveData.setValue(new Mutable(Constants.CATEGORIES));
    }

    public void selectCity() {
        liveData.setValue(new Mutable(Constants.SELECT));
    }
}
