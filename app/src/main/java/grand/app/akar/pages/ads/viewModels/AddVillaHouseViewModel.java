package grand.app.akar.pages.ads.viewModels;

import android.widget.CompoundButton;
import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.models.CreateAdRequest;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class AddVillaHouseViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AdsRepository repository;
    private CreateAdRequest createAdRequest;
    private int dealingType, paymentMethod, docType;
    ArrayList<String> checkedServices = new ArrayList<>();

    @Inject
    public AddVillaHouseViewModel(AdsRepository repository) {
        createAdRequest = new CreateAdRequest();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void createAd() {
        if (getCreateAdRequest().isVillaHouseManagementValid()) {
            liveData.setValue(new Mutable(Constants.AD_UPLOAD_ATTACH));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void dealingTypeAction(int type) {
        getCreateAdRequest().setListing_type(type);
        setDealingType(type);
    }

    public void paymentMethodAction(String payment, int type) {
        getCreateAdRequest().setPayment_method(payment);
        setPaymentMethod(type);
    }

    public void docTypeAction(String doc, int type) {
        getCreateAdRequest().setDoc_type(doc);
        setDocType(type);
    }

    public void onToggleChange(CompoundButton compat, Boolean isChecked) {
        if (compat.getId() == R.id.pool_toggle) {
            getCreateAdRequest().setSwimming_pool(isChecked ? 1 : 0);
        } else if (compat.getId() == R.id.elevator_toggle) {
            getCreateAdRequest().setLift(isChecked ? "1" : "0");
        } else if (compat.getId() == R.id.garage_toggle) {
            getCreateAdRequest().setGarage(isChecked ? "1" : "0");
        } else if (compat.getId() == R.id.furniture_toggle) {
            getCreateAdRequest().setFurniture(isChecked ? "1" : "0");
        }
    }

    public void onCheckChange(CompoundButton compat, Boolean isChecked) {
        String checked = "";
        if (compat.getId() == R.id.mosque) {
            checked = ResourceManager.getString(R.string.mosque);
        } else if (compat.getId() == R.id.school) {
            checked = ResourceManager.getString(R.string.school);
        } else if (compat.getId() == R.id.hospital) {
            checked = ResourceManager.getString(R.string.hospital);
        } else if (compat.getId() == R.id.police_station) {
            checked = ResourceManager.getString(R.string.police_station);
        }
        if (checkedServices.contains(checked)) {
            checkedServices.remove(checked);
        } else {
            checkedServices.add(checked);
        }
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

    public AdsRepository getRepository() {
        return repository;
    }

    public CreateAdRequest getCreateAdRequest() {
        return createAdRequest;
    }

    public void setCreateAdRequest(CreateAdRequest createAdRequest) {
        this.createAdRequest = createAdRequest;
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
}
