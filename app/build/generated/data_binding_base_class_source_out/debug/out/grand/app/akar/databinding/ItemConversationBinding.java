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
import de.hdodenhof.circleimageview.CircleImageView;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomTextViewRegular;
import grand.app.akar.pages.conversations.viewModels.ItemConversationsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemConversationBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br9;

  @NonNull
  public final CustomTextViewRegular conDescText;

  @NonNull
  public final CustomTextViewRegular conTime;

  @NonNull
  public final CustomTextViewRegular conTitle;

  @NonNull
  public final CircleImageView conUserImage;

  @Bindable
  protected ItemConversationsViewModel mItemViewModel;

  protected ItemConversationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br9, CustomTextViewRegular conDescText, CustomTextViewRegular conTime,
      CustomTextViewRegular conTitle, CircleImageView conUserImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br9 = br9;
    this.conDescText = conDescText;
    this.conTime = conTime;
    this.conTitle = conTitle;
    this.conUserImage = conUserImage;
  }

  public abstract void setItemViewModel(@Nullable ItemConversationsViewModel itemViewModel);

  @Nullable
  public ItemConversationsViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_conversation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemConversationBinding>inflateInternal(inflater, R.layout.item_conversation, root, attachToRoot, component);
  }

  @NonNull
  public static ItemConversationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_conversation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemConversationBinding>inflateInternal(inflater, R.layout.item_conversation, null, false, component);
  }

  public static ItemConversationBinding bind(@NonNull View view) {
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
  public static ItemConversationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemConversationBinding)bind(component, view, R.layout.item_conversation);
  }
}