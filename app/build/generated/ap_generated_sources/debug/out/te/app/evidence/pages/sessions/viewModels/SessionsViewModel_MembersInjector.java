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
public final class SessionsViewModel_MembersInjector implements MembersInjector<SessionsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public SessionsViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<SessionsViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new SessionsViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(SessionsViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.sessions.viewModels.SessionsViewModel.casesRepository")
  public static void injectCasesRepository(SessionsViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}
