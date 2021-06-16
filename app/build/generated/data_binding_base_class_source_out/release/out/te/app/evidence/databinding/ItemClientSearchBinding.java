// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.clients.viewModels.ClientsItemViewModel;

public abstract class ItemClientSearchBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCheckBox checkbox;

  @Bindable
  protected ClientsItemViewModel mItemViewModel;

  protected ItemClientSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCheckBox checkbox) {
    super(_bindingComponent, _root, _localFieldCount);
    this.checkbox = checkbox;
  }

  public abstract void setItemViewModel(@Nullable ClientsItemViewModel itemViewModel);

  @Nullable
  public ClientsItemViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemClientSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_client_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemClientSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemClientSearchBinding>inflateInternal(inflater, R.layout.item_client_search, root, attachToRoot, component);
  }

  @NonNull
  public static ItemClientSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_client_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemClientSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemClientSearchBinding>inflateInternal(inflater, R.layout.item_client_search, null, false, component);
  }

  public static ItemClientSearchBinding bind(@NonNull View view) {
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
  public static ItemClientSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemClientSearchBinding)bind(component, view, R.layout.item_client_search);
  }
}