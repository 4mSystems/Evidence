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


    public Disposable subscribeAsDelegate(int shopId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SUBSCRIBE_AS_DELEGATE + shopId, new Object(), StatusMessage.class,
                Constants.SUBSCRIBE_AS_DELEGATE, true);
    }
}