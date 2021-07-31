package te.app.evidence.pages.cases;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.cases.viewModels.SearchClientsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchClientsFragment_MembersInjector implements MembersInjector<SearchClientsFragment> {
  private final Provider<SearchClientsViewModel> viewModelProvider;

  public SearchClientsFragment_MembersInjector(Provider<SearchClientsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SearchClientsFragment> create(
      Provider<SearchClientsViewModel> viewModelProvider) {
    return new SearchClientsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SearchClientsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.SearchClientsFragment.viewModel")
  public static void injectViewModel(SearchClientsFragment instance,
      SearchClientsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
