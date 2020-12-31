package grand.app.akar.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.connection.FileObject;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.adDetails.models.AdDetailsResponse;
import grand.app.akar.pages.adDetails.models.ReportRequest;
import grand.app.akar.pages.adDetails.models.UpdatedImagesRequest;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.pages.ads.models.LocationUpdateRequest;
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
        return connectionHelper.requestApi(URLS.CREATE_AD, createAdRequest, fileObjectList, StatusMessage.class,
                Constants.CREATE_AD, true);
    }

    public Disposable updateAdImages(UpdatedImagesRequest updatedImagesRequest, List<FileObject> fileObjectList) {
        return connectionHelper.requestApi(URLS.UPDATE_IMAGES, updatedImagesRequest, fileObjectList, StatusMessage.class,
                Constants.UPDATE_IMAGES, true);
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

    public Disposable removeImage(int imgId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.REMOVE_IMAGE + imgId, new Object(), StatusMessage.class,
                Constants.REMOVE_IMAGE, true);
    }

    public Disposable getAdDetails(int listingId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_AD_DETAILS + listingId, new Object(), AdDetailsResponse.class,
                Constants.GET_AD_DETAILS, true);
    }

    public Disposable sendReport(ReportRequest reportRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_REPORT, reportRequest, StatusMessage.class,
                Constants.SEND_REPORT, true);
    }

    public Disposable updateDate(int listingId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.UPDATE_AD_DATE + listingId, new Object(), StatusMessage.class,
                Constants.UPDATE_AD_DATE, true);
    }

    public Disposable editAdLocation(LocationUpdateRequest createAdRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_AD_DATA, createAdRequest, StatusMessage.class,
                Constants.UPDATE_AD_DATA, true);
    }

    public Disposable editAd(CreateAdRequest createAdRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_AD_DATA, createAdRequest, StatusMessage.class,
                Constants.UPDATE_AD_DATA, true);
    }
}