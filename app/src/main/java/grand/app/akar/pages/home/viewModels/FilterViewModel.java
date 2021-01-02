package grand.app.akar.pages.home.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.adapter.CitiesAdapter;
import grand.app.akar.pages.home.models.SearchRequest;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class FilterViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AdsRepository repository;

    private SearchRequest searchRequest;
    private int dealingType = 0, paymentMethod = 0, docType = 0, pool=0, lift=0, garage=0, furniture=0;
    CitiesAdapter citiesAdapter;

    @Inject
    public FilterViewModel(AdsRepository repository) {
        citiesAdapter = new CitiesAdapter();
        searchRequest = new SearchRequest();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void dealingTypeAction(int type) {
        getSearchRequest().setListing_type(type);
        setDealingType(type);
    }

    public void paymentMethodAction(int type) {
//        getSearchRequest().setP(payment);
        setPaymentMethod(type);
    }

    public void docTypeAction(int type) {
        getSearchRequest().setDoc_type(String.valueOf(type));
        setDocType(type);
    }


    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void poolChecked() {
        if (getSearchRequest().getPool() != null && getSearchRequest().getPool().equals("0")) {
            getSearchRequest().setPool("1");
            setPool(1);
        } else if (getSearchRequest().getPool() != null && getSearchRequest().getPool().equals("1")) {
            getSearchRequest().setPool("0");
            setPool(0);
        }
    }

    public void liftChecked() {
        if (getSearchRequest().getLift() != null && getSearchRequest().getLift().equals("0")) {
            getSearchRequest().setLift("1");
            setLift(1);
        } else if (getSearchRequest().getLift() != null && getSearchRequest().getLift().equals("1")) {
            getSearchRequest().setLift("0");
            setLift(0);
        }
    }

    public void garageChecked() {
        if (getSearchRequest().getGarage() != null && getSearchRequest().getGarage().equals("0")) {
            getSearchRequest().setGarage("1");
            setGarage(1);
        } else if (getSearchRequest().getGarage() != null && getSearchRequest().getGarage().equals("1")) {
            getSearchRequest().setGarage("0");
            setGarage(0);
        }
    }

    public void furnChecked() {
        if (getSearchRequest().getFurniture() != null && getSearchRequest().getFurniture().equals("0")) {
            getSearchRequest().setFurniture("1");
            setFurniture(1);
        } else if (getSearchRequest().getFurniture() != null && getSearchRequest().getFurniture().equals("1")) {
            getSearchRequest().setFurniture("0");
            setFurniture(0);
        }
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public AdsRepository getRepository() {
        return repository;
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    @Bindable
    public int getDealingType() {
        return dealingType;
    }

    @Bindable
    public void setDealingType(int dealingType) {
        notifyChange(BR.dealingType);
        this.dealingType = dealingType;
    }

    @Bindable
    public int getPaymentMethod() {
        return paymentMethod;
    }

    @Bindable
    public void setPaymentMethod(int paymentMethod) {
        notifyChange(BR.paymentMethod);
        this.paymentMethod = paymentMethod;
    }

    @Bindable
    public int getDocType() {
        return docType;
    }

    @Bindable
    public void setDocType(int docType) {
        notifyChange(BR.docType);
        this.docType = docType;
    }

    @Bindable
    public int getPool() {
        return pool;
    }

    @Bindable
    public void setPool(int pool) {
        notifyChange(BR.pool);
        this.pool = pool;
    }

    @Bindable
    public int getLift() {
        return lift;
    }

    @Bindable
    public void setLift(int lift) {
        notifyChange(BR.lift);
        this.lift = lift;
    }

    @Bindable
    public int getGarage() {
        return garage;
    }

    @Bindable
    public void setGarage(int garage) {
        notifyChange(BR.garage);
        this.garage = garage;
    }

    @Bindable
    public int getFurniture() {
        return furniture;
    }

    @Bindable
    public void setFurniture(int furniture) {
        notifyChange(BR.furniture);
        this.furniture = furniture;
    }

    public void reset() {
        liveData.setValue(new Mutable(Constants.RESET));
    }
}
