package te.app.evidence.pages.sessions;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.sessions.viewModels.SessionsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SessionsFragment_MembersInjector implements MembersInjector<SessionsFragment> {
  private final Provider<SessionsViewModel> viewModelProvider;

  public SessionsFragment_MembersInjector(Provider<SessionsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SessionsFragment> create(
      Provider<SessionsViewModel> viewModelProvider) {
    return new SessionsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SessionsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.sessions.SessionsFragment.viewModel")
  public static void injectViewModel(SessionsFragment instance, SessionsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
