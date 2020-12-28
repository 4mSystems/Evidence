// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.customViews.views.CustomTextViewRegular;
import grand.app.akar.pages.home.viewModels.ItemHomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemAdsBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br10;

  @NonNull
  public final RoundedImageView imgHomeItem;

  @NonNull
  public final CustomTextViewRegular tvBeds;

  @NonNull
  public final CustomTextViewRegular tvBuilding;

  @NonNull
  public final CustomTextViewRegular tvHomeDesc;

  @NonNull
  public final CustomTextViewRegular tvHomeDistance;

  @NonNull
  public final CustomTextViewMedium tvHomeItem;

  @NonNull
  public final CustomTextViewRegular tvLocation;

  @NonNull
  public final CustomTextViewRegular tvPath;

  @Bindable
  protected ItemHomeViewModel mItemHomeViewModel;

  protected ItemAdsBinding(Object _bindingComponent, View _root, int _localFieldCount, Barrier br10,
      RoundedImageView imgHomeItem, CustomTextViewRegular tvBeds, CustomTextViewRegular tvBuilding,
      CustomTextViewRegular tvHomeDesc, CustomTextViewRegular tvHomeDistance,
      CustomTextViewMedium tvHomeItem, CustomTextViewRegular tvLocation,
      CustomTextViewRegular tvPath) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br10 = br10;
    this.imgHomeItem = imgHomeItem;
    this.tvBeds = tvBeds;
    this.tvBuilding = tvBuilding;
    this.tvHomeDesc = tvHomeDesc;
    this.tvHomeDistance = tvHomeDistance;
    this.tvHomeItem = tvHomeItem;
    this.tvLocation = tvLocation;
    this.tvPath = tvPath;
  }

  public abstract void setItemHomeViewModel(@Nullable ItemHomeViewModel itemHomeViewModel);

  @Nullable
  public ItemHomeViewModel getItemHomeViewModel() {
    return mItemHomeViewModel;
  }

  @NonNull
  public static ItemAdsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_ads, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemAdsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemAdsBinding>inflateInternal(inflater, R.layout.item_ads, root, attachToRoot, component);
  }

  @NonNull
  public static ItemAdsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_ads, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemAdsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemAdsBinding>inflateInternal(inflater, R.layout.item_ads, null, false, component);
  }

  public static ItemAdsBinding bind(@NonNull View view) {
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
  public static ItemAdsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemAdsBinding)bind(component, view, R.layout.item_ads);
  }
}