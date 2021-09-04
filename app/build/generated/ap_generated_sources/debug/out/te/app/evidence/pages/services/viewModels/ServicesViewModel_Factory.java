package te.app.evidence.pages.services.viewModels;

import dagger.internal.Factory;
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
public final class ServicesViewModel_Factory implements Factory<ServicesViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  private final Provider<SettingsRepository> repositoryProvider2;

  public ServicesViewModel_Factory(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public ServicesViewModel get() {
    ServicesViewModel instance = newInstance(repositoryProvider.get());
    ServicesViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static ServicesViewModel_Factory create(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    return new ServicesViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static ServicesViewModel newInstance(SettingsRepository repository) {
    return new ServicesViewModel(repository);
  }
}
