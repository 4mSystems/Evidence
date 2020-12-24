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
        List<CategoriesData> categoriesDataList = new ArrayList<>();
        categoriesDataList.add(new CategoriesData(1, ResourceManager.getString(R.string.villa), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(2, ResourceManager.getString(R.string.house), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(3, ResourceManager.getString(R.string.flat), AddFlatFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(4, ResourceManager.getString(R.string.ware_house), AddWareHosueFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(5, ResourceManager.getString(R.string.store), AddStoreFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(6, ResourceManager.getString(R.string.land), AddLandFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(7, ResourceManager.getString(R.string.manage_building), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(8, ResourceManager.getString(R.string.factory), AddFactoryFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(9, ResourceManager.getString(R.string.rest), AddResetFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(10, ResourceManager.getString(R.string.building), AddVillaHouseManagmentFormFragment.class.getName()));
        categoriesDataList.add(new CategoriesData(11, ResourceManager.getString(R.string.office), AddOfficeFormFragment.class.getName()));
        getCategoriesAdapter().update(categoriesDataList);
    }

    public void toSelectForm() {
        liveData.setValue(new Mutable(Constants.ADD_FORM));
    }

    public CreateAdRequest getCreateAdRequest() {
        return createAdRequest;
    }

    public void setCreateAdRequest(CreateAdRequest createAdRequest) {
        Log.e("setCreateAdRequest", "setCreateAdRequest: "+createAdRequest );
        this.createAdRequest = createAdRequest;
    }

    public SettingsRepository getRepository() {
        return repository;
    }
}
