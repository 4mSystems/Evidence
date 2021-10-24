// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.menu.MenuViewModel;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.customViews.views.CustomTextViewRegular;

public abstract class LayoutNavigationDrawerBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewRegular addCase;

  @NonNull
  public final DrawerLayout dlMainNavigationMenu;

  @NonNull
  public final FrameLayout flHomeContainer;

  @NonNull
  public final LinearLayout llBaseActionBarContainer;

  @NonNull
  public final RelativeLayout rlNavigationDrawer;

  @NonNull
  public final RelativeLayout rlNavigationDrawerHeader;

  @NonNull
  public final CustomTextViewRegular searchCase;

  @NonNull
  public final CustomTextViewMedium tvUserLogin;

  @NonNull
  public final CircleImageView vvNavigationDrawerImage;

  @Bindable
  protected MenuViewModel mMenuViewModel;

  protected LayoutNavigationDrawerBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CustomTextViewRegular addCase, DrawerLayout dlMainNavigationMenu,
      FrameLayout flHomeContainer, LinearLayout llBaseActionBarContainer,
      RelativeLayout rlNavigationDrawer, RelativeLayout rlNavigationDrawerHeader,
      CustomTextViewRegular searchCase, CustomTextViewMedium tvUserLogin,
      CircleImageView vvNavigationDrawerImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addCase = addCase;
    this.dlMainNavigationMenu = dlMainNavigationMenu;
    this.flHomeContainer = flHomeContainer;
    this.llBaseActionBarContainer = llBaseActionBarContainer;
    this.rlNavigationDrawer = rlNavigationDrawer;
    this.rlNavigationDrawerHeader = rlNavigationDrawerHeader;
    this.searchCase = searchCase;
    this.tvUserLogin = tvUserLogin;
    this.vvNavigationDrawerImage = vvNavigationDrawerImage;
  }

  public abstract void setMenuViewModel(@Nullable MenuViewModel menuViewModel);

  @Nullable
  public MenuViewModel getMenuViewModel() {
    return mMenuViewModel;
  }

  @NonNull
  public static LayoutNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_navigation_drawer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutNavigationDrawerBinding>inflateInternal(inflater, R.layout.layout_navigation_drawer, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_navigation_drawer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutNavigationDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutNavigationDrawerBinding>inflateInternal(inflater, R.layout.layout_navigation_drawer, null, false, component);
  }

  public static LayoutNavigationDrawerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutNavigationDrawerBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutNavigationDrawerBinding)bind(component, view, R.layout.layout_navigation_drawer);
  }
}