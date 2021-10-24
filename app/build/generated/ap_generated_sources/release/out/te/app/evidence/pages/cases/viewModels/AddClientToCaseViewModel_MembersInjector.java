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
public final class AddClientToCaseViewModel_MembersInjector implements MembersInjector<AddClientToCaseViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public AddClientToCaseViewModel_MembersInjector(
      Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<AddClientToCaseViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new AddClientToCaseViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(AddClientToCaseViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel.casesRepository")
  public static void injectCasesRepository(AddClientToCaseViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}