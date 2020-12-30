package grand.app.akar.pages.ads.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.adapter.CitiesAdapter;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.pages.ads.models.LocationUpdateRequest;
import grand.app.akar.pages.auth.models.cities.Cities;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.repository.AuthRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class AdsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;
    @Inject
    AdsRepository adsRepository;
    List<Cities> citiesList;
    CitiesAdapter citiesAdapter;
    CreateAdRequest createAdRequest;
    LocationUpdateRequest updateRequest;

    @Inject
    public AdsViewModel(AuthRepository repository, AdsRepository adsRepository) {
        updateRequest = new LocationUpdateRequest();
        createAdRequest = new CreateAdRequest();
        citiesAdapter = new CitiesAdapter();
        citiesList = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        this.adsRepository = adsRepository;
        repository.setLiveData(liveData);
        adsRepository.setLiveData(liveData);
    }

    public void toEditLocations() {
        compositeDisposable.add(adsRepository.editAdLocation(getUpdateRequest()));
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

    @Bindable
    public LocationUpdateRequest getUpdateRequest() {
        return updateRequest;
    }

    @Bindable
    public void setUpdateRequest(LocationUpdateRequest updateRequest) {
        notifyChange(BR.updateRequest);
        this.updateRequest = updateRequest;
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

    public AdsRepository getAdsRepository() {
        return adsRepository;
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

    public void reCenterToCurrentLocation() {
        liveData.setValue(new Mutable(Constants.CURRENT_LOCATION));
    }

    public void selectCity() {
        liveData.setValue(new Mutable(Constants.SELECT));
    }
}
