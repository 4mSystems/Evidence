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
import te.app.evidence.pages.cases.AddCaseFragment;
import te.app.evidence.pages.categories.CategoriesFragment;
import te.app.evidence.pages.clients.ClientsFragment;
import te.app.evidence.pages.users.UsersFragment;
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
                MovementHelper.startActivity(context, ClientsFragment.class.getName(), ResourceManager.getString(R.string.clients), null);
            } else if (o.equals(Constants.USERS)) {
                MovementHelper.startActivity(context, UsersFragment.class.getName(), ResourceManager.getString(R.string.menuUsers), null);
            } else if (o.equals(Constants.CATEGORIES)) {
                MovementHelper.startActivity(context, CategoriesFragment.class.getName(), ResourceManager.getString(R.string.menuCat), null);
            }else if (o.equals(Constants.ADD_CASE)) {
                MovementHelper.startActivity(context, AddCaseFragment.class.getName(), ResourceManager.getString(R.string.add_case), null);
            }
            layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(GravityCompat.START);
        });

    }

}
