package te.app.evidence.pages.reports.viewModels;

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
public final class ReportsViewModel_Factory implements Factory<ReportsViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  private final Provider<ClientsRepository> clientsRepositoryProvider2;

  public ReportsViewModel_Factory(Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
    this.clientsRepositoryProvider2 = clientsRepositoryProvider2;
  }

  @Override
  public ReportsViewModel get() {
    ReportsViewModel instance = newInstance(clientsRepositoryProvider.get());
    ReportsViewModel_MembersInjector.injectClientsRepository(instance, clientsRepositoryProvider2.get());
    return instance;
  }

  public static ReportsViewModel_Factory create(
      Provider<ClientsRepository> clientsRepositoryProvider,
      Provider<ClientsRepository> clientsRepositoryProvider2) {
    return new ReportsViewModel_Factory(clientsRepositoryProvider, clientsRepositoryProvider2);
  }

  public static ReportsViewModel newInstance(ClientsRepository clientsRepository) {
    return new ReportsViewModel(clientsRepository);
  }
}
