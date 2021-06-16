// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.customViews.views.CustomTextViewRegular;
import te.app.evidence.pages.users.viewModels.UserItemViewModel;

public abstract class ItemUserBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br5;

  @NonNull
  public final CustomTextViewRegular delete;

  @NonNull
  public final CustomTextViewRegular edit;

  @NonNull
  public final CustomTextViewMedium emailText;

  @NonNull
  public final CustomTextViewRegular emailValue;

  @NonNull
  public final CustomTextViewMedium nameText;

  @NonNull
  public final CustomTextViewRegular nameValue;

  @NonNull
  public final CustomTextViewRegular permission;

  @NonNull
  public final CustomTextViewMedium userAddressText;

  @NonNull
  public final CustomTextViewRegular userAddressValue;

  @NonNull
  public final CustomTextViewMedium userPhoneText;

  @NonNull
  public final CustomTextViewRegular userPhoneValue;

  @NonNull
  public final CustomTextViewMedium userTypeText;

  @NonNull
  public final CustomTextViewRegular userTypeValue;

  @NonNull
  public final View v1;

  @NonNull
  public final View v2;

  @NonNull
  public final View v3;

  @NonNull
  public final View v4;

  @NonNull
  public final View v5;

  @NonNull
  public final View v8;

  @Bindable
  protected UserItemViewModel mItemViewModel;

  protected ItemUserBinding(Object _bindingComponent, View _root, int _localFieldCount, Barrier br5,
      CustomTextViewRegular delete, CustomTextViewRegular edit, CustomTextViewMedium emailText,
      CustomTextViewRegular emailValue, CustomTextViewMedium nameText,
      CustomTextViewRegular nameValue, CustomTextViewRegular permission,
      CustomTextViewMedium userAddressText, CustomTextViewRegular userAddressValue,
      CustomTextViewMedium userPhoneText, CustomTextViewRegular userPhoneValue,
      CustomTextViewMedium userTypeText, CustomTextViewRegular userTypeValue, View v1, View v2,
      View v3, View v4, View v5, View v8) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br5 = br5;
    this.delete = delete;
    this.edit = edit;
    this.emailText = emailText;
    this.emailValue = emailValue;
    this.nameText = nameText;
    this.nameValue = nameValue;
    this.permission = permission;
    this.userAddressText = userAddressText;
    this.userAddressValue = userAddressValue;
    this.userPhoneText = userPhoneText;
    this.userPhoneValue = userPhoneValue;
    this.userTypeText = userTypeText;
    this.userTypeValue = userTypeValue;
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
    this.v4 = v4;
    this.v5 = v5;
    this.v8 = v8;
  }

  public abstract void setItemViewModel(@Nullable UserItemViewModel itemViewModel);

  @Nullable
  public UserItemViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemUserBinding>inflateInternal(inflater, R.layout.item_user, root, attachToRoot, component);
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemUserBinding>inflateInternal(inflater, R.layout.item_user, null, false, component);
  }

  public static ItemUserBinding bind(@NonNull View view) {
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
  public static ItemUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemUserBinding)bind(component, view, R.layout.item_user);
  }
}