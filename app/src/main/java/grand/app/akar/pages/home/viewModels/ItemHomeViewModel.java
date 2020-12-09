package grand.app.akar.pages.home.viewModels;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.utils.Constants;

public class ItemHomeViewModel extends BaseViewModel {
    public HomeData homeData;
    public String image = "https:\\/\\/takeme.cmy-staff.net\\/defaultd.png";

    public ItemHomeViewModel(HomeData homeData) {
        this.homeData = homeData;

    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    public void itemAction() {
        //TODO Item Action with liveData
        getLiveData().setValue(Constants.MENu);
    }

}
