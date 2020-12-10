package grand.app.akar.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import grand.app.akar.connection.ConnectionHelper;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.settings.models.AboutResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.URLS;

@Singleton
public class ChatRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ChatRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }
    public Disposable getTerms() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.TERMS, new Object(), AboutResponse.class,
                Constants.TERMS, true);
    }

}