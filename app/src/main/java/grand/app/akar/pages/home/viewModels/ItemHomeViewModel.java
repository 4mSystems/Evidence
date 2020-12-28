package grand.app.akar.pages.home.viewModels;

import androidx.databinding.Bindable;

import grand.app.akar.BR;
import grand.app.akar.R;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.resources.ResourceManager;

public class ItemHomeViewModel extends BaseViewModel {
    public HomeData homeData;
    public String title;

    public ItemHomeViewModel(HomeData homeData) {
        this.homeData = homeData;
        setTitle(homeData);
    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }
    public void removeFavorite() {
        getLiveData().setValue(Constants.REMOVE_FAVO);
    }
    public void removeAd() {
        getLiveData().setValue(Constants.REMOVE_AD);
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
}
