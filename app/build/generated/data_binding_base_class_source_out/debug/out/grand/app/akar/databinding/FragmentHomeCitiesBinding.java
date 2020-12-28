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
import com.google.android.gms.maps.MapView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.ads.viewModels.AdsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeCitiesBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewMedium btnDiffLocations;

  @NonNull
  public final FloatingActionButton googleBaseLocation;

  @NonNull
  public final CustomTextViewMedium libyaName;

  @NonNull
  public final MapView mapView;

  @Bindable
  protected AdsViewModel mViewmodel;

  protected FragmentHomeCitiesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewMedium btnDiffLocations, FloatingActionButton googleBaseLocation,
      CustomTextViewMedium libyaName, MapView mapView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDiffLocations = btnDiffLocations;
    this.googleBaseLocation = googleBaseLocation;
    this.libyaName = libyaName;
    this.mapView = mapView;
  }

  public abstract void setViewmodel(@Nullable AdsViewModel viewmodel);

  @Nullable
  public AdsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentHomeCitiesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home_cities, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeCitiesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeCitiesBinding>inflateInternal(inflater, R.layout.fragment_home_cities, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeCitiesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home_cities, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeCitiesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeCitiesBinding>inflateInternal(inflater, R.layout.fragment_home_cities, null, false, component);
  }

  public static FragmentHomeCitiesBinding bind(@NonNull View view) {
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
  public static FragmentHomeCitiesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeCitiesBinding)bind(component, view, R.layout.fragment_home_cities);
  }
}