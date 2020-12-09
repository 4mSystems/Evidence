// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.settings.viewModels.SettingsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAboutBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgRegister;

  @NonNull
  public final CustomTextViewMedium tvTakeMe;

  @Bindable
  protected SettingsViewModel mViewmodel;

  protected FragmentAboutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imgRegister, CustomTextViewMedium tvTakeMe) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgRegister = imgRegister;
    this.tvTakeMe = tvTakeMe;
  }

  public abstract void setViewmodel(@Nullable SettingsViewModel viewmodel);

  @Nullable
  public SettingsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_about, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAboutBinding>inflateInternal(inflater, R.layout.fragment_about, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_about, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAboutBinding>inflateInternal(inflater, R.layout.fragment_about, null, false, component);
  }

  public static FragmentAboutBinding bind(@NonNull View view) {
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
  public static FragmentAboutBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAboutBinding)bind(component, view, R.layout.fragment_about);
  }
}
