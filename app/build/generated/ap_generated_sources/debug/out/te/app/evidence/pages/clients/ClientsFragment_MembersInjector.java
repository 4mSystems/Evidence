package te.app.evidence.pages.clients;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClientsFragment_MembersInjector implements MembersInjector<ClientsFragment> {
  private final Provider<ClientsViewModel> viewModelProvider;

  public ClientsFragment_MembersInjector(Provider<ClientsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ClientsFragment> create(
      Provider<ClientsViewModel> viewModelProvider) {
    return new ClientsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ClientsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.clients.ClientsFragment.viewModel")
  public static void injectViewModel(ClientsFragment instance, ClientsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
