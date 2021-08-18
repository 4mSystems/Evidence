package te.app.evidence.pages.cases.viewModels;

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
public final class AddCaseViewModel_Factory implements Factory<AddCaseViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public AddCaseViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public AddCaseViewModel get() {
    AddCaseViewModel instance = newInstance(casesRepositoryProvider.get());
    AddCaseViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static AddCaseViewModel_Factory create(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new AddCaseViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static AddCaseViewModel newInstance(CasesRepository casesRepository) {
    return new AddCaseViewModel(casesRepository);
  }
}
