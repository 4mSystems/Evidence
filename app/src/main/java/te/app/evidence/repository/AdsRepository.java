package te.app.evidence.repository;


import androidx.lifecycle.MutableLiveData;


import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
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



    public Disposable getServices() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SERVICES, new Object(), StatusMessage.class,
                Constants.SERVICES, false);
    }

    public Disposable removeAd(int listingId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.REMOVE_AD + listingId, new Object(), StatusMessage.class,
                Constants.REMOVE_AD, true);
    }

    public Disposable removeImage(int imgId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.REMOVE_IMAGE + imgId, new Object(), StatusMessage.class,
                Constants.REMOVE_IMAGE, true);
    }



    public Disposable updateDate(int listingId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.UPDATE_AD_DATE + listingId, new Object(), StatusMessage.class,
                Constants.UPDATE_AD_DATE, true);
    }

}