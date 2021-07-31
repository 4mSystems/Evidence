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
public final class AddCaseViewModel_MembersInjector implements MembersInjector<AddCaseViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public AddCaseViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<AddCaseViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new AddCaseViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(AddCaseViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.viewModels.AddCaseViewModel.casesRepository")
  public static void injectCasesRepository(AddCaseViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}
