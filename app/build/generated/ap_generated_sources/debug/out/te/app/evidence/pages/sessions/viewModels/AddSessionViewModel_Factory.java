package te.app.evidence.pages.sessions.viewModels;

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
public final class AddSessionViewModel_Factory implements Factory<AddSessionViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public AddSessionViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public AddSessionViewModel get() {
    AddSessionViewModel instance = newInstance(casesRepositoryProvider.get());
    AddSessionViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static AddSessionViewModel_Factory create(
      Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new AddSessionViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static AddSessionViewModel newInstance(CasesRepository casesRepository) {
    return new AddSessionViewModel(casesRepository);
  }
}
