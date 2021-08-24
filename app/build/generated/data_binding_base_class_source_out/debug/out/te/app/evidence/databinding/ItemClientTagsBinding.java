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
import te.app.evidence.pages.clients.viewModels.ClientsItemViewModel;

public abstract class ItemClientTagsBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewRegular attachments;

  @NonNull
  public final Barrier br5;

  @NonNull
  public final CustomTextViewRegular delete;

  @NonNull
  public final CustomTextViewMedium nameText;

  @NonNull
  public final CustomTextViewRegular nameValue;

  @NonNull
  public final CustomTextViewRegular permission;

  @NonNull
  public final View v1;

  @NonNull
  public final View v8;

  @Bindable
  protected ClientsItemViewModel mItemViewModel;

  protected ItemClientTagsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewRegular attachments, Barrier br5, CustomTextViewRegular delete,
      CustomTextViewMedium nameText, CustomTextViewRegular nameValue,
      CustomTextViewRegular permission, View v1, View v8) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attachments = attachments;
    this.br5 = br5;
    this.delete = delete;
    this.nameText = nameText;
    this.nameValue = nameValue;
    this.permission = permission;
    this.v1 = v1;
    this.v8 = v8;
  }

  public abstract void setItemViewModel(@Nullable ClientsItemViewModel itemViewModel);

  @Nullable
  public ClientsItemViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemClientTagsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_client_tags, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemClientTagsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemClientTagsBinding>inflateInternal(inflater, R.layout.item_client_tags, root, attachToRoot, component);
  }

  @NonNull
  public static ItemClientTagsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_client_tags, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemClientTagsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemClientTagsBinding>inflateInternal(inflater, R.layout.item_client_tags, null, false, component);
  }

  public static ItemClientTagsBinding bind(@NonNull View view) {
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
  public static ItemClientTagsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemClientTagsBinding)bind(component, view, R.layout.item_client_tags);
  }
}
