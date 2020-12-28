package grand.app.akar.pages.favorites.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.favorites.adapters.MyFavoritesAdapter;
import grand.app.akar.pages.favorites.models.FavoriteRequest;
import grand.app.akar.pages.myAds.adapters.MyAdsAdapter;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class MyFavoritesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MyFavoritesAdapter myFavoritesAdapter;
    @Inject
    AdsRepository adsRepository;

    @Inject
    public MyFavoritesViewModel(AdsRepository adsRepository) {
        myFavoritesAdapter = new MyFavoritesAdapter();
        this.adsRepository = adsRepository;
        this.liveData = new MutableLiveData<>();
        adsRepository.setLiveData(liveData);
    }

    public void favoritesAds(int type) {
        // the parameter in the url is type send 0 for favorites and 1 for contacts
        compositeDisposable.add(adsRepository.getFavoritesAds(type));
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

    @Bindable
    public MyFavoritesAdapter getMyFavoritesAdapter() {
        return this.myFavoritesAdapter == null ? this.myFavoritesAdapter = new MyFavoritesAdapter() : this.myFavoritesAdapter;
    }


}