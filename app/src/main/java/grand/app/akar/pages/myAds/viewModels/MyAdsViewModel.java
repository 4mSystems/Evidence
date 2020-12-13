package grand.app.akar.pages.myAds.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.myAds.adapters.MyAdsAdapter;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class MyAdsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MyAdsAdapter myAdsAdapter;
    @Inject
    AdsRepository adsRepository;

    @Inject
    public MyAdsViewModel(AdsRepository adsRepository) {
        this.adsRepository = adsRepository;
        this.liveData = new MutableLiveData<>();
        adsRepository.setLiveData(liveData);
    }

    public void storeOrders() {
//        compositeDisposable.add(marketRepository.storeOrders(getOrdersRequest()));
    }

    public AdsRepository getAdsRepository() {
        return adsRepository;
    }

    public void showOrderFilter() {
        liveData.setValue(new Mutable(Constants.ORDER_FILTER));
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

    @Bindable
    public MyAdsAdapter getMyAdsAdapter() {
        return this.myAdsAdapter == null ? this.myAdsAdapter = new MyAdsAdapter() : this.myAdsAdapter;
    }


}