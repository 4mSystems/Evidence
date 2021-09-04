// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.customViews.views.CustomTextViewMedium;
import te.app.evidence.customViews.views.ExpandableTextView;
import te.app.evidence.pages.places.viewModels.ItemPlacesViewModel;

public abstract class ItemServiceBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br;

  @NonNull
  public final MaterialButton delete;

  @NonNull
  public final MaterialButton edit;

  @NonNull
  public final Flow flow;

  @NonNull
  public final AppCompatImageView icPhone;

  @NonNull
  public final CircleImageView icPlace;

  @NonNull
  public final AppCompatImageView icWhats;

  @NonNull
  public final AppCompatImageView imgLive;

  @NonNull
  public final CustomTextViewMedium title;

  @NonNull
  public final ExpandableTextView tvDescPost;

  @NonNull
  public final CustomTextViewMedium userName;

  @Bindable
  protected ItemPlacesViewModel mItemViewModel;

  protected ItemServiceBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br, MaterialButton delete, MaterialButton edit, Flow flow, AppCompatImageView icPhone,
      CircleImageView icPlace, AppCompatImageView icWhats, AppCompatImageView imgLive,
      CustomTextViewMedium title, ExpandableTextView tvDescPost, CustomTextViewMedium userName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br = br;
    this.delete = delete;
    this.edit = edit;
    this.flow = flow;
    this.icPhone = icPhone;
    this.icPlace = icPlace;
    this.icWhats = icWhats;
    this.imgLive = imgLive;
    this.title = title;
    this.tvDescPost = tvDescPost;
    this.userName = userName;
  }

  public abstract void setItemViewModel(@Nullable ItemPlacesViewModel itemViewModel);

  @Nullable
  public ItemPlacesViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_service, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemServiceBinding>inflateInternal(inflater, R.layout.item_service, root, attachToRoot, component);
  }

  @NonNull
  public static ItemServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_service, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemServiceBinding>inflateInternal(inflater, R.layout.item_service, null, false, component);
  }

  public static ItemServiceBinding bind(@NonNull View view) {
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
  public static ItemServiceBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemServiceBinding)bind(component, view, R.layout.item_service);
  }
}