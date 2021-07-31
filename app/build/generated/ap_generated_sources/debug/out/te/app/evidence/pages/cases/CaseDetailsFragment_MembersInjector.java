package te.app.evidence.pages.cases;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.cases.viewModels.CasesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CaseDetailsFragment_MembersInjector implements MembersInjector<CaseDetailsFragment> {
  private final Provider<CasesViewModel> viewModelProvider;

  public CaseDetailsFragment_MembersInjector(Provider<CasesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<CaseDetailsFragment> create(
      Provider<CasesViewModel> viewModelProvider) {
    return new CaseDetailsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(CaseDetailsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.CaseDetailsFragment.viewModel")
  public static void injectViewModel(CaseDetailsFragment instance, CasesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
