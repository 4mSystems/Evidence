// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.ads.itemViewModels.ItemCityViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCityBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br2;

  @NonNull
  public final AppCompatImageView catToggle;

  @NonNull
  public final CustomTextViewMedium tvHomeItem;

  @Bindable
  protected ItemCityViewModel mItemViewModel;

  protected ItemCityBinding(Object _bindingComponent, View _root, int _localFieldCount, Barrier br2,
      AppCompatImageView catToggle, CustomTextViewMedium tvHomeItem) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br2 = br2;
    this.catToggle = catToggle;
    this.tvHomeItem = tvHomeItem;
  }

  public abstract void setItemViewModel(@Nullable ItemCityViewModel itemViewModel);

  @Nullable
  public ItemCityViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemCityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_city, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCityBinding>inflateInternal(inflater, R.layout.item_city, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_city, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCityBinding>inflateInternal(inflater, R.layout.item_city, null, false, component);
  }

  public static ItemCityBinding bind(@NonNull View view) {
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
  public static ItemCityBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCityBinding)bind(component, view, R.layout.item_city);
  }
}
