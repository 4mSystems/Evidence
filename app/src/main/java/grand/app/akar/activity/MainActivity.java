package grand.app.akar.activity;

import android.app.ActivityManager;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.base.ParentActivity;
import grand.app.akar.connection.Api;
import grand.app.akar.customViews.actionbar.HomeActionBarView;
import grand.app.akar.databinding.ActivityMainBinding;
import grand.app.akar.model.base.Mutable;

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


    @Override
    public void onBackPressed() {

        ActivityManager mngr = (ActivityManager) getSystemService(ACTIVITY_SERVICE);

        List<ActivityManager.RunningTaskInfo> taskList = mngr.getRunningTasks(10);

        if (taskList.get(0).numActivities == 1 &&
                taskList.get(0).topActivity.getClassName().equals(this.getClass().getName())) {
            if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                super.onBackPressed();
                return;
            }
//            BaseFragment baseFragment = (BaseFragment) getSupportFragmentManager().findFragmentByTag(Constants.HOME);
//            if (baseFragment != null) {
//                int[] ids = {R.id.tv_dialog_close_app_yes, R.id.tv_dialog_close_app_no};
//                DialogHelper.showDialogHelper(MainActivity.this, R.layout.dialog_logout_app, ids, (dialog, view) -> {
//                    switch (view.getId()) {
//                        case R.id.tv_dialog_close_app_yes:
//                            dialog.dismiss();
//                            finish();
//                            break;
//                        case R.id.tv_dialog_close_app_no:
//                            dialog.dismiss();
//                            break;
//
//                    }
//                });
//            } else {
//                navigationDrawerView.homePage();
//
//            }
            return;

        } else
            finish();

    }

}
