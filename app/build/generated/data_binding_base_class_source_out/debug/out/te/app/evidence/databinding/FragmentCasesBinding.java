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
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.cases.viewModels.CasesViewModel;

public abstract class FragmentCasesBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText inputSearch;

  @NonNull
  public final RecyclerView rcClients;

  @Bindable
  protected CasesViewModel mViewmodel;

  protected FragmentCasesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText inputSearch, RecyclerView rcClients) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputSearch = inputSearch;
    this.rcClients = rcClients;
  }

  public abstract void setViewmodel(@Nullable CasesViewModel viewmodel);

  @Nullable
  public CasesViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentCasesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cases, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCasesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCasesBinding>inflateInternal(inflater, R.layout.fragment_cases, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCasesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_cases, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCasesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCasesBinding>inflateInternal(inflater, R.layout.fragment_cases, null, false, component);
  }

  public static FragmentCasesBinding bind(@NonNull View view) {
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
  public static FragmentCasesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCasesBinding)bind(component, view, R.layout.fragment_cases);
  }
}
