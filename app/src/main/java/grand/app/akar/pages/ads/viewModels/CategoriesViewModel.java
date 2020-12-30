package grand.app.akar.pages.ads.viewModels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.adapter.CategoriesAdapter;
import grand.app.akar.pages.ads.forms.AddFactoryFormFragment;
import grand.app.akar.pages.ads.forms.AddFlatFormFragment;
import grand.app.akar.pages.ads.forms.AddLandFormFragment;
import grand.app.akar.pages.ads.forms.AddOfficeFormFragment;
import grand.app.akar.pages.ads.forms.AddResetFormFragment;
import grand.app.akar.pages.ads.forms.AddStoreFormFragment;
import grand.app.akar.pages.ads.forms.AddVillaHouseManagmentFormFragment;
import grand.app.akar.pages.ads.forms.AddWareHosueFormFragment;
import grand.app.akar.pages.ads.models.CategoriesData;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.repository.SettingsRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class CategoriesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private CategoriesAdapter categoriesAdapter;
    @Inject
    SettingsRepository repository;
    private CreateAdRequest createAdRequest;

    @Inject
    public CategoriesViewModel(SettingsRepository repository) {
        createAdRequest = new CreateAdRequest();
        categoriesAdapter = new CategoriesAdapter();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        setUpCategories();
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

    public CategoriesAdapter getCategoriesAdapter() {
        return categoriesAdapter;
    }

    private void setUpCategories() {
        getCategoriesAdapter().update(getCategoriesDataList());
    }

    public void toSelectForm() {
        liveData.setValue(new Mutable(Constants.ADD_FORM));
    }

    public CreateAdRequest getCreateAdRequest() {
        return createAdRequest;
    }

    public void setCreateAdRequest(CreateAdRequest createAdRequest) {
        Log.e("setCreateAdRequest", "setCreateAdRequest: " + createAdRequest);
        this.createAdRequest = createAdRequest;
    }

    public SettingsRepository getRepository() {
        return repository;
    }
}
