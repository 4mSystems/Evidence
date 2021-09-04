// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.places.viewModels.PlacesViewModel;

public abstract class FragmentPlacesBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView pbBaseLoadingBar;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final RecyclerView rcPlaces;

  @NonNull
  public final TextInputEditText searchInput;

  @NonNull
  public final TextInputEditText searchType;

  @Bindable
  protected PlacesViewModel mViewmodel;

  protected FragmentPlacesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LottieAnimationView pbBaseLoadingBar, CircularProgressIndicator progress,
      RecyclerView rcPlaces, TextInputEditText searchInput, TextInputEditText searchType) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pbBaseLoadingBar = pbBaseLoadingBar;
    this.progress = progress;
    this.rcPlaces = rcPlaces;
    this.searchInput = searchInput;
    this.searchType = searchType;
  }

  public abstract void setViewmodel(@Nullable PlacesViewModel viewmodel);

  @Nullable
  public PlacesViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentPlacesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_places, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlacesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlacesBinding>inflateInternal(inflater, R.layout.fragment_places, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlacesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_places, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlacesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlacesBinding>inflateInternal(inflater, R.layout.fragment_places, null, false, component);
  }

  public static FragmentPlacesBinding bind(@NonNull View view) {
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
  public static FragmentPlacesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlacesBinding)bind(component, view, R.layout.fragment_places);
  }
}
