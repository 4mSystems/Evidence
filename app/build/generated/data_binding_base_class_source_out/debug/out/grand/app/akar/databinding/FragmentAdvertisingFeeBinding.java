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
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.customViews.views.CustomTextViewRegular;
import grand.app.akar.pages.ads.viewModels.AdsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAdvertisingFeeBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton confirmBtn;

  @NonNull
  public final CustomTextViewRegular info1;

  @NonNull
  public final CustomTextViewRegular info2;

  @NonNull
  public final CustomTextViewRegular info3;

  @NonNull
  public final CustomTextViewRegular info4;

  @NonNull
  public final CustomTextViewRegular info5;

  @NonNull
  public final CustomTextViewRegular info6;

  @NonNull
  public final CustomTextViewMedium specialRegisterInfo1;

  @NonNull
  public final CustomTextViewRegular specialRegisterInfo2;

  @NonNull
  public final CustomTextViewMedium specialRegisterInfo3;

  @Bindable
  protected AdsViewModel mViewmodel;

  protected FragmentAdvertisingFeeBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton confirmBtn, CustomTextViewRegular info1,
      CustomTextViewRegular info2, CustomTextViewRegular info3, CustomTextViewRegular info4,
      CustomTextViewRegular info5, CustomTextViewRegular info6,
      CustomTextViewMedium specialRegisterInfo1, CustomTextViewRegular specialRegisterInfo2,
      CustomTextViewMedium specialRegisterInfo3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.confirmBtn = confirmBtn;
    this.info1 = info1;
    this.info2 = info2;
    this.info3 = info3;
    this.info4 = info4;
    this.info5 = info5;
    this.info6 = info6;
    this.specialRegisterInfo1 = specialRegisterInfo1;
    this.specialRegisterInfo2 = specialRegisterInfo2;
    this.specialRegisterInfo3 = specialRegisterInfo3;
  }

  public abstract void setViewmodel(@Nullable AdsViewModel viewmodel);

  @Nullable
  public AdsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAdvertisingFeeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_advertising_fee, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAdvertisingFeeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAdvertisingFeeBinding>inflateInternal(inflater, R.layout.fragment_advertising_fee, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAdvertisingFeeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_advertising_fee, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAdvertisingFeeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAdvertisingFeeBinding>inflateInternal(inflater, R.layout.fragment_advertising_fee, null, false, component);
  }

  public static FragmentAdvertisingFeeBinding bind(@NonNull View view) {
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
  public static FragmentAdvertisingFeeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAdvertisingFeeBinding)bind(component, view, R.layout.fragment_advertising_fee);
  }
}
