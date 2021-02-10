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
import te.app.evidence.pages.clients.viewModels.ClientsItemViewModel;

public abstract class ItemNoteBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewRegular clientNoteText;

  @NonNull
  public final CustomTextViewRegular clientNoteValue;

  @NonNull
  public final ExpansionLayout expansionLayoutClients;

  @NonNull
  public final AppCompatImageView iconDownQu;

  @NonNull
  public final ExpansionHeader layoutClientsHeader;

  @NonNull
  public final CustomTextViewMedium tvQualifications;

  @NonNull
  public final CustomTextViewRegular unitText;

  @NonNull
  public final CustomTextViewRegular unitValue;

  @NonNull
  public final View v1;

  @NonNull
  public final View v3;

  @NonNull
  public final View v4;

  @Bindable
  protected ClientsItemViewModel mItemViewModel;

  protected ItemNoteBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewRegular clientNoteText, CustomTextViewRegular clientNoteValue,
      ExpansionLayout expansionLayoutClients, AppCompatImageView iconDownQu,
      ExpansionHeader layoutClientsHeader, CustomTextViewMedium tvQualifications,
      CustomTextViewRegular unitText, CustomTextViewRegular unitValue, View v1, View v3, View v4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clientNoteText = clientNoteText;
    this.clientNoteValue = clientNoteValue;
    this.expansionLayoutClients = expansionLayoutClients;
    this.iconDownQu = iconDownQu;
    this.layoutClientsHeader = layoutClientsHeader;
    this.tvQualifications = tvQualifications;
    this.unitText = unitText;
    this.unitValue = unitValue;
    this.v1 = v1;
    this.v3 = v3;
    this.v4 = v4;
  }

  public abstract void setItemViewModel(@Nullable ClientsItemViewModel itemViewModel);

  @Nullable
  public ClientsItemViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_note, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemNoteBinding>inflateInternal(inflater, R.layout.item_note, root, attachToRoot, component);
  }

  @NonNull
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_note, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemNoteBinding>inflateInternal(inflater, R.layout.item_note, null, false, component);
  }

  public static ItemNoteBinding bind(@NonNull View view) {
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
  public static ItemNoteBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemNoteBinding)bind(component, view, R.layout.item_note);
  }
}
