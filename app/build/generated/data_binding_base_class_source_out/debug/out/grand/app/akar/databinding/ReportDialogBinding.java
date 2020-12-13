// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomEditText;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.home.viewModels.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ReportDialogBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewMedium dialogHeader;

  @NonNull
  public final CustomEditText inputDesc;

  @NonNull
  public final AppCompatButton optionDone;

  @NonNull
  public final CheckBox otherReason;

  @NonNull
  public final View v13;

  @NonNull
  public final CheckBox wrongBehave;

  @NonNull
  public final CheckBox wrongBuilding;

  @NonNull
  public final CheckBox wrongLocation;

  @NonNull
  public final CheckBox wrongPrice;

  @Bindable
  protected HomeViewModel mViewModel;

  protected ReportDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewMedium dialogHeader, CustomEditText inputDesc, AppCompatButton optionDone,
      CheckBox otherReason, View v13, CheckBox wrongBehave, CheckBox wrongBuilding,
      CheckBox wrongLocation, CheckBox wrongPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dialogHeader = dialogHeader;
    this.inputDesc = inputDesc;
    this.optionDone = optionDone;
    this.otherReason = otherReason;
    this.v13 = v13;
    this.wrongBehave = wrongBehave;
    this.wrongBuilding = wrongBuilding;
    this.wrongLocation = wrongLocation;
    this.wrongPrice = wrongPrice;
  }

  public abstract void setViewModel(@Nullable HomeViewModel viewModel);

  @Nullable
  public HomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ReportDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.report_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ReportDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ReportDialogBinding>inflateInternal(inflater, R.layout.report_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static ReportDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.report_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ReportDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ReportDialogBinding>inflateInternal(inflater, R.layout.report_dialog, null, false, component);
  }

  public static ReportDialogBinding bind(@NonNull View view) {
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
  public static ReportDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (ReportDialogBinding)bind(component, view, R.layout.report_dialog);
  }
}
