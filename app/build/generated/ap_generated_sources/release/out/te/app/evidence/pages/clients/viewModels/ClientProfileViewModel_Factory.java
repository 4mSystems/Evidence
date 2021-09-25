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
public final class ClientProfileViewModel_Factory implements Factory<ClientProfileViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  private final Provider<ClientsRepository> clientsRepositoryProvider2;

  public ClientProfileViewModel_Factory(Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
    this.clientsRepositoryProvider2 = clientsRepositoryProvider2;
  }

  @Override
  public ClientProfileViewModel get() {
    ClientProfileViewModel instance = newInstance(clientsRepositoryProvider.get());
    ClientProfileViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider2.get());
    return instance;
  }

  public static ClientProfileViewModel_Factory create(
      Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    return new ClientProfileViewModel_Factory(clientsRepositoryProvider, clientsRepositoryProvider2);
  }

  public static ClientProfileViewModel newInstance(ClientsRepository clientsRepository) {
    return new ClientProfileViewModel(clientsRepository);
  }
}
