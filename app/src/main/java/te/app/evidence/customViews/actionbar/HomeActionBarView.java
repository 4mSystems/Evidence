package te.app.evidence.customViews.actionbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import te.app.evidence.R;
import te.app.evidence.customViews.menu.NavigationDrawerView;
import te.app.evidence.databinding.LayoutActionBarHomeBinding;

public class HomeActionBarView extends RelativeLayout {
    public LayoutActionBarHomeBinding layoutActionBarHomeBinding;
    NavigationDrawerView navigationDrawerView;
    DrawerLayout drawerLayout;
    private Context context;

    public HomeActionBarView(Context context) {
        super(context);
        this.context = context;
        init();
    }


    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarHomeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_home, this, true);
        setEvents();
    }

    private void setEvents() {
        layoutActionBarHomeBinding.imgHomeBarMenu.setOnClickListener(view -> connectDrawer(HomeActionBarView.this.drawerLayout, false));
    }


    public void connectDrawer(DrawerLayout drawerLayout, boolean firstConnect) {
        if (firstConnect) {
            this.drawerLayout = drawerLayout;
            return;
        } else {
            if (drawerLayout.isDrawerOpen(GravityCompat.END))
                drawerLayout.closeDrawer(GravityCompat.START);
            else
                drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    public void setNavigation(NavigationDrawerView navigationDrawerView) {
        this.navigationDrawerView = navigationDrawerView;
    }

    public void setTitle(String string) {
        layoutActionBarHomeBinding.tvHomeBarText.setText(string);
    }
}