package te.app.evidence.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.customViews.actionbar.BackActionBarView;
import te.app.evidence.databinding.ActivityBaseBinding;
import te.app.evidence.pages.services.ServicesFragment;
import te.app.evidence.pages.splash.SplashFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;

public class BaseActivity extends ParentActivity {
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
        backActionBarView = new BackActionBarView(this);
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
        activityBaseBinding.swipeContainer.setOnRefreshListener(() -> refreshingLiveData.setValue(true));
    }

    private void setTitleName(@Nullable String title) {
        if (title != null) {
            backActionBarView.setTitle(title);
        } else {
            if (getIntent().hasExtra(Constants.NAME_BAR)) {
                backActionBarView.setTitle(getIntent().getStringExtra(Constants.NAME_BAR));
                if (getIntent().hasExtra(Constants.SHARE_BAR))
                    backActionBarView.layoutActionBarBackBinding.print.setVisibility(View.VISIBLE);
            }
        }
        activityBaseBinding.llBaseActionBarContainer.addView(backActionBarView);
    }

    public void getNotification() {
        if (getIntent() != null && getIntent().getBooleanExtra("is_notification", false)) {
            if (getIntent().getSerializableExtra(Constants.TYPE) != null) {
                notification_checked = true;
                String typeNotifications = getIntent().getStringExtra(Constants.TYPE);
                String serviceId = getIntent().getStringExtra(Constants.SERVICE_ID);
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(serviceId)) {
                    if (Constants.SERVICE_TYPE.equals(typeNotifications)) {  // post details
                        setTitleName(ResourceManager.getString(R.string.service_title));
                        ServicesFragment homeMainFragment = new ServicesFragment();
                        bundle.putString(Constants.BUNDLE, new Gson().toJson(new PassingObject(Integer.parseInt(serviceId))));
                        homeMainFragment.setArguments(bundle);
                        MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                    } else {
                        MovementHelper.startActivityMain(this);
                    }
                }
            }
        }
    }

    private Fragment getBundle(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE, getIntent().getStringExtra(Constants.BUNDLE));
        fragment.setArguments(bundle);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            setTitleName(null);
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