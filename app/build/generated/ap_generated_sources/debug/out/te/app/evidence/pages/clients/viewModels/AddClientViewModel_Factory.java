// Generated by Dagger (https://dagger.dev).
package te.app.evidence.pages.clients.viewModels;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.evidence.repository.ClientsRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddClientViewModel_Factory implements Factory<AddClientViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  private final Provider<ClientsRepository> clientsRepositoryProvider2;

  public AddClientViewModel_Factory(Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
    this.clientsRepositoryProvider2 = clientsRepositoryProvider2;
  }

  @Override
  public AddClientViewModel get() {
    AddClientViewModel instance = newInstance(clientsRepositoryProvider.get());
    AddClientViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider2.get());
    return instance;
  }

  public static AddClientViewModel_Factory create(
      Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    return new AddClientViewModel_Factory(clientsRepositoryProvider, clientsRepositoryProvider2);
  }

  public static AddClientViewModel newInstance(ClientsRepository clientsRepository) {
    return new AddClientViewModel(clientsRepository);
  }
}
