package te.app.evidence.pages.categories.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.adapters.CategoriesAdapter;
import te.app.evidence.pages.categories.models.CategoriesMainData;
import te.app.evidence.repository.CategoriesRepository;
import te.app.evidence.utils.Constants;

public class CategoriesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CategoriesRepository categoriesRepository;
    CategoriesAdapter categoriesAdapter;
    CategoriesMainData mainData;

    @Inject
    public CategoriesViewModel(CategoriesRepository categoriesRepository) {
        mainData = new CategoriesMainData();
        this.categoriesRepository = categoriesRepository;
        this.liveData = new MutableLiveData<>();
        categoriesRepository.setLiveData(liveData);
    }

    public void categories(int page, boolean showProgress) {
        compositeDisposable.add(categoriesRepository.getCategoriesPage(page, showProgress));
    }

    public void deleteCategory() {
        compositeDisposable.add(categoriesRepository.deleteCategory(getCategoriesAdapter().getCategoriesDataList().get(getCategoriesAdapter().lastSelected).getId()));
    }

    public void addNewCategory() {
        liveData.setValue(new Mutable(Constants.ADD_CATEGORY));
    }

    @Bindable
    public CategoriesMainData getMainData() {
        return mainData;
    }

    @Bindable
    public void setMainData(CategoriesMainData mainData) {
        if (getCategoriesAdapter().getCategoriesDataList().size() > 0) {
            getCategoriesAdapter().loadMore(mainData.getCategoriesDataList());
        } else {
            getCategoriesAdapter().update(mainData.getCategoriesDataList());
            notifyChange(BR.clientsAdapter);
        }
        searchProgressVisible.set(false);
        this.mainData = mainData;
    }

    @Bindable
    public CategoriesAdapter getCategoriesAdapter() {
        return this.categoriesAdapter == null ? this.categoriesAdapter = new CategoriesAdapter() : this.categoriesAdapter;
    }

    public CategoriesRepository getCategoriesRepository() {
        return categoriesRepository;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

}
