package grand.app.akar.pages.adDetails.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.maps.model.LatLng;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.base.MyApplication;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.adDetails.models.AdDetailsData;
import grand.app.akar.pages.favorites.adapters.MyFavoritesAdapter;
import grand.app.akar.pages.favorites.models.FavoriteRequest;
import grand.app.akar.pages.home.adapters.HomeAdapter;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.utils.helper.AppHelper;
import grand.app.akar.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class AdDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AdsRepository adsRepository;
    HomeData homeData;
    AdDetailsData adDetailsData;
    HomeAdapter homeAdapter;
    public String title;

    @Inject
    public AdDetailsViewModel(AdsRepository adsRepository) {
        homeData = new HomeData();
        adDetailsData = new AdDetailsData();
        homeAdapter = new HomeAdapter();
        this.adsRepository = adsRepository;
        this.liveData = new MutableLiveData<>();
        adsRepository.setLiveData(liveData);
    }

    public void adDetails() {
        compositeDisposable.add(adsRepository.getAdDetails(getHomeData().getId()));
    }

    public void removeFavorites(int type, int listingId) {
        // the parameter in the url is type send 0 for favorites and 1 for contacts
        compositeDisposable.add(adsRepository.removeFavoriteAd(new FavoriteRequest(listingId, type)));
    }

    public AdsRepository getAdsRepository() {
        return adsRepository;
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


    public void toMap() {
        AppHelper.startAndroidGoogleMap(MyApplication.getInstance(), null, new LatLng(Double.parseDouble(homeData.getLat()), Double.parseDouble(homeData.getLng())));
    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    @Bindable
    public void setHomeData(HomeData homeData) {
        setTitle(homeData);
        notifyChange(BR.homeData);
        this.homeData = homeData;
    }

    @Bindable
    public AdDetailsData getAdDetailsData() {
        return adDetailsData;
    }

    @Bindable
    public void setAdDetailsData(AdDetailsData adDetailsData) {
        getHomeAdapter().update(adDetailsData.getRelatedListings());
        notifyChange(BR.adDetailsData);
        this.adDetailsData = adDetailsData;
    }

    public HomeAdapter getHomeAdapter() {
        return homeAdapter;
    }

    public void setTitle(HomeData homeData) {
        String type = homeData.getType();
        switch (homeData.getListingType()) {
            case 0:
                title = ResourceManager.getString(R.string.villa).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 1:
                title = ResourceManager.getString(R.string.house).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 2:
                title = ResourceManager.getString(R.string.flat).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 3:
                title = ResourceManager.getString(R.string.ware_house).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 4:
                title = ResourceManager.getString(R.string.store).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 5:
                title = ResourceManager.getString(R.string.land).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 6:
                title = ResourceManager.getString(R.string.manage_building).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 7:
                title = ResourceManager.getString(R.string.factory).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 8:
                title = ResourceManager.getString(R.string.rest).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 9:
                title = ResourceManager.getString(R.string.building).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 10:
                title = ResourceManager.getString(R.string.office).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;

        }
    }

}