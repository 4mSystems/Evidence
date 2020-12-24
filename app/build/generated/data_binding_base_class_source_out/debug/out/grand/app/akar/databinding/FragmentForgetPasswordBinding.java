// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomEditText;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.customViews.views.CustomTextViewRegular;
import grand.app.akar.pages.auth.forgetPassword.ForgetPasswordViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentForgetPasswordBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final Barrier br1;

  @NonNull
  public final ImageView imgLoginLogo;

  @NonNull
  public final CustomEditText inputPhone;

  @NonNull
  public final CustomTextViewMedium tvForgetTitle;

  @NonNull
  public final CustomTextViewRegular tvLoginHeaderNumber;

  @NonNull
  public final CustomTextViewMedium tvLoginTitle;

  @NonNull
  public final CustomTextViewMedium tvSocialTitle;

  @Bindable
  protected ForgetPasswordViewModel mViewmodel;

  protected FragmentForgetPasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton appCompatButtonNext, Barrier br1,
      ImageView imgLoginLogo, CustomEditText inputPhone, CustomTextViewMedium tvForgetTitle,
      CustomTextViewRegular tvLoginHeaderNumber, CustomTextViewMedium tvLoginTitle,
      CustomTextViewMedium tvSocialTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonNext = appCompatButtonNext;
    this.br1 = br1;
    this.imgLoginLogo = imgLoginLogo;
    this.inputPhone = inputPhone;
    this.tvForgetTitle = tvForgetTitle;
    this.tvLoginHeaderNumber = tvLoginHeaderNumber;
    this.tvLoginTitle = tvLoginTitle;
    this.tvSocialTitle = tvSocialTitle;
  }

  public abstract void setViewmodel(@Nullable ForgetPasswordViewModel viewmodel);

  @Nullable
  public ForgetPasswordViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forget_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentForgetPasswordBinding>inflateInternal(inflater, R.layout.fragment_forget_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forget_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentForgetPasswordBinding>inflateInternal(inflater, R.layout.fragment_forget_password, null, false, component);
  }

  public static FragmentForgetPasswordBinding bind(@NonNull View view) {
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
  public static FragmentForgetPasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentForgetPasswordBinding)bind(component, view, R.layout.fragment_forget_password);
  }
}
