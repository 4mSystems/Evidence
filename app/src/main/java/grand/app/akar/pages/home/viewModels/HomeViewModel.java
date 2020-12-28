package grand.app.akar.pages.home.viewModels;

import android.view.MenuItem;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.home.adapters.HomeAdapter;
import grand.app.akar.pages.home.adapters.HomeCategoriesAdapter;
import grand.app.akar.pages.home.models.SearchRequest;
import grand.app.akar.repository.HomeRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class HomeViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    HomeAdapter homeAdapter;
    HomeCategoriesAdapter categoriesAdapter;
    SearchRequest searchRequest;

    @Inject
    public HomeViewModel(HomeRepository homeRepository) {
        searchRequest = new SearchRequest();
        homeAdapter = new HomeAdapter();
        categoriesAdapter = new HomeCategoriesAdapter();
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void getListing() {
        compositeDisposable.add(homeRepository.getHome(getPassingObject().getId(), getCategoriesAdapter().getCategoriesDataList().get(getCategoriesAdapter().lastId).getId()));
    }

    public void search() {
        getSearchRequest().setCategory_id(getCategoriesAdapter().getCategoriesDataList().get(getCategoriesAdapter().lastId).getId());
        getSearchRequest().setCity_id(getPassingObject().getId());
        compositeDisposable.add(homeRepository.search(getSearchRequest()));
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

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        getHomeAdapter().getFilter().filter(s);
    }

    @BindingMethods({
            @BindingMethod(
                    type = BottomNavigationView.class,
                    attribute = "app:onNavigationItemSelected",
                    method = "setOnNavigationItemSelectedListener"
            ),
    })
    public class DataBindingAdapter {

    }

    public void rentType(RadioGroup radioGroup, int id) {
        if (id == R.id.radioRent) {
            getSearchRequest().setListing_type(0);
        } else
            getSearchRequest().setListing_type(1);
        notifyChange();
        search();
        liveData.setValue(new Mutable(Constants.RESULT_SEARCH_LISTING_TYPE));
    }

    public boolean onNavigationClick(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuHome) {
            liveData.setValue(new Mutable(Constants.MENU_HOME));
            return true;
        } else if (item.getItemId() == R.id.menuFavorites) {
            liveData.setValue(new Mutable(Constants.MENU_FAVORITE));
            return true;
        } else if (item.getItemId() == R.id.menuAccount) {
            liveData.setValue(new Mutable(Constants.MENU_ACCOUNT));
            return true;
        } else if (item.getItemId() == R.id.menuConversations) {
            liveData.setValue(new Mutable(Constants.MENU_CONVERSATIONS));
            return true;
        } else if (item.getItemId() == R.id.menuAdd) {
            liveData.setValue(new Mutable(Constants.MENU_ADD_AD));
            return true;
        } else
            return false;
    }

    public HomeCategoriesAdapter getCategoriesAdapter() {
        return categoriesAdapter;
    }

    public void toNewAd() {
        liveData.setValue(new Mutable(Constants.MENU_ADD_AD));
    }

    public HomeRepository getHomeRepository() {
        return homeRepository;
    }

    public HomeAdapter getHomeAdapter() {
        return homeAdapter;
    }

    public void filpCard() {
        liveData.setValue(new Mutable(Constants.FLIP_CARD));
    }

    public void changeMapStyle() {
        liveData.setValue(new Mutable(Constants.MAP_STYLE));
    }

    public void reCenterToCurrentLocation() {
        liveData.setValue(new Mutable(Constants.CURRENT_LOCATION));
    }

    public void rentTypeFilter() {
        liveData.setValue(new Mutable(Constants.SEARCH_LISTING_TYPE));
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }
}
