package te.app.evidence.pages.cases;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.cases.viewModels.CaseClientsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CaseClientsFragment_MembersInjector implements MembersInjector<CaseClientsFragment> {
  private final Provider<CaseClientsViewModel> viewModelProvider;

  public CaseClientsFragment_MembersInjector(Provider<CaseClientsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<CaseClientsFragment> create(
      Provider<CaseClientsViewModel> viewModelProvider) {
    return new CaseClientsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(CaseClientsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.CaseClientsFragment.viewModel")
  public static void injectViewModel(CaseClientsFragment instance, CaseClientsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
