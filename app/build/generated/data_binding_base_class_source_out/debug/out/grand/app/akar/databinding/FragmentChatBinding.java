// Generated by data binding compiler. Do not edit!
package grand.app.akar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import grand.app.akar.R;
import grand.app.akar.customViews.views.CustomEditText;
import grand.app.akar.pages.chat.viewmodel.ChatViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentChatBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView attach;

  @NonNull
  public final ConstraintLayout chatActions;

  @NonNull
  public final AppCompatImageView more;

  @NonNull
  public final RecyclerView rcChat;

  @NonNull
  public final CustomEditText sendChat;

  @NonNull
  public final View v14;

  @Bindable
  protected ChatViewModel mViewmodel;

  protected FragmentChatBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView attach, ConstraintLayout chatActions, AppCompatImageView more,
      RecyclerView rcChat, CustomEditText sendChat, View v14) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attach = attach;
    this.chatActions = chatActions;
    this.more = more;
    this.rcChat = rcChat;
    this.sendChat = sendChat;
    this.v14 = v14;
  }

  public abstract void setViewmodel(@Nullable ChatViewModel viewmodel);

  @Nullable
  public ChatViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, null, false, component);
  }

  public static FragmentChatBinding bind(@NonNull View view) {
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
  public static FragmentChatBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentChatBinding)bind(component, view, R.layout.fragment_chat);
  }
}
