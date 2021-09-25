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
public final class ReportersDetailsViewModel_Factory implements Factory<ReportersDetailsViewModel> {
  private final Provider<CasesRepository> casesRepositoryProvider;

  private final Provider<CasesRepository> casesRepositoryProvider2;

  public ReportersDetailsViewModel_Factory(Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    this.casesRepositoryProvider = casesRepositoryProvider;
    this.casesRepositoryProvider2 = casesRepositoryProvider2;
  }

  @Override
  public ReportersDetailsViewModel get() {
    ReportersDetailsViewModel instance = newInstance(casesRepositoryProvider.get());
    ReportersDetailsViewModel_MembersInjector.injectCasesRepository(instance, casesRepositoryProvider2.get());
    return instance;
  }

  public static ReportersDetailsViewModel_Factory create(
      Provider<CasesRepository> casesRepositoryProvider,
      Provider<CasesRepository> casesRepositoryProvider2) {
    return new ReportersDetailsViewModel_Factory(casesRepositoryProvider, casesRepositoryProvider2);
  }

  public static ReportersDetailsViewModel newInstance(CasesRepository casesRepository) {
    return new ReportersDetailsViewModel(casesRepository);
  }
}
