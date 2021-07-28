package te.app.evidence.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import te.app.evidence.R;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.customViews.actionbar.BackActionBarView;
import te.app.evidence.databinding.ActivityBaseBinding;
import te.app.evidence.pages.splash.SplashFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

public class BaseActivity extends ParentActivity {
    private static final String TAG = "BaseActivity";
    ActivityBaseBinding activityBaseBinding;
    public BackActionBarView backActionBarView;
    MutableLiveData<Boolean> refreshingLiveData = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityBaseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base);
        getNotification();
        if (!notification_checked) {
            if (getIntent().hasExtra(Constants.PAGE)) {
                String fragmentName = getIntent().getStringExtra(Constants.PAGE);
                if (fragmentName != null) {
                    try {
                        Fragment fragment = (Fragment) Class.forName(fragmentName).newInstance();
                        MovementHelper.replaceFragmentTag(this, getBundle(fragment), fragmentName, "");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else
                MovementHelper.replaceFragment(this, new SplashFragment(), "");
        }
        enableRefresh(false);
        activityBaseBinding.swipeContainer.setOnRefreshListener(() -> {
            refreshingLiveData.setValue(true);
        });
    }

    private void setTitleName() {
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            backActionBarView = new BackActionBarView(this);
            backActionBarView.setTitle(getIntent().getStringExtra(Constants.NAME_BAR));
            if (getIntent().hasExtra(Constants.SHARE_BAR))
                backActionBarView.layoutActionBarBackBinding.print.setVisibility(View.VISIBLE);
            activityBaseBinding.llBaseActionBarContainer.addView(backActionBarView);
        }
    }

    public void getNotification() {
//        Log.d(TAG, "Notification GET");
//        if (getIntent().getExtras() != null && getIntent().hasExtra(Constants.BUNDLE_NOTIFICATION)) {
//            Log.d(TAG, "Notification HAS EXTRA");
//            Bundle bundle = getIntent().getBundleExtra(Constants.BUNDLE_NOTIFICATION);
//            NotificationGCMModel model = (NotificationGCMModel) bundle.getSerializable(Constants.BUNDLE_NOTIFICATION);
//            if (model != null) {
//                if(model.notification_type == 1){
//                    setTitleName(ResourceManager.getString(R.string.notifications));
//                    notification_checked = true;
//                    MovementHelper.replaceFragment(this, new NotificationFragment(), "");
//                    return;
//                }else if(model.notification_type == 2){
//                    setTitleName(ResourceManager.getString(R.string.order_number) + " (" + model.orderNumber + ")");
//                    notification_checked = true;
//                    OrderDetailsFragment orderDetailsFragment = new OrderDetailsFragment();
//                    bundle.putInt(Constants.ID,model.orderId);
//                    bundle.putBoolean(Constants.ACTION,false);
//                    orderDetailsFragment.setArguments(bundle);
//                    MovementHelper.replaceFragment(this,orderDetailsFragment, "");
//                    return;
//                }else if(model.notification_type == 3){
//                    setTitleName(ResourceManager.getString(R.string.chat));
//                    notification_checked = true;
//                    MovementHelper.replaceFragment(this, new ChatFragment(), "");
//                    return;
//                }
//            }
//            return;
//
//        }
    }

    private Fragment getBundle(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE, getIntent().getStringExtra(Constants.BUNDLE));
        fragment.setArguments(bundle);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            setTitleName();
        }

        return fragment;
    }

    @Override
    public void onBackPressed() {
        try {
            if (dialogLoader != null && dialogLoader.isShowing()) {
                dialogLoader.dismiss();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        super.onBackPressed();
    }

    public void enableRefresh(boolean status) {
        activityBaseBinding.swipeContainer.setEnabled(status);
    }

    public void stopRefresh(boolean status) {
        activityBaseBinding.swipeContainer.setRefreshing(status);
    }

    public MutableLiveData<Boolean> getRefreshingLiveData() {
        return refreshingLiveData;
    }


}