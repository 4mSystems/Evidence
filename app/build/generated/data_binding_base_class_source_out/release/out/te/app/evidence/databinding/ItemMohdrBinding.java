// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.florent37.expansionpanel.ExpansionHeader;
import com.github.florent37.expansionpanel.ExpansionLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.customViews.views.CustomTextViewRegular;
import te.app.evidence.pages.home.viewModels.SessionItemViewModel;

public abstract class ItemMohdrBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewRegular controlText;

  @NonNull
  public final CustomTextViewRegular controlValue;

  @NonNull
  public final CustomTextViewRegular courtText;

  @NonNull
  public final CustomTextViewRegular courtValue;

  @NonNull
  public final ExpansionLayout expansionLayoutSessions;

  @NonNull
  public final AppCompatImageView iconDownQu;

  @NonNull
  public final ExpansionHeader layoutSessionHeader;

  @NonNull
  public final CustomTextViewRegular paperTypeText;

  @NonNull
  public final CustomTextViewRegular paperTypeValue;

  @NonNull
  public final CustomTextViewRegular sessionDateText;

  @NonNull
  public final CustomTextViewRegular sessionMonthValue;

  @NonNull
  public final CustomTextViewMedium tvQualifications;

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

  @Bindable
  protected SessionItemViewModel mItemViewModel;

  protected ItemMohdrBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewRegular controlText, CustomTextViewRegular controlValue,
      CustomTextViewRegular courtText, CustomTextViewRegular courtValue,
      ExpansionLayout expansionLayoutSessions, AppCompatImageView iconDownQu,
      ExpansionHeader layoutSessionHeader, CustomTextViewRegular paperTypeText,
      CustomTextViewRegular paperTypeValue, CustomTextViewRegular sessionDateText,
      CustomTextViewRegular sessionMonthValue, CustomTextViewMedium tvQualifications, View v1,
      View v2, View v3, View v4, View v5) {
    super(_bindingComponent, _root, _localFieldCount);
    this.controlText = controlText;
    this.controlValue = controlValue;
    this.courtText = courtText;
    this.courtValue = courtValue;
    this.expansionLayoutSessions = expansionLayoutSessions;
    this.iconDownQu = iconDownQu;
    this.layoutSessionHeader = layoutSessionHeader;
    this.paperTypeText = paperTypeText;
    this.paperTypeValue = paperTypeValue;
    this.sessionDateText = sessionDateText;
    this.sessionMonthValue = sessionMonthValue;
    this.tvQualifications = tvQualifications;
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
    this.v4 = v4;
    this.v5 = v5;
  }

  public abstract void setItemViewModel(@Nullable SessionItemViewModel itemViewModel);

  @Nullable
  public SessionItemViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemMohdrBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_mohdr, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMohdrBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMohdrBinding>inflateInternal(inflater, R.layout.item_mohdr, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMohdrBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_mohdr, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMohdrBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMohdrBinding>inflateInternal(inflater, R.layout.item_mohdr, null, false, component);
  }

  public static ItemMohdrBinding bind(@NonNull View view) {
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
  public static ItemMohdrBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMohdrBinding)bind(component, view, R.layout.item_mohdr);
  }
}
