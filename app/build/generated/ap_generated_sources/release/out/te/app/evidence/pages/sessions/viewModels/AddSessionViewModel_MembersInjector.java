package te.app.evidence.pages.sessions.viewModels;

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
public final class AddSessionViewModel_MembersInjector implements MembersInjector<AddSessionViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public AddSessionViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<AddSessionViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new AddSessionViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(AddSessionViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.sessions.viewModels.AddSessionViewModel.casesRepository")
  public static void injectCasesRepository(AddSessionViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}