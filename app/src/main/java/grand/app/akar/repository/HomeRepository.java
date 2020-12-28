package grand.app.akar.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.model.base.Mutable;

import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.home.models.HomeResponse;
import grand.app.akar.pages.home.models.SearchRequest;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class HomeRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public HomeRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getHome(int cityId, int catId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LISTING + cityId + "/" + catId, new Object(), HomeResponse.class,
                Constants.HOME, true);
    }

    public Disposable search(SearchRequest searchRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEARCH , searchRequest, HomeResponse.class,
                Constants.HOME, true);
    }

    public Disposable subscribeAsDelegate(int shopId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SUBSCRIBE_AS_DELEGATE + shopId, new Object(), StatusMessage.class,
                Constants.SUBSCRIBE_AS_DELEGATE, true);
    }
}