// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.R;
import grand.app.akar.pages.ads.viewModels.AdsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAkarLocationCitiesBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton confirmBtn;

  @Bindable
  protected AdsViewModel mViewmodel;

  protected FragmentAkarLocationCitiesBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton confirmBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.confirmBtn = confirmBtn;
  }

  public abstract void setViewmodel(@Nullable AdsViewModel viewmodel);

  @Nullable
  public AdsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAkarLocationCitiesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_akar_location_cities, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAkarLocationCitiesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAkarLocationCitiesBinding>inflateInternal(inflater, R.layout.fragment_akar_location_cities, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAkarLocationCitiesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_akar_location_cities, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAkarLocationCitiesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAkarLocationCitiesBinding>inflateInternal(inflater, R.layout.fragment_akar_location_cities, null, false, component);
  }

  public static FragmentAkarLocationCitiesBinding bind(@NonNull View view) {
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
  public static FragmentAkarLocationCitiesBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentAkarLocationCitiesBinding)bind(component, view, R.layout.fragment_akar_location_cities);
  }
}
