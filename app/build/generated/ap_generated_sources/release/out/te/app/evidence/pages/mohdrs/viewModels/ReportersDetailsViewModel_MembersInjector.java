package te.app.evidence.pages.mohdrs.viewModels;

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
public final class ReportersDetailsViewModel_MembersInjector implements MembersInjector<ReportersDetailsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public ReportersDetailsViewModel_MembersInjector(
      Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<ReportersDetailsViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new ReportersDetailsViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(ReportersDetailsViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel.casesRepository")
  public static void injectCasesRepository(ReportersDetailsViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}