package te.app.evidence.pages.reports.viewModels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.ReportsRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ReportsViewModel_Factory implements Factory<ReportsViewModel> {
  private final Provider<ReportsRepository> reportsRepositoryProvider;

  private final Provider<ReportsRepository> reportsRepositoryProvider2;

  public ReportsViewModel_Factory(Provider<ReportsRepository> reportsRepositoryProvider,
      Provider<ReportsRepository> reportsRepositoryProvider2) {
    this.reportsRepositoryProvider = reportsRepositoryProvider;
    this.reportsRepositoryProvider2 = reportsRepositoryProvider2;
  }

  @Override
  public ReportsViewModel get() {
    ReportsViewModel instance = newInstance(reportsRepositoryProvider.get());
    ReportsViewModel_MembersInjector.injectReportsRepository(instance, reportsRepositoryProvider2.get());
    return instance;
  }

  public static ReportsViewModel_Factory create(
      Provider<ReportsRepository> reportsRepositoryProvider,
      Provider<ReportsRepository> reportsRepositoryProvider2) {
    return new ReportsViewModel_Factory(reportsRepositoryProvider, reportsRepositoryProvider2);
  }

  public static ReportsViewModel newInstance(ReportsRepository reportsRepository) {
    return new ReportsViewModel(reportsRepository);
  }
}
