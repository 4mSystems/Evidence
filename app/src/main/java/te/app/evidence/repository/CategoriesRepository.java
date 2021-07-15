package te.app.evidence.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.categories.models.AddCategoryRequest;
import te.app.evidence.pages.categories.models.AddCategoryResponse;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.pages.categories.models.CategoriesResponse;
import te.app.evidence.pages.settings.models.AboutResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;

@Singleton
public class CategoriesRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public CategoriesRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getCategories() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CATEGORIES, new Object(), CategoriesResponse.class,
                Constants.CATEGORIES, true);
    }

    public Disposable getCategoriesPage(int page,boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CATEGORIES+page, new Object(), CategoriesResponse.class,
                Constants.CATEGORIES, showProgress);
    }

    public Disposable addCategory(AddCategoryRequest addCategoryRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_CATEGORY, addCategoryRequest, AddCategoryResponse.class,
                Constants.ADD_CATEGORY, true);
    }

    public Disposable editCategory(AddCategoryRequest addCategoryRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_CATEGORY, addCategoryRequest, AddCategoryResponse.class,
                Constants.ADD_CATEGORY, true);
    }

    public Disposable deleteCategory(String catId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.DELETE_CATEGORY + catId, new Object(), StatusMessage.class,
                Constants.DELETE_CATEGORY, true);
    }
}