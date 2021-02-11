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
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomEditText;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;

public abstract class FragmentClientsBinding extends ViewDataBinding {
  @NonNull
  public final CustomEditText inputSearch;

  @NonNull
  public final RecyclerView rcClients;

  @Bindable
  protected ClientsViewModel mViewmodel;

  protected FragmentClientsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomEditText inputSearch, RecyclerView rcClients) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputSearch = inputSearch;
    this.rcClients = rcClients;
  }

  public abstract void setViewmodel(@Nullable ClientsViewModel viewmodel);

  @Nullable
  public ClientsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentClientsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_clients, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentClientsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentClientsBinding>inflateInternal(inflater, R.layout.fragment_clients, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentClientsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_clients, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentClientsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentClientsBinding>inflateInternal(inflater, R.layout.fragment_clients, null, false, component);
  }

  public static FragmentClientsBinding bind(@NonNull View view) {
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
  public static FragmentClientsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentClientsBinding)bind(component, view, R.layout.fragment_clients);
  }
}
