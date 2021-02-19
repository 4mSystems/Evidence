package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesResponse;
import te.app.evidence.pages.categories.models.AddCategoryRequest;
import te.app.evidence.pages.categories.models.AddCategoryResponse;
import te.app.evidence.pages.categories.models.CategoriesResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;

@Singleton
public class CasesRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public CasesRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getCasesClientsCategories() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CASE_CLIENTS_CATEGORIES, new Object(), CaseClientsCategoriesResponse.class,
                Constants.CASE_CLIENTS_CATEGORIES, true);
    }

    public Disposable addCategory(AddCategoryRequest addCategoryRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_CATEGORY, addCategoryRequest, AddCategoryResponse.class,
                Constants.ADD_CATEGORY, true);
    }

    public Disposable deleteCategory(String catId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_CATEGORY + catId, new Object(), StatusMessage.class,
                Constants.DELETE_CATEGORY, true);
    }
}