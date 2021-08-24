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
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.auth.register.RegisterViewModel;

public abstract class FragmentRegisterBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView homeTitle;

  @NonNull
  public final TextInputLayout inputAddress;

  @NonNull
  public final TextInputLayout inputCompanyName;

  @NonNull
  public final TextInputLayout inputInviteCode;

  @NonNull
  public final TextInputLayout inputName;

  @NonNull
  public final TextInputLayout inputPassword;

  @NonNull
  public final TextInputLayout inputPasswordConfirm;

  @NonNull
  public final TextInputLayout inputPhone;

  @NonNull
  public final TextInputLayout inputRegisterEmail;

  @NonNull
  public final AppCompatButton login;

  @NonNull
  public final CircularProgressIndicator progress;

  @Bindable
  protected RegisterViewModel mViewmodel;

  protected FragmentRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView homeTitle, TextInputLayout inputAddress, TextInputLayout inputCompanyName,
      TextInputLayout inputInviteCode, TextInputLayout inputName, TextInputLayout inputPassword,
      TextInputLayout inputPasswordConfirm, TextInputLayout inputPhone,
      TextInputLayout inputRegisterEmail, AppCompatButton login,
      CircularProgressIndicator progress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.homeTitle = homeTitle;
    this.inputAddress = inputAddress;
    this.inputCompanyName = inputCompanyName;
    this.inputInviteCode = inputInviteCode;
    this.inputName = inputName;
    this.inputPassword = inputPassword;
    this.inputPasswordConfirm = inputPasswordConfirm;
    this.inputPhone = inputPhone;
    this.inputRegisterEmail = inputRegisterEmail;
    this.login = login;
    this.progress = progress;
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
