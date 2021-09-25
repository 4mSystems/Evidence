package te.app.evidence.pages.services.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.SettingsRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServicesViewModel_MembersInjector implements MembersInjector<ServicesViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  public ServicesViewModel_MembersInjector(Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ServicesViewModel> create(
      Provider<SettingsRepository> repositoryProvider) {
    return new ServicesViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(ServicesViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.services.viewModels.ServicesViewModel.repository")
  public static void injectRepository(ServicesViewModel instance, SettingsRepository repository) {
    instance.repository = repository;
  }
}
