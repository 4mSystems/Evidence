package te.app.evidence.pages.cases.viewModels;

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
public final class SearchClientsViewModel_MembersInjector implements MembersInjector<SearchClientsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public SearchClientsViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<SearchClientsViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new SearchClientsViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(SearchClientsViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.viewModels.SearchClientsViewModel.casesRepository")
  public static void injectCasesRepository(SearchClientsViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}
