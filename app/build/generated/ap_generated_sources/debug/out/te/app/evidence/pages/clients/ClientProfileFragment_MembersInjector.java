package te.app.evidence.pages.clients;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.clients.viewModels.ClientProfileViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClientProfileFragment_MembersInjector implements MembersInjector<ClientProfileFragment> {
  private final Provider<ClientProfileViewModel> viewModelProvider;

  public ClientProfileFragment_MembersInjector(Provider<ClientProfileViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ClientProfileFragment> create(
      Provider<ClientProfileViewModel> viewModelProvider) {
    return new ClientProfileFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ClientProfileFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.clients.ClientProfileFragment.viewModel")
  public static void injectViewModel(ClientProfileFragment instance,
      ClientProfileViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
