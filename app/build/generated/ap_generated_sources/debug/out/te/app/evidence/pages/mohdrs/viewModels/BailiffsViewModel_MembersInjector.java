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
public final class BailiffsViewModel_MembersInjector implements MembersInjector<BailiffsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public BailiffsViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<BailiffsViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new BailiffsViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(BailiffsViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel.casesRepository")
  public static void injectCasesRepository(BailiffsViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}
