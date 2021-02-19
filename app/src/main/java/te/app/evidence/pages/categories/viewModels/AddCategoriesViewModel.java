package te.app.evidence.pages.categories.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.categories.models.AddCategoryRequest;
import te.app.evidence.pages.categories.models.CategoriesData;
import te.app.evidence.repository.CategoriesRepository;

public class AddCategoriesViewModel extends BaseViewModel {
    CategoriesData categoriesData;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CategoriesRepository categoriesRepository;
    AddCategoryRequest addCategoryRequest;

    @Inject
    public AddCategoriesViewModel(CategoriesRepository categoriesRepository) {
        addCategoryRequest = new AddCategoryRequest();
        categoriesData = new CategoriesData();
        this.categoriesRepository = categoriesRepository;
        this.liveData = new MutableLiveData<>();
        categoriesRepository.setLiveData(liveData);
    }

    public void addNewCategory() {
        if (getAddCategoryRequest().isValid())
            compositeDisposable.add(categoriesRepository.addCategory(getAddCategoryRequest()));
    }

    @Bindable
    public CategoriesData getCategoriesData() {
        return categoriesData;
    }

    @Bindable
    public void setCategoriesData(CategoriesData categoriesData) {
        if (categoriesData!=null){
            getAddCategoryRequest().setName(categoriesData.getName());

        }
        notifyChange(BR.categoriesData);
        this.categoriesData = categoriesData;
    }

    public CategoriesRepository getCategoriesRepository() {
        return categoriesRepository;
    }

    public AddCategoryRequest getAddCategoryRequest() {
        return addCategoryRequest;
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
