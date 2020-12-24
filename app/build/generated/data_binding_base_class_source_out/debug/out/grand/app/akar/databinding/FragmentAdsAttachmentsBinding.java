// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.makeramen.roundedimageview.RoundedImageView;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomTextViewMedium;
import grand.app.akar.pages.ads.viewModels.AttachmentsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAdsAttachmentsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView adImagesRc;

  @NonNull
  public final CustomTextViewMedium attachTitle;

  @NonNull
  public final AppCompatImageView close7;

  @NonNull
  public final AppCompatButton confirmBtn;

  @NonNull
  public final RoundedImageView image7;

  @NonNull
  public final AppCompatImageView play;

  @NonNull
  public final CustomTextViewMedium videoTitle;

  @Bindable
  protected AttachmentsViewModel mViewmodel;

  protected FragmentAdsAttachmentsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView adImagesRc, CustomTextViewMedium attachTitle,
      AppCompatImageView close7, AppCompatButton confirmBtn, RoundedImageView image7,
      AppCompatImageView play, CustomTextViewMedium videoTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.adImagesRc = adImagesRc;
    this.attachTitle = attachTitle;
    this.close7 = close7;
    this.confirmBtn = confirmBtn;
    this.image7 = image7;
    this.play = play;
    this.videoTitle = videoTitle;
  }

  public abstract void setViewmodel(@Nullable AttachmentsViewModel viewmodel);

  @Nullable
  public AttachmentsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAdsAttachmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_ads_attachments, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAdsAttachmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAdsAttachmentsBinding>inflateInternal(inflater, R.layout.fragment_ads_attachments, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAdsAttachmentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_ads_attachments, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAdsAttachmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAdsAttachmentsBinding>inflateInternal(inflater, R.layout.fragment_ads_attachments, null, false, component);
  }

  public static FragmentAdsAttachmentsBinding bind(@NonNull View view) {
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
  public static FragmentAdsAttachmentsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAdsAttachmentsBinding)bind(component, view, R.layout.fragment_ads_attachments);
  }
}