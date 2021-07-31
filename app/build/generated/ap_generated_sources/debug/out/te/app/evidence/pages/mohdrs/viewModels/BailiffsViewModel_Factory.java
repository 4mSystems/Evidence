package te.app.evidence.pages.mohdrs.viewModels;

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
public final class BailiffsViewModel_Factory implements Factory<BailiffsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public BailiffsViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public BailiffsViewModel get() {
    BailiffsViewModel instance = newInstance(casesRepositoryProvider.get());
    BailiffsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static BailiffsViewModel_Factory create(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new BailiffsViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static BailiffsViewModel newInstance(CasesRepository casesRepository) {
    return new BailiffsViewModel(casesRepository);
  }
}
