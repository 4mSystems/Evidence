package grand.app.akar.pages.home.viewModels;

import android.widget.RadioGroup;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.home.models.SearchRequest;
import grand.app.akar.repository.HomeRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class SearchViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    private SearchRequest searchRequest;

    @Inject
    public SearchViewModel(HomeRepository homeRepository) {
        searchRequest = new SearchRequest();
        this.homeRepository = homeRepository;
//        this.liveData = new MutableLiveData<>();
//        homeRepository.setLiveData(liveData);
    }

    public void setLiveData(MutableLiveData<Mutable> liveData){
        this.liveData = liveData;
        homeRepository.setLiveData(liveData);
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

    public void rentType(RadioGroup radioGroup, int id) {
        if (id == R.id.radioRent) {
            getSearchRequest().setListing_type(0);
        }else
            getSearchRequest().setListing_type(1);
        liveData.setValue(new Mutable(Constants.RESULT_SEARCH_LISTING_TYPE));
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public HomeRepository getHomeRepository() {
        return homeRepository;
    }
}
