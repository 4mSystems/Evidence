package grand.app.akar.pages.ads.viewModels;

import android.util.Log;
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
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AdsRepository repository;
    private CreateAdRequest createAdRequest;
    private int dealingType, paymentMethod, docType, pool, lift, garage, furniture, mosque, school, hospital, policeStation;
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
            getCreateAdRequest().setServices(checkedServices.toString().replace("[", "").replace("]", "").replace(" ", ""));
            if (getCreateAdRequest().getListing_id() != 0) {
                compositeDisposable.add(repository.editAd(getCreateAdRequest()));
            } else
                liveData.setValue(new Mutable(Constants.AD_UPLOAD_ATTACH));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void createFlatStoreOfficeAd() {
        if (getCreateAdRequest().isFlatStoreOfficeValid()) {
            getCreateAdRequest().setServices(checkedServices.toString().replace("[", "").replace("]", "").replace(" ", ""));
            if (getCreateAdRequest().getListing_id() != 0) {
                compositeDisposable.add(repository.editAd(getCreateAdRequest()));
            } else
                liveData.setValue(new Mutable(Constants.AD_UPLOAD_ATTACH));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void createWareHouseAd() {
        if (getCreateAdRequest().isWareHouseValid()) {
            getCreateAdRequest().setServices(checkedServices.toString().replace("[", "").replace("]", "").replace(" ", ""));
            if (getCreateAdRequest().getListing_id() != 0) {
                compositeDisposable.add(repository.editAd(getCreateAdRequest()));
            } else
                liveData.setValue(new Mutable(Constants.AD_UPLOAD_ATTACH));
        } else
            liveData.setValue(new Mutable(Constants.EMPTY_WARNING));
    }

    public void createLandAd() {
        if (getCreateAdRequest().isLandValid()) {
            getCreateAdRequest().setServices(checkedServices.toString().replace("[", "").replace("]", "").replace(" ", ""));
            if (getCreateAdRequest().getListing_id() != 0) {
                compositeDisposable.add(repository.editAd(getCreateAdRequest()));
            } else
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
            getCreateAdRequest().setSwimming_pool(isChecked ? "1" : "0");
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

    public void poolChecked() {
        if (getCreateAdRequest().getSwimming_pool() != null && getCreateAdRequest().getSwimming_pool().equals("0")) {
            getCreateAdRequest().setSwimming_pool("1");
            setPool(1);
        } else if (getCreateAdRequest().getSwimming_pool() != null && getCreateAdRequest().getSwimming_pool().equals("1")) {
            getCreateAdRequest().setSwimming_pool("0");
            setPool(0);
        }
    }

    public void liftChecked() {
        if (getCreateAdRequest().getLift() != null && getCreateAdRequest().getLift().equals("0")) {
            getCreateAdRequest().setLift("1");
            setLift(1);
        } else if (getCreateAdRequest().getLift() != null && getCreateAdRequest().getLift().equals("1")) {
            getCreateAdRequest().setLift("0");
            setLift(0);
        }
    }

    public void garageChecked() {
        if (getCreateAdRequest().getGarage() != null && getCreateAdRequest().getGarage().equals("0")) {
            getCreateAdRequest().setGarage("1");
            setGarage(1);
        } else if (getCreateAdRequest().getGarage() != null && getCreateAdRequest().getGarage().equals("1")) {
            getCreateAdRequest().setGarage("0");
            setGarage(0);
        }
    }

    public void furnChecked() {
        if (getCreateAdRequest().getFurniture() != null && getCreateAdRequest().getFurniture().equals("0")) {
            getCreateAdRequest().setFurniture("1");
            setFurniture(1);
        } else if (getCreateAdRequest().getFurniture() != null && getCreateAdRequest().getFurniture().equals("1")) {
            getCreateAdRequest().setFurniture("0");
            setFurniture(0);
        }
    }

    public void mosqueChecked() {
        if (checkedServices.contains(ResourceManager.getString(R.string.mosque))) {
            checkedServices.remove(ResourceManager.getString(R.string.mosque));
            setMosque(0);
        } else {
            checkedServices.add(ResourceManager.getString(R.string.mosque));
            setMosque(1);
        }
    }

    public void schoolChecked() {
        if (checkedServices.contains(ResourceManager.getString(R.string.school))) {
            checkedServices.remove(ResourceManager.getString(R.string.school));
            setSchool(0);
        } else {
            checkedServices.add(ResourceManager.getString(R.string.school));
            setSchool(1);
        }
    }

    public void hospitalChecked() {
        if (checkedServices.contains(ResourceManager.getString(R.string.hospital))) {
            checkedServices.remove(ResourceManager.getString(R.string.hospital));
            setHospital(0);
        } else {
            checkedServices.add(ResourceManager.getString(R.string.hospital));
            setHospital(1);
        }
    }

    public void stationChecked() {
        if (checkedServices.contains(ResourceManager.getString(R.string.police_station))) {
            checkedServices.remove(ResourceManager.getString(R.string.police_station));
            setPoliceStation(0);
        } else {
            checkedServices.add(ResourceManager.getString(R.string.police_station));
            setPoliceStation(1);
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

    @Bindable
    public CreateAdRequest getCreateAdRequest() {
        return createAdRequest;
    }

    @Bindable
    public void setCreateAdRequest(CreateAdRequest createAdRequest) {
        if (createAdRequest.getListing_id() == 0) {
            createAdRequest.setPayment_method(ResourceManager.getString(R.string.cash));
            createAdRequest.setDoc_type(ResourceManager.getString(R.string.real_estate_certificate));
        } else {
            if (createAdRequest.getPayment_method().equals(ResourceManager.getString(R.string.cash)))
                setPaymentMethod(0);
            else if (createAdRequest.getPayment_method().equals(ResourceManager.getString(R.string.sac)))
                setPaymentMethod(1);
            else
                setPaymentMethod(2);
            setDealingType(createAdRequest.getListing_type());
            if (createAdRequest.getDoc_type().equals(ResourceManager.getString(R.string.real_estate_certificate)))
                setDocType(0);
            else if (createAdRequest.getDoc_type().equals(ResourceManager.getString(R.string.customize)))
                setDocType(1);
            else if (createAdRequest.getDoc_type().equals(ResourceManager.getString(R.string.holy_king)))
                setDocType(2);
            else
                setDocType(3);
            setPool(Integer.parseInt(createAdRequest.getSwimming_pool() != null ? createAdRequest.getSwimming_pool() : "0"));
            setLift(Integer.parseInt(createAdRequest.getLift() != null ? createAdRequest.getLift() : "0"));
            setGarage(Integer.parseInt(createAdRequest.getGarage() != null ? createAdRequest.getGarage() : "0"));
            setFurniture(Integer.parseInt(createAdRequest.getFurniture() != null ? createAdRequest.getFurniture() : "0"));
            checkedServices = createAdRequest.getServicesList();
            // make options Selected
            Log.e("setCreateAdRequest", "setCreateAdRequest: " + createAdRequest.getServicesList());
            for (int i = 0; i < checkedServices.size(); i++) {
                if (checkedServices.get(i).equals(ResourceManager.getString(R.string.mosque))) {
                    setMosque(1);
                }
                if (checkedServices.get(i).equals(ResourceManager.getString(R.string.school))) {
                    setSchool(1);
                }
                if (checkedServices.get(i).equals(ResourceManager.getString(R.string.hospital))) {
                    setHospital(1);
                }
                if (checkedServices.get(i).equals(ResourceManager.getString(R.string.police_station))) {
                    setPoliceStation(1);
                }
            }
        }
        notifyChange(BR.createAdRequest);
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

    @Bindable
    public int getMosque() {
        return mosque;
    }

    @Bindable
    public void setMosque(int mosque) {
        notifyChange(BR.mosque);
        this.mosque = mosque;
    }

    @Bindable
    public int getSchool() {
        return school;
    }

    @Bindable
    public void setSchool(int school) {
        notifyChange(BR.school);
        this.school = school;
    }

    @Bindable
    public int getHospital() {
        return hospital;
    }

    @Bindable
    public void setHospital(int hospital) {
        notifyChange(BR.hospital);
        this.hospital = hospital;
    }

    @Bindable
    public int getPoliceStation() {
        return policeStation;
    }

    @Bindable
    public void setPoliceStation(int policeStation) {
        notifyChange(BR.policeStation);
        this.policeStation = policeStation;
    }

    public void toMyAds() {
        liveData.setValue(new Mutable(Constants.MY_ADS));
    }
}
