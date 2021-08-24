package te.app.evidence.pages.sessions;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.sessions.viewModels.SessionNotesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SessionNotesFragment_MembersInjector implements MembersInjector<SessionNotesFragment> {
  private final Provider<SessionNotesViewModel> viewModelProvider;

  public SessionNotesFragment_MembersInjector(Provider<SessionNotesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SessionNotesFragment> create(
      Provider<SessionNotesViewModel> viewModelProvider) {
    return new SessionNotesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SessionNotesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.sessions.SessionNotesFragment.viewModel")
  public static void injectViewModel(SessionNotesFragment instance,
      SessionNotesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
