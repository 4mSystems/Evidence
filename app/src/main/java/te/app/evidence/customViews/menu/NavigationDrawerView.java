package te.app.evidence.customViews.menu;


import android.annotation.SuppressLint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import te.app.evidence.R;
import te.app.evidence.customViews.actionbar.HomeActionBarView;
import te.app.evidence.databinding.LayoutNavigationDrawerBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.clients.ClientsFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;


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

    private void setEvents() {
        menuViewModel.getLiveData().observe(context, o -> {
            if (o.equals(Constants.CLIENTS)) {
                homeActionBarView.setTitle(ResourceManager.getString(R.string.clients));
                MovementHelper.replaceFragment(context, new ClientsFragment(), "");
            }
            layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(GravityCompat.START);
        });

    }

}