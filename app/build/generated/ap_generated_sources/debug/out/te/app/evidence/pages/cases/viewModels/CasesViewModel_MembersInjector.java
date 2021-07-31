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
public final class CasesViewModel_MembersInjector implements MembersInjector<CasesViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public CasesViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<CasesViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new CasesViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(CasesViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.viewModels.CasesViewModel.casesRepository")
  public static void injectCasesRepository(CasesViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}
