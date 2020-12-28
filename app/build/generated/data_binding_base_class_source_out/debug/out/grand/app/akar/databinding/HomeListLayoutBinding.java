// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import grand.app.akar.R;
import grand.app.akar.pages.home.viewModels.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HomeListLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView catHomeRc;

  @Bindable
  protected HomeViewModel mViewmodel;

  protected HomeListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView catHomeRc) {
    super(_bindingComponent, _root, _localFieldCount);
    this.catHomeRc = catHomeRc;
  }

  public abstract void setViewmodel(@Nullable HomeViewModel viewmodel);

  @Nullable
  public HomeViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static HomeListLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_list_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HomeListLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HomeListLayoutBinding>inflateInternal(inflater, R.layout.home_list_layout, root, attachToRoot, component);
  }

  @NonNull
  public static HomeListLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_list_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HomeListLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HomeListLayoutBinding>inflateInternal(inflater, R.layout.home_list_layout, null, false, component);
  }

  public static HomeListLayoutBinding bind(@NonNull View view) {
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
  public static HomeListLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (HomeListLayoutBinding)bind(component, view, R.layout.home_list_layout);
  }
}