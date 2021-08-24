package te.app.evidence.pages.reports;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.reports.viewModels.ReportsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DailyReportsFragment_MembersInjector implements MembersInjector<DailyReportsFragment> {
  private final Provider<ReportsViewModel> viewModelProvider;

  public DailyReportsFragment_MembersInjector(Provider<ReportsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<DailyReportsFragment> create(
      Provider<ReportsViewModel> viewModelProvider) {
    return new DailyReportsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(DailyReportsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.reports.DailyReportsFragment.viewModel")
  public static void injectViewModel(DailyReportsFragment instance, ReportsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
