package te.app.evidence.customViews.menu;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import java.util.Objects;

import te.app.evidence.R;
import te.app.evidence.base.ParentActivity;
import te.app.evidence.customViews.actionbar.HomeActionBarView;
import te.app.evidence.databinding.ExitLayoutBinding;
import te.app.evidence.databinding.LayoutNavigationDrawerBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.AddCaseFragment;
import te.app.evidence.pages.cases.CasesFragment;
import te.app.evidence.pages.categories.CategoriesFragment;
import te.app.evidence.pages.clients.ClientsFragment;
import te.app.evidence.pages.home.HomeFragment;
import te.app.evidence.pages.mohdrs.BailiffsFragment;
import te.app.evidence.pages.profile.ProfileFragment;
import te.app.evidence.pages.users.UsersFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.resources.ResourceManager;
import te.app.evidence.utils.session.LanguagesHelper;


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
            if (o.equals(Constants.HOME)) {
                homeActionBarView.setTitle(ResourceManager.getString(R.string.menuHome));
                MovementHelper.replaceFragment(context, new HomeFragment(), "");
            } else if (o.equals(Constants.CLIENTS)) {
                MovementHelper.startActivity(context, ClientsFragment.class.getName(), ResourceManager.getString(R.string.clients), null);
            } else if (o.equals(Constants.PROFILE)) {
                MovementHelper.startActivity(context, ProfileFragment.class.getName(), ResourceManager.getString(R.string.profile_edit), null);
            } else if (o.equals(Constants.USERS)) {
                MovementHelper.startActivity(context, UsersFragment.class.getName(), ResourceManager.getString(R.string.menuUsers), null);
            } else if (o.equals(Constants.CATEGORIES)) {
                MovementHelper.startActivity(context, CategoriesFragment.class.getName(), ResourceManager.getString(R.string.menuCat), null);
            } else if (o.equals(Constants.ADD_CASE)) {
                MovementHelper.startActivity(context, AddCaseFragment.class.getName(), ResourceManager.getString(R.string.add_case), null);
            } else if (o.equals(Constants.ALL_CASES)) {
                MovementHelper.startActivity(context, CasesFragment.class.getName(), ResourceManager.getString(R.string.search_case), null);
            } else if (o.equals(Constants.GET_MOHDAREEN)) {
                MovementHelper.startActivity(context, BailiffsFragment.class.getName(), ResourceManager.getString(R.string.menuMohdar), null);
            } else if (o.equals(Constants.ERROR_TOAST)) {
                ((ParentActivity) context).toastError(ResourceManager.getString(R.string.no_permission));
            } else if (o.equals(Constants.LANGUAGE)) {
                LanguagesHelper.setLanguage(LanguagesHelper.getCurrentLanguage().equals("en") ? "ar" : "en");
                MovementHelper.startActivityMain(context);
            } else if (o.equals(Constants.REMOVE_DIALOG)) {
                exitDialog(ResourceManager.getString(R.string.logout_text));
            }
            layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(GravityCompat.START);
        });

    }

    public void exitDialog(String text) {
        Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ExitLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(dialog.getContext()), R.layout.exit_layout, null, false);
        dialog.setContentView(binding.getRoot());
        binding.logoutTxt.setText(text);
        binding.agree.setOnClickListener(v -> {
            dialog.dismiss();
            ((ParentActivity) context).handleActions(new Mutable(Constants.LOGOUT));
        });
        binding.decline.setOnClickListener(v -> dialog.dismiss());
        dialog.show();
    }
}
