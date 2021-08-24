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
public final class SearchClientsViewModel_Factory implements Factory<SearchClientsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public SearchClientsViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public SearchClientsViewModel get() {
    SearchClientsViewModel instance = newInstance(casesRepositoryProvider.get());
    SearchClientsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static SearchClientsViewModel_Factory create(
      Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new SearchClientsViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static SearchClientsViewModel newInstance(CasesRepository casesRepository) {
    return new SearchClientsViewModel(casesRepository);
  }
}
