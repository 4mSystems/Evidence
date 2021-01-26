package te.app.evidence.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.evidence.R;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.customViews.actionbar.HomeActionBarView;
import te.app.evidence.customViews.menu.NavigationDrawerView;
import te.app.evidence.databinding.ActivityMainBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.home.HomeFragment;
import te.app.evidence.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    public HomeActionBarView homeActionBarView = null;
    public NavigationDrawerView navigationDrawerView;

    ActivityMainBinding activityMainBinding;
    @Inject
    MutableLiveData<Mutable> liveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        homeActionBarView = new HomeActionBarView(this);
        navigationDrawerView = new NavigationDrawerView(this);
        activityMainBinding.llBaseContainer.addView(navigationDrawerView);
        navigationDrawerView.layoutNavigationDrawerBinding.llBaseActionBarContainer.addView(homeActionBarView, 0);
        homeActionBarView.setNavigation(navigationDrawerView);
        homeActionBarView.connectDrawer(navigationDrawerView.layoutNavigationDrawerBinding.dlMainNavigationMenu, true);
        navigationDrawerView.setActionBar(homeActionBarView);
        homeActionBarView.setTitle(getString(R.string.menuHome));
        MovementHelper.replaceFragment(this, new HomeFragment(), "");

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
