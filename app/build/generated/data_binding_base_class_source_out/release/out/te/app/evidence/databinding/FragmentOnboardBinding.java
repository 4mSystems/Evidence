// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.smarteist.autoimageslider.SliderView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.splash.SplashViewModel;

public abstract class FragmentOnboardBinding extends ViewDataBinding {
  @NonNull
  public final SliderView imageSlider;

  @NonNull
  public final ConstraintLayout searchContainer;

  @NonNull
  public final AppCompatButton startApp;

  @Bindable
  protected SplashViewModel mOnBoardViewModels;

  protected FragmentOnboardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      SliderView imageSlider, ConstraintLayout searchContainer, AppCompatButton startApp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageSlider = imageSlider;
    this.searchContainer = searchContainer;
    this.startApp = startApp;
  }

  public abstract void setOnBoardViewModels(@Nullable SplashViewModel onBoardViewModels);

  @Nullable
  public SplashViewModel getOnBoardViewModels() {
    return mOnBoardViewModels;
  }

  @NonNull
  public static FragmentOnboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboard, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardBinding>inflateInternal(inflater, R.layout.fragment_onboard, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOnboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboard, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardBinding>inflateInternal(inflater, R.layout.fragment_onboard, null, false, component);
  }

  public static FragmentOnboardBinding bind(@NonNull View view) {
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
  public static FragmentOnboardBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOnboardBinding)bind(component, view, R.layout.fragment_onboard);
  }
}