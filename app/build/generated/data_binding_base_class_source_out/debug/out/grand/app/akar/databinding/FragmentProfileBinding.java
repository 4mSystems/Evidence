// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import de.hdodenhof.circleimageview.CircleImageView;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomEditText;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.profile.ProfileViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfileBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView accountCardContainer;

  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final Barrier br11;

  @NonNull
  public final CustomTextViewMedium btOwner;

  @NonNull
  public final CustomTextViewMedium btRealtor;

  @NonNull
  public final CustomTextViewMedium btnSeeker;

  @NonNull
  public final CircleImageView imgLoginLogo;

  @NonNull
  public final CustomEditText inputEmail;

  @NonNull
  public final CustomEditText inputName;

  @NonNull
  public final CustomEditText inputNewPassword;

  @NonNull
  public final CustomEditText inputPhone;

  @NonNull
  public final CustomEditText inputRegisterIdentityNumber;

  @NonNull
  public final CustomTextViewMedium tvAccountTitle;

  @NonNull
  public final CustomTextViewMedium tvCountry;

  @NonNull
  public final CustomTextViewMedium tvIdentityNumber;

  @NonNull
  public final CustomTextViewMedium tvRegisterEmail;

  @NonNull
  public final CustomTextViewMedium tvRegisterName;

  @NonNull
  public final CustomTextViewMedium tvRegisterPassword;

  @NonNull
  public final CustomTextViewMedium tvRegisterPhone;

  @Bindable
  protected ProfileViewModel mViewmodel;

  protected FragmentProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView accountCardContainer, AppCompatButton appCompatButtonNext, Barrier br11,
      CustomTextViewMedium btOwner, CustomTextViewMedium btRealtor, CustomTextViewMedium btnSeeker,
      CircleImageView imgLoginLogo, CustomEditText inputEmail, CustomEditText inputName,
      CustomEditText inputNewPassword, CustomEditText inputPhone,
      CustomEditText inputRegisterIdentityNumber, CustomTextViewMedium tvAccountTitle,
      CustomTextViewMedium tvCountry, CustomTextViewMedium tvIdentityNumber,
      CustomTextViewMedium tvRegisterEmail, CustomTextViewMedium tvRegisterName,
      CustomTextViewMedium tvRegisterPassword, CustomTextViewMedium tvRegisterPhone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountCardContainer = accountCardContainer;
    this.appCompatButtonNext = appCompatButtonNext;
    this.br11 = br11;
    this.btOwner = btOwner;
    this.btRealtor = btRealtor;
    this.btnSeeker = btnSeeker;
    this.imgLoginLogo = imgLoginLogo;
    this.inputEmail = inputEmail;
    this.inputName = inputName;
    this.inputNewPassword = inputNewPassword;
    this.inputPhone = inputPhone;
    this.inputRegisterIdentityNumber = inputRegisterIdentityNumber;
    this.tvAccountTitle = tvAccountTitle;
    this.tvCountry = tvCountry;
    this.tvIdentityNumber = tvIdentityNumber;
    this.tvRegisterEmail = tvRegisterEmail;
    this.tvRegisterName = tvRegisterName;
    this.tvRegisterPassword = tvRegisterPassword;
    this.tvRegisterPhone = tvRegisterPhone;
  }

  public abstract void setViewmodel(@Nullable ProfileViewModel viewmodel);

  @Nullable
  public ProfileViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileBinding>inflateInternal(inflater, R.layout.fragment_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileBinding>inflateInternal(inflater, R.layout.fragment_profile, null, false, component);
  }

  public static FragmentProfileBinding bind(@NonNull View view) {
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
  public static FragmentProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfileBinding)bind(component, view, R.layout.fragment_profile);
  }
}
