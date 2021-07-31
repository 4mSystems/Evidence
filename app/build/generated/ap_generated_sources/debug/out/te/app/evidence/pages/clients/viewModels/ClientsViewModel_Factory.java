package te.app.evidence.pages.clients.viewModels;

import dagger.internal.Factory;
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
public final class ClientsViewModel_Factory implements Factory<ClientsViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  private final Provider<ClientsRepository> clientsRepositoryProvider2;

  public ClientsViewModel_Factory(Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
    this.clientsRepositoryProvider2 = clientsRepositoryProvider2;
  }

  @Override
  public ClientsViewModel get() {
    ClientsViewModel instance = newInstance(clientsRepositoryProvider.get());
    ClientsViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider2.get());
    return instance;
  }

  public static ClientsViewModel_Factory create(
      Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    return new ClientsViewModel_Factory(clientsRepositoryProvider, clientsRepositoryProvider2);
  }

  public static ClientsViewModel newInstance(ClientsRepository clientsRepository) {
    return new ClientsViewModel(clientsRepository);
  }
}
