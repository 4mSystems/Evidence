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
public final class CaseClientsViewModel_MembersInjector implements MembersInjector<CaseClientsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public CaseClientsViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<CaseClientsViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new CaseClientsViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(CaseClientsViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.viewModels.CaseClientsViewModel.casesRepository")
  public static void injectCasesRepository(CaseClientsViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}
