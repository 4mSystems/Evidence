package te.app.evidence.pages.categories.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.adapters.CategoriesAdapter;
import te.app.evidence.repository.CategoriesRepository;
import te.app.evidence.utils.Constants;

public class CategoriesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CategoriesRepository categoriesRepository;
    CategoriesAdapter categoriesAdapter;

    @Inject
    public CategoriesViewModel(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
        this.liveData = new MutableLiveData<>();
        categoriesRepository.setLiveData(liveData);
    }

    public void categories() {
        compositeDisposable.add(categoriesRepository.getCategories());
    }

    public void deleteCategory() {
        compositeDisposable.add(categoriesRepository.deleteCategory(getCategoriesAdapter().getCategoriesDataList().get(getCategoriesAdapter().lastSelected).getId()));
    }

    public void addNewCategory() {
        liveData.setValue(new Mutable(Constants.ADD_CATEGORY));
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
