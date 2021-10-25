// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.pages.home.viewModels.ItemMainObjectViewModel;

public abstract class ItemHomeMainBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardOffice;

  @NonNull
  public final FloatingActionButton fbOffice;

  @NonNull
  public final AppCompatImageView icOffice;

  @NonNull
  public final CustomTextViewMedium tvOffice;

  @Bindable
  protected ItemMainObjectViewModel mItemViewModel;

  protected ItemHomeMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardOffice, FloatingActionButton fbOffice, AppCompatImageView icOffice,
      CustomTextViewMedium tvOffice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardOffice = cardOffice;
    this.fbOffice = fbOffice;
    this.icOffice = icOffice;
    this.tvOffice = tvOffice;
  }

  public abstract void setItemViewModel(@Nullable ItemMainObjectViewModel itemViewModel);

  @Nullable
  public ItemMainObjectViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemHomeMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemHomeMainBinding>inflateInternal(inflater, R.layout.item_home_main, root, attachToRoot, component);
  }

  @NonNull
  public static ItemHomeMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_home_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemHomeMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemHomeMainBinding>inflateInternal(inflater, R.layout.item_home_main, null, false, component);
  }

  public static ItemHomeMainBinding bind(@NonNull View view) {
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
  public static ItemHomeMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemHomeMainBinding)bind(component, view, R.layout.item_home_main);
  }
}
