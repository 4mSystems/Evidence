package grand.app.akar.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class ServiceRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ServiceRepository(ConnectionHelper connectionHelper){
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData){
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getServices() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SERVICES,new Object(), StatusMessage.class,
                Constants.SERVICES,false);
    }

}