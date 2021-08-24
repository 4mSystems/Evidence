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
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel;

public abstract class FragmentAddAttachmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnSave;

  @NonNull
  public final TextInputEditText file;

  @NonNull
  public final TextInputLayout inputDesc;

  @NonNull
  public final TextInputLayout inputFile;

  @NonNull
  public final CircularProgressIndicator progress;

  @Bindable
  protected AddAttachmentViewModel mViewmodel;

  protected FragmentAddAttachmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnSave, TextInputEditText file, TextInputLayout inputDesc,
      TextInputLayout inputFile, CircularProgressIndicator progress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSave = btnSave;
    this.file = file;
    this.inputDesc = inputDesc;
    this.inputFile = inputFile;
    this.progress = progress;
  }

  public abstract void setViewmodel(@Nullable AddAttachmentViewModel viewmodel);

  @Nullable
  public AddAttachmentViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAddAttachmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_attachment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddAttachmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAddAttachmentBinding>inflateInternal(inflater, R.layout.fragment_add_attachment, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddAttachmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_attachment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddAttachmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAddAttachmentBinding>inflateInternal(inflater, R.layout.fragment_add_attachment, null, false, component);
  }

  public static FragmentAddAttachmentBinding bind(@NonNull View view) {
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
  public static FragmentAddAttachmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAddAttachmentBinding)bind(component, view, R.layout.fragment_add_attachment);
  }
}
