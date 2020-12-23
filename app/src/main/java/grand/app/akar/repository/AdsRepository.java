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
import grand.app.akar.pages.ads.models.CreateAdRequest;
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

        return connectionHelper.requestApi(URLS.CREATE_AD, createAdRequest,fileObjectList, StatusMessage.class,
                Constants.CREATE_AD, true);
    }

    public Disposable getServices() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SERVICES, new Object(), StatusMessage.class,
                Constants.SERVICES, false);
    }

}