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
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel;

public abstract class FragmentAttachmentsBinding extends ViewDataBinding {
  @NonNull
  public final ExtendedFloatingActionButton fileBtn;

  @NonNull
  public final ExtendedFloatingActionButton imageBtn;

  @NonNull
  public final TextInputEditText inputSearch;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final RecyclerView rcAttachments;

  @Bindable
  protected AttachmentsViewModel mViewmodel;

  protected FragmentAttachmentsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ExtendedFloatingActionButton fileBtn, ExtendedFloatingActionButton imageBtn,
      TextInputEditText inputSearch, CircularProgressIndicator progress,
      RecyclerView rcAttachments) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fileBtn = fileBtn;
    this.imageBtn = imageBtn;
    this.inputSearch = inputSearch;
    this.progress = progress;
    this.rcAttachments = rcAttachments;
  }

  public abstract void setViewmodel(@Nullable AttachmentsViewModel viewmodel);

  @Nullable
  public AttachmentsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAttachmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_attachments, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAttachmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAttachmentsBinding>inflateInternal(inflater, R.layout.fragment_attachments, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAttachmentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_attachments, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAttachmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAttachmentsBinding>inflateInternal(inflater, R.layout.fragment_attachments, null, false, component);
  }

  public static FragmentAttachmentsBinding bind(@NonNull View view) {
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
  public static FragmentAttachmentsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAttachmentsBinding)bind(component, view, R.layout.fragment_attachments);
  }
}
