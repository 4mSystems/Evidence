// Generated by data binding compiler. Do not edit!
package te.app.evidence.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.evidence.R;
import te.app.evidence.pages.sessions.viewModels.SessionNotesViewModel;

public abstract class FragmentSessionNotesBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText inputSearch;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final RecyclerView rcNotes;

  @Bindable
  protected SessionNotesViewModel mViewmodel;

  protected FragmentSessionNotesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText inputSearch, CircularProgressIndicator progress, RecyclerView rcNotes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputSearch = inputSearch;
    this.progress = progress;
    this.rcNotes = rcNotes;
  }

  public abstract void setViewmodel(@Nullable SessionNotesViewModel viewmodel);

  @Nullable
  public SessionNotesViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentSessionNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_session_notes, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSessionNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSessionNotesBinding>inflateInternal(inflater, R.layout.fragment_session_notes, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSessionNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_session_notes, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSessionNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSessionNotesBinding>inflateInternal(inflater, R.layout.fragment_session_notes, null, false, component);
  }

  public static FragmentSessionNotesBinding bind(@NonNull View view) {
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
  public static FragmentSessionNotesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSessionNotesBinding)bind(component, view, R.layout.fragment_session_notes);
  }
}
