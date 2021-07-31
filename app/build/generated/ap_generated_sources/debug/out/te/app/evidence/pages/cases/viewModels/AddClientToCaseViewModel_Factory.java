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
public final class AddClientToCaseViewModel_Factory implements Factory<AddClientToCaseViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public AddClientToCaseViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public AddClientToCaseViewModel get() {
    AddClientToCaseViewModel instance = newInstance(casesRepositoryProvider.get());
    AddClientToCaseViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static AddClientToCaseViewModel_Factory create(
      Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new AddClientToCaseViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static AddClientToCaseViewModel newInstance(CasesRepository casesRepository) {
    return new AddClientToCaseViewModel(casesRepository);
  }
}
