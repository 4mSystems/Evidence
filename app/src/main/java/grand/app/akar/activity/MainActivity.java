package grand.app.akar.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.ParentActivity;
import grand.app.akar.connection.Api;
import grand.app.akar.customViews.actionbar.HomeActionBarView;
import grand.app.akar.databinding.ActivityMainBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.home.HomeFragment;
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
        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        setEvents();

    }

    private void setEvents() {
        viewModel.liveData.observe((LifecycleOwner) this, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.MENU_HOME:
                    MovementHelper.replaceFragment(this, new HomeFragment(), "");
                    break;
                case Constants.MENU_FAVORITE:
//                    MovementHelper.replaceHomeFragment(context, new Favor());
                    break;
                case Constants.MENU_ACCOUNT:
                    MovementHelper.replaceFragment(this, new MyAccountFragment(), "");
                    break;
            }
        });
    }
}
