package te.app.evidence.customViews.menu;

/**
 * Created by mohamedatef on 12/30/18.
 */

import android.annotation.SuppressLint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import te.app.evidence.R;
import te.app.evidence.customViews.actionbar.HomeActionBarView;
import te.app.evidence.databinding.LayoutNavigationDrawerBinding;
import te.app.evidence.model.base.Mutable;


@SuppressLint("ViewConstructor")
public class NavigationDrawerView extends RelativeLayout {
    public MutableLiveData<Mutable> liveData;
    public LayoutNavigationDrawerBinding layoutNavigationDrawerBinding;
    AppCompatActivity context;
    HomeActionBarView homeActionBarView;
    private MenuViewModel menuViewModel;

    public NavigationDrawerView(AppCompatActivity context) {
        super(context);
        this.context = context;
        liveData = new MutableLiveData<>();
        init();
    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();

    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutNavigationDrawerBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_navigation_drawer, this, true);
        menuViewModel = new MenuViewModel();
        layoutNavigationDrawerBinding.setMenuViewModel(menuViewModel);
        setEvents();
    }


    public void setActionBar(HomeActionBarView homeActionBarView) {
        this.homeActionBarView = homeActionBarView;
    }

    //home - profile - ads - stories - chat_history - gallery - orders - reviews - famous_people - credit_card
    //label_notification - photographer_people - help_and_support - label_privacy_policy - label_language
    // label_share_app - rate_app - be_shop - label_logout
    private void setEvents() {
//        menuViewModel.getMenuAdapter().getLiveDataAdapter().observeForever(new Observer<Integer>() {
//            @Override
//            public void onChanged(@Nullable Integer position) {
//                Log.e("onChanged", "onChanged: " + position);
//                layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(GravityCompat.START);
////                // select menu
////                int pos = position;
////                String id = menu.get(pos).id;
////                Log.d(TAG, "onChanged: " + id);
////                Intent intent = null;
////                Service service = MoataHelper.checkServiceSelect(id);
////                if (service != null) {
////                    Bundle bundle = new Bundle();
////                    bundle.putSerializable(Constants.CATEGORY, service);
////                    bundle.putString(Constants.SEARCH_BAR, Constants.SEARCH_BAR);
////                    bundle.putString(Constants.PAGE, CategoryFragment.class.getName());
////                    MovementHelper.startActivityBase(context, bundle, service.name);
////                } else if (id.equals(Constants.HOME)) {
////                    homePage();
////                } else if (id.equals(Constants.CHAT)) {
////                    if (UserHelper.getUserId() != -1)
////                        goToBasePage(ChatFragment.class.getName(), context.getString(R.string.chat), new Bundle());
////                    else
////                        liveData.setValue(new Mutable(Constants.LOGIN_FIRST));
////                } else if (id.equals(Constants.MYREQUESTS)) {
////                    if (UserHelper.getUserId() != -1)
////                        goToBasePage(OrdersFragment.class.getName(), context.getString(R.string.my_requests), new Bundle());
////                    else
////                        liveData.setValue(new Mutable(Constants.LOGIN_FIRST));
////                } else if (id.equals(Constants.FAVOURITE)) {
////                    if (UserHelper.getUserId() != -1)
////                        goToBasePage(FavouriteFragment.class.getName(), context.getString(R.string.favourite), new Bundle());
////                    else
////                        liveData.setValue(new Mutable(Constants.LOGIN_FIRST));
////                } else if (id.equals(Constants.COMPLAIN)) {
////                    Bundle bundle = new Bundle();
////                    bundle.putInt(Constants.STATUS, 1);
////                    goToBasePage(ContactUsFragment.class.getName(), context.getString(R.string.complain_and_suggest), bundle);
////                } else if (id.equals(Constants.CONTACT_US)) {
////                    goToBasePage(ContactUsFragment.class.getName(), context.getString(R.string.contact_us), new Bundle());
////                } else if (id.equals(Constants.RATE_APP)) {
////                    MovementHelper.startWebPage(context, AppHelper.getPlayStoreLink(context));
////                } else if (id.equals(Constants.SOCIAL)) {
////                    goToBasePage(SocialMediaFragment.class.getName(), context.getString(R.string.social_media), new Bundle());
////                } else if (id.equals(Constants.TERMS_AND_CONDITIONS)) {
////                    Bundle bundle = new Bundle();
////                    bundle.putInt(Constants.STATUS, 1);
////                    goToBasePage(SettingsFragment.class.getName(), context.getString(R.string.terms_and_conditions), bundle);
////                } else if (id.equals(Constants.LANGUAGE)) {
////                    new LanguageDialog(context).show();
////                } else if (id.equals(Constants.NOTIFICATIONS)) {
////                    goToBasePage(NotificationFragment.class.getName(), context.getString(R.string.notifications), new Bundle());
////                }
//            }
//        });

    }

}
