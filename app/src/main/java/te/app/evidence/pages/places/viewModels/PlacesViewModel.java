package te.app.evidence.pages.places.viewModels;


import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.places.adapters.GovernAdapter;
import te.app.evidence.pages.places.adapters.PlacesAdapter;
import te.app.evidence.pages.places.models.PlacesMain;
import te.app.evidence.pages.places.models.PlacesPaginate;
import te.app.evidence.repository.SettingsRepository;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;

public class PlacesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    PlacesAdapter placesAdapter;
    GovernAdapter governAdapter;
    PlacesMain placesMain;
    PlacesPaginate placesPaginate;
    public ObservableField<String> searchType = new ObservableField<>();
    public ObservableField<String> governText = new ObservableField<>();
    public int governId;

    @Inject
    public PlacesViewModel(SettingsRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }


    public void getPlaces() {
        compositeDisposable.add(repository.getPlaces());
    }


    public void getPlacesByGovernId(int page, boolean showProgress) {
        compositeDisposable.add(repository.getPlacesByGovernId(governId, searchType.get(), page, showProgress));
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        getGovernAdapter().getFilter().filter(s);
    }

    public void showGovs() {
        if (getPlacesMain().getGovernmentDataList() != null && getPlacesMain().getGovernmentDataList().size() > 0)
            liveData.setValue(new Mutable(Constants.SHOW_GOVS));
    }

    public void showSearchType() {
        liveData.setValue(new Mutable(Constants.SHOW_TYPE));
    }

    @Bindable
    public PlacesMain getPlacesMain() {
        return this.placesMain == null ? this.placesMain = new PlacesMain() : this.placesMain;
    }

    @Bindable
    public void setPlacesMain(PlacesMain placesMain) {
        // for init data
        governText.set(placesMain.getGovernmentDataList().get(0).getName());
        governId = placesMain.getGovernmentDataList().get(0).getId();
        searchType.set(ResourceManager.getString(R.string.court));

        getGovernAdapter().update(placesMain.getGovernmentDataList());
        setPlacesPaginate(placesMain.getPlacesPaginate());
        notifyChange(BR.governAdapter);
        this.placesMain = placesMain;
    }

    @Bindable
    public PlacesPaginate getPlacesPaginate() {
        return this.placesPaginate == null ? this.placesPaginate = new PlacesPaginate() : this.placesPaginate;
    }

    @Bindable
    public void setPlacesPaginate(PlacesPaginate placesPaginate) {
        if (placesPaginate.getCurrentPage() > 1) {
            getPlacesAdapter().loadMore(placesPaginate.getPlacesData());
        } else {
            getPlacesAdapter().update(placesPaginate.getPlacesData());
            notifyChange(BR.placesAdapter);
        }
        searchProgressVisible.set(false);
        this.placesPaginate = placesPaginate;
    }

    @Bindable
    public PlacesAdapter getPlacesAdapter() {
        return this.placesAdapter == null ? this.placesAdapter = new PlacesAdapter() : this.placesAdapter;
    }

    @Bindable
    public GovernAdapter getGovernAdapter() {
        return this.governAdapter == null ? this.governAdapter = new GovernAdapter() : this.governAdapter;
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
