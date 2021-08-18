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
public final class CasesViewModel_Factory implements Factory<CasesViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public CasesViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public CasesViewModel get() {
    CasesViewModel instance = newInstance(casesRepositoryProvider.get());
    CasesViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static CasesViewModel_Factory create(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new CasesViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static CasesViewModel newInstance(CasesRepository casesRepository) {
    return new CasesViewModel(casesRepository);
  }
}
