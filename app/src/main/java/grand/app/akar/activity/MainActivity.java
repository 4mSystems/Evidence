package grand.app.akar.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.ParentActivity;
import grand.app.akar.customViews.actionbar.HomeActionBarView;
import grand.app.akar.databinding.ActivityMainBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.ads.AdsInfoFragment;
import grand.app.akar.pages.conversations.ConversationsFragment;
import grand.app.akar.pages.favorites.MyFavoritesMainFragment;
import grand.app.akar.pages.home.HomeCitiesFragment;
import grand.app.akar.pages.home.viewModels.HomeViewModel;
import grand.app.akar.pages.myAccount.MyAccountFragment;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    public HomeActionBarView homeActionBarView = null;
    ActivityMainBinding activityMainBinding;
    @Inject
    MutableLiveData<Mutable> liveData;
    @Inject
    HomeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityMainBinding.setViewModel(viewModel);
        activityMainBinding.homeNavigationMenu.inflateMenu(R.menu.bottom_navigation_menu);
        homeActionBarView = new HomeActionBarView(this);
        MovementHelper.replaceFragment(this, new HomeCitiesFragment(), "");
        setEvents();

    }

    private void setEvents() {
        viewModel.liveData.observe(this, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.MENU_HOME:
                    MovementHelper.replaceFragment(this, new HomeCitiesFragment(), "");
                    break;
                case Constants.MENU_FAVORITE:
                    MovementHelper.replaceFragment(this, new MyFavoritesMainFragment(), "");
                    break;
                case Constants.MENU_CONVERSATIONS:
                    MovementHelper.replaceFragment(this, new ConversationsFragment(), "");
                    break;
                case Constants.MENU_ACCOUNT:
                    MovementHelper.replaceFragment(this, new MyAccountFragment(), "");
                    break;
                case Constants.MENU_ADD_AD:
                    MovementHelper.startActivity(this, AdsInfoFragment.class.getName(), getResources().getString(R.string.add_info_title), null);
                    break;
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
