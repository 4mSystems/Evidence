package te.app.evidence.pages.sessions.viewModels;

import dagger.internal.Factory;
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
public final class SessionNotesViewModel_Factory implements Factory<SessionNotesViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public SessionNotesViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public SessionNotesViewModel get() {
    SessionNotesViewModel instance = newInstance(casesRepositoryProvider.get());
    SessionNotesViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static SessionNotesViewModel_Factory create(
      Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new SessionNotesViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static SessionNotesViewModel newInstance(CasesRepository casesRepository) {
    return new SessionNotesViewModel(casesRepository);
  }
}
