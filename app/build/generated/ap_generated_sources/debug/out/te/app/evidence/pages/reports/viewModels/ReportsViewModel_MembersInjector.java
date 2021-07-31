package te.app.evidence.pages.reports.viewModels;

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
public final class ReportsViewModel_MembersInjector implements MembersInjector<ReportsViewModel> {
  private final Provider<ClientsRepository> clientsRepositoryProvider;

  public ReportsViewModel_MembersInjector(Provider<ClientsRepository> clientsRepositoryProvider) {
    this.clientsRepositoryProvider = clientsRepositoryProvider;
  }

  public static MembersInjector<ReportsViewModel> create(
      Provider<ClientsRepository> clientsRepositoryProvider) {
    return new ReportsViewModel_MembersInjector(clientsRepositoryProvider);
  }

  @Override
  public void injectMembers(ReportsViewModel instance) {
    injectClientsRepository(instance, clientsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.reports.viewModels.ReportsViewModel.clientsRepository")
  public static void injectClientsRepository(ReportsViewModel instance,
      ClientsRepository clientsRepository) {
    instance.clientsRepository = clientsRepository;
  }
}
