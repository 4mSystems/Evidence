package grand.app.akar.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

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
import grand.app.akar.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    public HomeActionBarView homeActionBarView = null;
    ActivityMainBinding activityMainBinding;

    @Inject
    MutableLiveData<Mutable> liveData;


    @Inject
    public Api api;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
//        initializeToken();
        setContentView(R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.homeNavigationMenu.inflateMenu(R.menu.bottom_navigation_menu);
        homeActionBarView = new HomeActionBarView(this);
        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        //        if(getIntent().hasExtra(Constants.PAGE) && getIntent().getStringExtra(Constants.PAGE).equals(Constants.LOGIN))
////            navigationDrawerView.loginPage();
//        else  if(getIntent().hasExtra(Constants.PAGE) && getIntent().getStringExtra(Constants.PAGE).equals(Constants.MYREQUESTS))
//            navigationDrawerView.goToBasePage(OrdersFragment.class.getName(),getString(R.string.my_requests),new Bundle());
//        else
//            navigationDrawerView.homePage();
        setEvents();

    }

    private void setEvents() {
//        navigationDrawerView.liveData.observe( this, new Observer<Object>() {
//            @SuppressLint("WrongConstant")
//            public void onChanged(@Nullable Object object) {
//                liveData.setValue(new Mutable());
//                Mutable mutable = (Mutable) object;
//                if(!mutable.message.equals(Constants.LOGIN_FIRST)) {
//                    homeActionBarView.setTitle(mutable.message);
//                    navigationDrawerView.layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(Gravity.START);
//                }else {
//                    toastMessage(ResourceManager.getString(R.string.please_login_first), R.drawable.ic_info_white, R.color.colorPrimary);
//                }
//            }
//        });
    }
}
