package grand.app.akar.pages.adDetails.viewModels;


import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.maps.model.LatLng;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.BR;
import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.base.MyApplication;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.adDetails.adapters.ReportDialogReasonsAdapter;
import grand.app.akar.pages.adDetails.adapters.SliderAdapter;
import grand.app.akar.pages.adDetails.models.AdDetailsData;
import grand.app.akar.pages.adDetails.models.ReportRequest;
import grand.app.akar.pages.adDetails.models.SliderItem;
import grand.app.akar.pages.favorites.models.FavoriteRequest;
import grand.app.akar.pages.home.adapters.HomeAdapter;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.repository.AdsRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.AppHelper;
import grand.app.akar.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class AdDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AdsRepository adsRepository;
    HomeData homeData;
    AdDetailsData adDetailsData;
    HomeAdapter homeAdapter;
    public String title;
    SliderAdapter sliderAdapter;
    ReportDialogReasonsAdapter reportDialogReasonsAdapter;
    ReportRequest reportRequest;

    @Inject
    public AdDetailsViewModel(AdsRepository adsRepository) {
        reportRequest = new ReportRequest();
        reportDialogReasonsAdapter = new ReportDialogReasonsAdapter();
        sliderAdapter = new SliderAdapter();
        homeData = new HomeData();
        adDetailsData = new AdDetailsData();
        homeAdapter = new HomeAdapter();
        this.adsRepository = adsRepository;
        this.liveData = new MutableLiveData<>();
        adsRepository.setLiveData(liveData);
    }

    public void adDetails() {
        compositeDisposable.add(adsRepository.getAdDetails(getHomeData().getId()));
    }

    public void updateDate() {
        compositeDisposable.add(adsRepository.updateDate(getHomeData().getId()));
    }

    public void delete() {
        compositeDisposable.add(adsRepository.removeAd(getHomeData().getId()));
    }

    public void removeFavorites(int type, int listingId) {
        // the parameter in the url is type send 0 for favorites and 1 for contacts
        compositeDisposable.add(adsRepository.removeFavoriteAd(new FavoriteRequest(listingId, type)));
    }

    public void sendReport() {
        List<Integer> reasonsId = new ArrayList<>();
        for (int i = 0; i < getReportDialogReasonsAdapter().getReasonsItemList().size(); i++) {
            if (getReportDialogReasonsAdapter().getReasonsItemList().get(i).isChecked()) {
                reasonsId.add(getReportDialogReasonsAdapter().getReasonsItemList().get(i).getId());
            }
        }
        if (reasonsId.size() > 0) {
            getReportRequest().setReason_id(reasonsId);
            getReportRequest().setListing_id(getAdDetailsData().getListing().getId());
            compositeDisposable.add(adsRepository.sendReport(getReportRequest()));
        }
    }

    public AdsRepository getAdsRepository() {
        return adsRepository;
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


    public void toMap() {
        AppHelper.startAndroidGoogleMap(MyApplication.getInstance(), null, new LatLng(Double.parseDouble(getAdDetailsData().getListing().getLat()), Double.parseDouble(getAdDetailsData().getListing().getLng())));
    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    @Bindable
    public void setHomeData(HomeData homeData) {
        setTitle(homeData);
        notifyChange(BR.homeData);
        this.homeData = homeData;
    }

    @Bindable
    public AdDetailsData getAdDetailsData() {
        return adDetailsData;
    }

    @Bindable
    public void setAdDetailsData(AdDetailsData adDetailsData) {
        getHomeAdapter().update(adDetailsData.getRelatedListings());
        adDetailsData.getListing().getSlider().add(new SliderItem(adDetailsData.getListing().getId(), adDetailsData.getListing().getDefaultImg().getId(), adDetailsData.getListing().getDefaultImg().getMedia(), adDetailsData.getListing().getDefaultImg().getType()));
        getSliderAdapter().updateData(adDetailsData.getListing().getSlider());
        notifyChange(BR.adDetailsData);
        this.adDetailsData = adDetailsData;
    }

    public ReportRequest getReportRequest() {
        return reportRequest;
    }

    public void setupSlider(SliderView sliderView) {
        sliderView.setSliderAdapter(sliderAdapter);
    }

    public SliderAdapter getSliderAdapter() {
        return sliderAdapter;
    }

    public HomeAdapter getHomeAdapter() {
        return homeAdapter;
    }

    public ReportDialogReasonsAdapter getReportDialogReasonsAdapter() {
        return reportDialogReasonsAdapter;
    }

    public void setTitle(HomeData homeData) {
        String type = homeData.getType();
        switch (homeData.getListingType()) {
            case 0:
                title = ResourceManager.getString(R.string.villa).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 1:
                title = ResourceManager.getString(R.string.house).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 2:
                title = ResourceManager.getString(R.string.flat).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 3:
                title = ResourceManager.getString(R.string.ware_house).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 4:
                title = ResourceManager.getString(R.string.store).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 5:
                title = ResourceManager.getString(R.string.land).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 6:
                title = ResourceManager.getString(R.string.manage_building).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 7:
                title = ResourceManager.getString(R.string.factory).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 8:
                title = ResourceManager.getString(R.string.rest).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 9:
                title = ResourceManager.getString(R.string.building).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;
            case 10:
                title = ResourceManager.getString(R.string.office).concat(" ").concat(type.equals("0") ? ResourceManager.getString(R.string.rent) : ResourceManager.getString(R.string.sell));
                break;

        }
    }

    public void call() {
        liveData.setValue(new Mutable(Constants.CALL));
    }

    public void share() {
        liveData.setValue(new Mutable(Constants.SHARE_BAR));
    }

    public void openEditDialog() {
        liveData.setValue(new Mutable(Constants.EDIT_DIALOG));
    }

    public void report() {
        liveData.setValue(new Mutable(Constants.REPORT));
    }

    public void dialogDismiss() {
        liveData.setValue(new Mutable(Constants.DISMISS));
    }

    public void toEditImages() {
        liveData.setValue(new Mutable(Constants.AD_UPLOAD_ATTACH));
    }
}