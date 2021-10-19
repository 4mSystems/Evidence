package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import javax.inject.Singleton;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;

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

}