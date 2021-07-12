// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.customViews.views.CustomTextViewRegular;
import te.app.evidence.pages.auth.changePassword.ChangePasswordViewModel;

public abstract class FragmentChangePasswordBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final CustomTextViewMedium appLoginTitle;

  @NonNull
  public final CustomTextViewMedium appName;

  @NonNull
  public final AppCompatImageView imgLoginLogo;

  @NonNull
  public final TextInputLayout inputConfirmPassword;

  @NonNull
  public final TextInputLayout inputNewPassword;

  @NonNull
  public final AppCompatImageView loginBackground;

  @NonNull
  public final CustomTextViewRegular tvChangeHeaderText;

  @NonNull
  public final CustomTextViewMedium tvChangeTitle;

  @Bindable
  protected ChangePasswordViewModel mViewmodel;

  protected FragmentChangePasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton appCompatButtonNext, CustomTextViewMedium appLoginTitle,
      CustomTextViewMedium appName, AppCompatImageView imgLoginLogo,
      TextInputLayout inputConfirmPassword, TextInputLayout inputNewPassword,
      AppCompatImageView loginBackground, CustomTextViewRegular tvChangeHeaderText,
      CustomTextViewMedium tvChangeTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonNext = appCompatButtonNext;
    this.appLoginTitle = appLoginTitle;
    this.appName = appName;
    this.imgLoginLogo = imgLoginLogo;
    this.inputConfirmPassword = inputConfirmPassword;
    this.inputNewPassword = inputNewPassword;
    this.loginBackground = loginBackground;
    this.tvChangeHeaderText = tvChangeHeaderText;
    this.tvChangeTitle = tvChangeTitle;
  }

  public abstract void setViewmodel(@Nullable ChangePasswordViewModel viewmodel);

  @Nullable
  public ChangePasswordViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentChangePasswordBinding>inflateInternal(inflater, R.layout.fragment_change_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentChangePasswordBinding>inflateInternal(inflater, R.layout.fragment_change_password, null, false, component);
  }

  public static FragmentChangePasswordBinding bind(@NonNull View view) {
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
  public static FragmentChangePasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentChangePasswordBinding)bind(component, view, R.layout.fragment_change_password);
  }
}
