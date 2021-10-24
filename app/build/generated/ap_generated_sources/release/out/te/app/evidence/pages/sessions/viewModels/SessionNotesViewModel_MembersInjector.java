package te.app.evidence.pages.sessions.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.CasesRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SessionNotesViewModel_MembersInjector implements MembersInjector<SessionNotesViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public SessionNotesViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<SessionNotesViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new SessionNotesViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(SessionNotesViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.sessions.viewModels.SessionNotesViewModel.casesRepository")
  public static void injectCasesRepository(SessionNotesViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}