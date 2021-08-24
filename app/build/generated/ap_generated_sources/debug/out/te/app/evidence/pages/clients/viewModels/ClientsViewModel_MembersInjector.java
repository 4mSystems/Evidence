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
public final class ClientsViewModel_MembersInjector implements MembersInjector<ClientsViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  public ClientsViewModel_MembersInjector(Provider<ClientsRepository> clientsRepositoryProvider) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
  }

  public static MembersInjector<ClientsViewModel> create(
      Provider<ClientsRepository> clientsRepositoryProvider) {
    return new ClientsViewModel_MembersInjector(clientsRepositoryProvider);
  }

  @Override
  public void injectMembers(ClientsViewModel instance) {
    injectClientsRepository(instance, clientsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.clients.viewModels.ClientsViewModel.clientsRepository")
  public static void injectClientsRepository(ClientsViewModel instance,
      ClientsRepository clientsRepository) {
    instance.clientsRepository = clientsRepository;
  }
}
