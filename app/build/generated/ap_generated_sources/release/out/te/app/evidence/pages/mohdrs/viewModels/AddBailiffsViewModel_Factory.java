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
public final class AddBailiffsViewModel_Factory implements Factory<AddBailiffsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public AddBailiffsViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public AddBailiffsViewModel get() {
    AddBailiffsViewModel instance = newInstance(casesRepositoryProvider.get());
    AddBailiffsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static AddBailiffsViewModel_Factory create(
      Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new AddBailiffsViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static AddBailiffsViewModel newInstance(CasesRepository casesRepository) {
    return new AddBailiffsViewModel(casesRepository);
  }
}
