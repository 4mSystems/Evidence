package te.app.evidence.pages.clients.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.ClientsRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClientProfileViewModel_MembersInjector implements MembersInjector<ClientProfileViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  public ClientProfileViewModel_MembersInjector(
      Provider<ClientsRepository> clientsRepositoryProvider) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
  }

  public static MembersInjector<ClientProfileViewModel> create(
      Provider<ClientsRepository> clientsRepositoryProvider) {
    return new ClientProfileViewModel_MembersInjector(clientsRepositoryProvider);
  }

  @Override
  public void injectMembers(ClientProfileViewModel instance) {
    injectClientsRepository(instance, clientsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.clients.viewModels.ClientProfileViewModel.clientsRepository")
  public static void injectClientsRepository(ClientProfileViewModel instance,
      ClientsRepository clientsRepository) {
    instance.clientsRepository = clientsRepository;
  }
}