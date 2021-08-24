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
public final class SessionsViewModel_Factory implements Factory<SessionsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public SessionsViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public SessionsViewModel get() {
    SessionsViewModel instance = newInstance(casesRepositoryProvider.get());
    SessionsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static SessionsViewModel_Factory create(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new SessionsViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static SessionsViewModel newInstance(CasesRepository casesRepository) {
    return new SessionsViewModel(casesRepository);
  }
}
