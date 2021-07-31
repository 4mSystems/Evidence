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
public final class AddClientViewModel_MembersInjector implements MembersInjector<AddClientViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  public AddClientViewModel_MembersInjector(Provider<ClientsRepository> clientsRepositoryProvider) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
  }

  public static MembersInjector<AddClientViewModel> create(
      Provider<ClientsRepository> clientsRepositoryProvider) {
    return new AddClientViewModel_MembersInjector(clientsRepositoryProvider);
  }

  @Override
  public void injectMembers(AddClientViewModel instance) {
    injectClientsRepository(instance, clientsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.clients.viewModels.AddClientViewModel.clientsRepository")
  public static void injectClientsRepository(AddClientViewModel instance,
      ClientsRepository clientsRepository) {
    instance.clientsRepository = clientsRepository;
  }
}
