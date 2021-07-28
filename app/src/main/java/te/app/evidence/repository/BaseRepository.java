package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.CaseClientsResponse;
import te.app.evidence.pages.categories.models.CategoriesResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;


public class BaseRepository {
    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public BaseRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public BaseRepository() {
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getCategories() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CATEGORIES, new Object(), CategoriesResponse.class,
                Constants.CATEGORIES, true);
    }

}
