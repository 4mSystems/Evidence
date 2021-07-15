// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.customViews.views.CustomTextViewRegular;
import te.app.evidence.pages.clients.viewModels.ClientProfileViewModel;

public abstract class FragmentClientProfileBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br4;

  @NonNull
  public final CustomTextViewRegular clientAddressText;

  @NonNull
  public final CustomTextViewRegular clientAddressValue;

  @NonNull
  public final AppCompatButton clientCases;

  @NonNull
  public final CustomTextViewMedium clientData;

  @NonNull
  public final CardView clientDataContainer;

  @NonNull
  public final CustomTextViewRegular clientNameText;

  @NonNull
  public final CustomTextViewRegular clientNameValue;

  @NonNull
  public final CustomTextViewRegular clientNoteText;

  @NonNull
  public final CustomTextViewRegular clientNoteValue;

  @NonNull
  public final AppCompatButton clientNotes;

  @NonNull
  public final CustomTextViewRegular clientTypeText;

  @NonNull
  public final CustomTextViewRegular clientTypeValue;

  @NonNull
  public final TextInputEditText inputSearch;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final ProgressBar progressBarHome;

  @NonNull
  public final RecyclerView rcNotes;

  @NonNull
  public final CustomTextViewRegular unitText;

  @NonNull
  public final CustomTextViewRegular unitValue;

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

  @Bindable
  protected ClientProfileViewModel mViewmodel;

  protected FragmentClientProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br4, CustomTextViewRegular clientAddressText,
      CustomTextViewRegular clientAddressValue, AppCompatButton clientCases,
      CustomTextViewMedium clientData, CardView clientDataContainer,
      CustomTextViewRegular clientNameText, CustomTextViewRegular clientNameValue,
      CustomTextViewRegular clientNoteText, CustomTextViewRegular clientNoteValue,
      AppCompatButton clientNotes, CustomTextViewRegular clientTypeText,
      CustomTextViewRegular clientTypeValue, TextInputEditText inputSearch,
      CircularProgressIndicator progress, ProgressBar progressBarHome, RecyclerView rcNotes,
      CustomTextViewRegular unitText, CustomTextViewRegular unitValue, View v2, View v3, View v4,
      View v5, View v6) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br4 = br4;
    this.clientAddressText = clientAddressText;
    this.clientAddressValue = clientAddressValue;
    this.clientCases = clientCases;
    this.clientData = clientData;
    this.clientDataContainer = clientDataContainer;
    this.clientNameText = clientNameText;
    this.clientNameValue = clientNameValue;
    this.clientNoteText = clientNoteText;
    this.clientNoteValue = clientNoteValue;
    this.clientNotes = clientNotes;
    this.clientTypeText = clientTypeText;
    this.clientTypeValue = clientTypeValue;
    this.inputSearch = inputSearch;
    this.progress = progress;
    this.progressBarHome = progressBarHome;
    this.rcNotes = rcNotes;
    this.unitText = unitText;
    this.unitValue = unitValue;
    this.v2 = v2;
    this.v3 = v3;
    this.v4 = v4;
    this.v5 = v5;
    this.v6 = v6;
  }

  public abstract void setViewmodel(@Nullable ClientProfileViewModel viewmodel);

  @Nullable
  public ClientProfileViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentClientProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_client_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentClientProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentClientProfileBinding>inflateInternal(inflater, R.layout.fragment_client_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentClientProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_client_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentClientProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentClientProfileBinding>inflateInternal(inflater, R.layout.fragment_client_profile, null, false, component);
  }

  public static FragmentClientProfileBinding bind(@NonNull View view) {
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
  public static FragmentClientProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentClientProfileBinding)bind(component, view, R.layout.fragment_client_profile);
  }
}
