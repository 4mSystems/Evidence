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
public final class MonthlyReportsFragment_MembersInjector implements MembersInjector<MonthlyReportsFragment> {
  private final Provider<ReportsViewModel> viewModelProvider;

  public MonthlyReportsFragment_MembersInjector(Provider<ReportsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MonthlyReportsFragment> create(
      Provider<ReportsViewModel> viewModelProvider) {
    return new MonthlyReportsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MonthlyReportsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.reports.MonthlyReportsFragment.viewModel")
  public static void injectViewModel(MonthlyReportsFragment instance, ReportsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
