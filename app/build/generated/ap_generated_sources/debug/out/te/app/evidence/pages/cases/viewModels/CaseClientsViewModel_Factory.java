package te.app.evidence.pages.cases.viewModels;

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
public final class CaseClientsViewModel_Factory implements Factory<CaseClientsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public CaseClientsViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public CaseClientsViewModel get() {
    CaseClientsViewModel instance = newInstance(casesRepositoryProvider.get());
    CaseClientsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static CaseClientsViewModel_Factory create(
      Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new CaseClientsViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static CaseClientsViewModel newInstance(CasesRepository casesRepository) {
    return new CaseClientsViewModel(casesRepository);
  }
}
