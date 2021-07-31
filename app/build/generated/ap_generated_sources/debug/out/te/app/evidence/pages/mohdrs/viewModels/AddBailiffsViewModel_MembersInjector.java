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
public final class AddBailiffsViewModel_MembersInjector implements MembersInjector<AddBailiffsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  public AddBailiffsViewModel_MembersInjector(Provider<CasesRepository> casesRepositoryProvider) {
    this.casesRepositoryProvider = casesRepositoryProvider;
  }

  public static MembersInjector<AddBailiffsViewModel> create(
      Provider<CasesRepository> casesRepositoryProvider) {
    return new AddBailiffsViewModel_MembersInjector(casesRepositoryProvider);
  }

  @Override
  public void injectMembers(AddBailiffsViewModel instance) {
    injectCasesRepository(instance, casesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel.casesRepository")
  public static void injectCasesRepository(AddBailiffsViewModel instance,
      CasesRepository casesRepository) {
    instance.casesRepository = casesRepository;
  }
}
