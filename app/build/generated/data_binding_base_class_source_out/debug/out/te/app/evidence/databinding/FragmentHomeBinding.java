// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomEditText;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.pages.home.viewModels.HomeViewModel;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br1;

  @NonNull
  public final Barrier br2;

  @NonNull
  public final Barrier br3;

  @NonNull
  public final CustomTextViewMedium homeCases;

  @NonNull
  public final MaterialCardView homeItem1;

  @NonNull
  public final MaterialCardView homeItem2;

  @NonNull
  public final MaterialCardView homeItem3;

  @NonNull
  public final MaterialCardView homeItem4;

  @NonNull
  public final CustomTextViewMedium homeMohdrs;

  @NonNull
  public final CustomTextViewMedium homeSession;

  @NonNull
  public final CustomTextViewMedium homeUsers;

  @NonNull
  public final CustomEditText inputEmail;

  @NonNull
  public final AppCompatButton nextMohdareen;

  @NonNull
  public final AppCompatButton nextSessions;

  @NonNull
  public final AppCompatButton previousSessions;

  @Bindable
  protected HomeViewModel mViewmodel;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br1, Barrier br2, Barrier br3, CustomTextViewMedium homeCases,
      MaterialCardView homeItem1, MaterialCardView homeItem2, MaterialCardView homeItem3,
      MaterialCardView homeItem4, CustomTextViewMedium homeMohdrs, CustomTextViewMedium homeSession,
      CustomTextViewMedium homeUsers, CustomEditText inputEmail, AppCompatButton nextMohdareen,
      AppCompatButton nextSessions, AppCompatButton previousSessions) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br1 = br1;
    this.br2 = br2;
    this.br3 = br3;
    this.homeCases = homeCases;
    this.homeItem1 = homeItem1;
    this.homeItem2 = homeItem2;
    this.homeItem3 = homeItem3;
    this.homeItem4 = homeItem4;
    this.homeMohdrs = homeMohdrs;
    this.homeSession = homeSession;
    this.homeUsers = homeUsers;
    this.inputEmail = inputEmail;
    this.nextMohdareen = nextMohdareen;
    this.nextSessions = nextSessions;
    this.previousSessions = previousSessions;
  }

  public abstract void setViewmodel(@Nullable HomeViewModel viewmodel);

  @Nullable
  public HomeViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}
