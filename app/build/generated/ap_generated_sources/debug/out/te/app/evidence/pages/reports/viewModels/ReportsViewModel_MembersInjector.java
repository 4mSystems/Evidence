package te.app.evidence.pages.reports.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class ReportsViewModel_MembersInjector implements MembersInjector<ReportsViewModel> {
  private final Provider<ReportsRepository> reportsRepositoryProvider;

  public ReportsViewModel_MembersInjector(Provider<ReportsRepository> reportsRepositoryProvider) {
    this.reportsRepositoryProvider = reportsRepositoryProvider;
  }

  public static MembersInjector<ReportsViewModel> create(
      Provider<ReportsRepository> reportsRepositoryProvider) {
    return new ReportsViewModel_MembersInjector(reportsRepositoryProvider);
  }

  @Override
  public void injectMembers(ReportsViewModel instance) {
    injectReportsRepository(instance, reportsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.reports.viewModels.ReportsViewModel.reportsRepository")
  public static void injectReportsRepository(ReportsViewModel instance,
      ReportsRepository reportsRepository) {
    instance.reportsRepository = reportsRepository;
  }
}
