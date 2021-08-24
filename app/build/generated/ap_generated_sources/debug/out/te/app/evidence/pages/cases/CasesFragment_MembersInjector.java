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
public final class CasesFragment_MembersInjector implements MembersInjector<CasesFragment> {
  private final Provider<CasesViewModel> viewModelProvider;

  public CasesFragment_MembersInjector(Provider<CasesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<CasesFragment> create(Provider<CasesViewModel> viewModelProvider) {
    return new CasesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(CasesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.CasesFragment.viewModel")
  public static void injectViewModel(CasesFragment instance, CasesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
