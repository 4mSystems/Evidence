package grand.app.akar.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.adDetails.models.AdDetailsResponse;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.pages.favorites.models.FavoriteRequest;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class AdsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public AdsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable createAd(CreateAdRequest createAdRequest, List<FileObject> fileObjectList) {
        Log.e("teassss", createAdRequest.toString());

        return connectionHelper.requestApi(URLS.CREATE_AD, createAdRequest, fileObjectList, StatusMessage.class,
                Constants.CREATE_AD, true);
    }

    public Disposable getServices() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SERVICES, new Object(), StatusMessage.class,
                Constants.SERVICES, false);
    }

    public Disposable getFavoritesAds(int type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.FAVORITES + type, new Object(), HomeResponse.class,
                Constants.FAVORITES, true);
    }

    public Disposable getMyListing(int type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.MY_LISTING + type, new Object(), HomeResponse.class,
                Constants.MY_LISTING, true);
    }

    public Disposable getMyPremiumListing(int type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.MY_PREMIUM_LISTING + type, new Object(), HomeResponse.class,
                Constants.MY_LISTING, true);
    }

    public Disposable removeFavoriteAd(FavoriteRequest favoriteRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REMOVE_ADD_FAVORITE, favoriteRequest, StatusMessage.class,
                Constants.REMOVE_ADD_FAVORITE, true);
    }

    public Disposable removeAd(int listingId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.REMOVE_AD + listingId, new Object(), StatusMessage.class,
                Constants.REMOVE_AD, true);
    }

    public Disposable getAdDetails(int listingId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_AD_DETAILS + listingId, new Object(), AdDetailsResponse.class,
                Constants.GET_AD_DETAILS, true);
    }

}