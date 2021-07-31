package te.app.evidence.pages.clients;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.clients.viewModels.AddClientViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddClientFragment_MembersInjector implements MembersInjector<AddClientFragment> {
  private final Provider<AddClientViewModel> viewModelProvider;

  public AddClientFragment_MembersInjector(Provider<AddClientViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddClientFragment> create(
      Provider<AddClientViewModel> viewModelProvider) {
    return new AddClientFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddClientFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.clients.AddClientFragment.viewModel")
  public static void injectViewModel(AddClientFragment instance, AddClientViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
