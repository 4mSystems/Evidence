// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.users.viewModels.UserPermissionsViewModel;

public abstract class FragmentUserPermissionBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnSave;

  @Bindable
  protected UserPermissionsViewModel mViewmodel;

  protected FragmentUserPermissionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnSave) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSave = btnSave;
  }

  public abstract void setViewmodel(@Nullable UserPermissionsViewModel viewmodel);

  @Nullable
  public UserPermissionsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentUserPermissionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_permission, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserPermissionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUserPermissionBinding>inflateInternal(inflater, R.layout.fragment_user_permission, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserPermissionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_permission, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserPermissionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUserPermissionBinding>inflateInternal(inflater, R.layout.fragment_user_permission, null, false, component);
  }

  public static FragmentUserPermissionBinding bind(@NonNull View view) {
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
  public static FragmentUserPermissionBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUserPermissionBinding)bind(component, view, R.layout.fragment_user_permission);
  }
}
