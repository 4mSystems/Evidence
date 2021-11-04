// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.pages.home.viewModels.HomeViewModel;

public abstract class SettingsBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewMedium about;

  @NonNull
  public final CustomTextViewMedium contact;

  @NonNull
  public final CustomTextViewMedium privacy;

  @NonNull
  public final CustomTextViewMedium rateApp;

  @NonNull
  public final CustomTextViewMedium share;

  @NonNull
  public final NestedScrollView sheet;

  @NonNull
  public final CustomTextViewMedium support;

  @NonNull
  public final CustomTextViewMedium terms;

  @NonNull
  public final View vAbout;

  @NonNull
  public final View vBottom;

  @NonNull
  public final View vContact;

  @NonNull
  public final View vPrivacy;

  @NonNull
  public final View vShare;

  @NonNull
  public final View vSupport;

  @NonNull
  public final View vTerms;

  @Bindable
  protected HomeViewModel mViewmodel;

  protected SettingsBottomSheetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewMedium about, CustomTextViewMedium contact, CustomTextViewMedium privacy,
      CustomTextViewMedium rateApp, CustomTextViewMedium share, NestedScrollView sheet,
      CustomTextViewMedium support, CustomTextViewMedium terms, View vAbout, View vBottom,
      View vContact, View vPrivacy, View vShare, View vSupport, View vTerms) {
    super(_bindingComponent, _root, _localFieldCount);
    this.about = about;
    this.contact = contact;
    this.privacy = privacy;
    this.rateApp = rateApp;
    this.share = share;
    this.sheet = sheet;
    this.support = support;
    this.terms = terms;
    this.vAbout = vAbout;
    this.vBottom = vBottom;
    this.vContact = vContact;
    this.vPrivacy = vPrivacy;
    this.vShare = vShare;
    this.vSupport = vSupport;
    this.vTerms = vTerms;
  }

  public abstract void setViewmodel(@Nullable HomeViewModel viewmodel);

  @Nullable
  public HomeViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static SettingsBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_bottom_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SettingsBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SettingsBottomSheetBinding>inflateInternal(inflater, R.layout.settings_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static SettingsBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_bottom_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SettingsBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SettingsBottomSheetBinding>inflateInternal(inflater, R.layout.settings_bottom_sheet, null, false, component);
  }

  public static SettingsBottomSheetBinding bind(@NonNull View view) {
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
  public static SettingsBottomSheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (SettingsBottomSheetBinding)bind(component, view, R.layout.settings_bottom_sheet);
  }
}