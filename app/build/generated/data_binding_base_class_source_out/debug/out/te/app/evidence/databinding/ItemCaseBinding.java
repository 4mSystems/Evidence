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
import te.app.evidence.pages.clients.viewModels.ClientCasesItemViewModel;

public abstract class ItemCaseBinding extends ViewDataBinding {
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
  public final CustomTextViewRegular paperNumberText;

  @NonNull
  public final CustomTextViewRegular paperNumberValue;

  @NonNull
  public final CustomTextViewRegular paperTypeText;

  @NonNull
  public final CustomTextViewRegular paperTypeValue;

  @NonNull
  public final CustomTextViewRegular sessionDateText;

  @NonNull
  public final CustomTextViewRegular sessionMonthValue;

  @NonNull
  public final CustomTextViewRegular statusText;

  @NonNull
  public final CustomTextViewMedium statusValue;

  @NonNull
  public final CustomTextViewMedium tvInvetationNum;

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

  @NonNull
  public final View v6;

  @NonNull
  public final View v7;

  @NonNull
  public final CustomTextViewRegular viewValue;

  @Bindable
  protected ClientCasesItemViewModel mItemViewModel;

  protected ItemCaseBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewRegular courtText, CustomTextViewRegular courtValue,
      ExpansionLayout expansionLayoutSessions, AppCompatImageView iconDownQu,
      ExpansionHeader layoutSessionHeader, CustomTextViewRegular paperNumberText,
      CustomTextViewRegular paperNumberValue, CustomTextViewRegular paperTypeText,
      CustomTextViewRegular paperTypeValue, CustomTextViewRegular sessionDateText,
      CustomTextViewRegular sessionMonthValue, CustomTextViewRegular statusText,
      CustomTextViewMedium statusValue, CustomTextViewMedium tvInvetationNum, View v1, View v2,
      View v3, View v4, View v5, View v6, View v7, CustomTextViewRegular viewValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.courtText = courtText;
    this.courtValue = courtValue;
    this.expansionLayoutSessions = expansionLayoutSessions;
    this.iconDownQu = iconDownQu;
    this.layoutSessionHeader = layoutSessionHeader;
    this.paperNumberText = paperNumberText;
    this.paperNumberValue = paperNumberValue;
    this.paperTypeText = paperTypeText;
    this.paperTypeValue = paperTypeValue;
    this.sessionDateText = sessionDateText;
    this.sessionMonthValue = sessionMonthValue;
    this.statusText = statusText;
    this.statusValue = statusValue;
    this.tvInvetationNum = tvInvetationNum;
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
    this.v4 = v4;
    this.v5 = v5;
    this.v6 = v6;
    this.v7 = v7;
    this.viewValue = viewValue;
  }

  public abstract void setItemViewModel(@Nullable ClientCasesItemViewModel itemViewModel);

  @Nullable
  public ClientCasesItemViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemCaseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_case, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCaseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCaseBinding>inflateInternal(inflater, R.layout.item_case, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_case, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCaseBinding>inflateInternal(inflater, R.layout.item_case, null, false, component);
  }

  public static ItemCaseBinding bind(@NonNull View view) {
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
  public static ItemCaseBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCaseBinding)bind(component, view, R.layout.item_case);
  }
}
