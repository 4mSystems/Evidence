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
import de.hdodenhof.circleimageview.CircleImageView;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomEditText;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.auth.register.RegisterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegisterBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final CircleImageView imgRegisterLogo;

  @NonNull
  public final CustomEditText inputEmail;

  @NonNull
  public final CustomEditText inputName;

  @NonNull
  public final CustomEditText inputNewPassword;

  @NonNull
  public final CustomEditText inputPhone;

  @NonNull
  public final CustomEditText inputRegisterCity;

  @NonNull
  public final CustomEditText inputRegisterConfirmPassword;

  @NonNull
  public final CustomEditText inputRegisterUserType;

  @NonNull
  public final CustomTextViewMedium tvCity;

  @NonNull
  public final CustomTextViewMedium tvForgetTimer;

  @NonNull
  public final CustomTextViewMedium tvIdentityNumber;

  @NonNull
  public final CustomTextViewMedium tvLoginForget;

  @NonNull
  public final CustomTextViewMedium tvRegisterEmail;

  @NonNull
  public final CustomTextViewMedium tvRegisterName;

  @NonNull
  public final CustomTextViewMedium tvRegisterPassword;

  @NonNull
  public final CustomTextViewMedium tvRegisterPhone;

  @NonNull
  public final CustomTextViewMedium tvType;

  @Bindable
  protected RegisterViewModel mViewmodel;

  protected FragmentRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton appCompatButtonNext, CircleImageView imgRegisterLogo,
      CustomEditText inputEmail, CustomEditText inputName, CustomEditText inputNewPassword,
      CustomEditText inputPhone, CustomEditText inputRegisterCity,
      CustomEditText inputRegisterConfirmPassword, CustomEditText inputRegisterUserType,
      CustomTextViewMedium tvCity, CustomTextViewMedium tvForgetTimer,
      CustomTextViewMedium tvIdentityNumber, CustomTextViewMedium tvLoginForget,
      CustomTextViewMedium tvRegisterEmail, CustomTextViewMedium tvRegisterName,
      CustomTextViewMedium tvRegisterPassword, CustomTextViewMedium tvRegisterPhone,
      CustomTextViewMedium tvType) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonNext = appCompatButtonNext;
    this.imgRegisterLogo = imgRegisterLogo;
    this.inputEmail = inputEmail;
    this.inputName = inputName;
    this.inputNewPassword = inputNewPassword;
    this.inputPhone = inputPhone;
    this.inputRegisterCity = inputRegisterCity;
    this.inputRegisterConfirmPassword = inputRegisterConfirmPassword;
    this.inputRegisterUserType = inputRegisterUserType;
    this.tvCity = tvCity;
    this.tvForgetTimer = tvForgetTimer;
    this.tvIdentityNumber = tvIdentityNumber;
    this.tvLoginForget = tvLoginForget;
    this.tvRegisterEmail = tvRegisterEmail;
    this.tvRegisterName = tvRegisterName;
    this.tvRegisterPassword = tvRegisterPassword;
    this.tvRegisterPhone = tvRegisterPhone;
    this.tvType = tvType;
  }

  public abstract void setViewmodel(@Nullable RegisterViewModel viewmodel);

  @Nullable
  public RegisterViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, null, false, component);
  }

  public static FragmentRegisterBinding bind(@NonNull View view) {
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
  public static FragmentRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegisterBinding)bind(component, view, R.layout.fragment_register);
  }
}
