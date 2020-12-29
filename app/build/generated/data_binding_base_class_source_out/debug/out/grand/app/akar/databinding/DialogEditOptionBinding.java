// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogEditOptionBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewMedium close;

  @NonNull
  public final CustomTextViewMedium deleteAd;

  @NonNull
  public final CustomTextViewMedium editDetails;

  @NonNull
  public final CustomTextViewMedium editImages;

  @NonNull
  public final CustomTextViewMedium editLocation;

  @NonNull
  public final View v19;

  @NonNull
  public final View v20;

  @NonNull
  public final View v21;

  @NonNull
  public final View v22;

  @Bindable
  protected AdDetailsViewModel mViewModel;

  protected DialogEditOptionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewMedium close, CustomTextViewMedium deleteAd, CustomTextViewMedium editDetails,
      CustomTextViewMedium editImages, CustomTextViewMedium editLocation, View v19, View v20,
      View v21, View v22) {
    super(_bindingComponent, _root, _localFieldCount);
    this.close = close;
    this.deleteAd = deleteAd;
    this.editDetails = editDetails;
    this.editImages = editImages;
    this.editLocation = editLocation;
    this.v19 = v19;
    this.v20 = v20;
    this.v21 = v21;
    this.v22 = v22;
  }

  public abstract void setViewModel(@Nullable AdDetailsViewModel viewModel);

  @Nullable
  public AdDetailsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogEditOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_edit_option, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogEditOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogEditOptionBinding>inflateInternal(inflater, R.layout.dialog_edit_option, root, attachToRoot, component);
  }

  @NonNull
  public static DialogEditOptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_edit_option, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogEditOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogEditOptionBinding>inflateInternal(inflater, R.layout.dialog_edit_option, null, false, component);
  }

  public static DialogEditOptionBinding bind(@NonNull View view) {
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
  public static DialogEditOptionBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogEditOptionBinding)bind(component, view, R.layout.dialog_edit_option);
  }
}