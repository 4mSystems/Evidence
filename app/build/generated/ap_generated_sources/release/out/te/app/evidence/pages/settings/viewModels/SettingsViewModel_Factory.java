// Generated by Dagger (https://dagger.dev).
package te.app.evidence.pages.settings.viewModels;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.evidence.repository.SettingsRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  private final Provider<SettingsRepository> repositoryProvider2;

  public SettingsViewModel_Factory(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public SettingsViewModel get() {
    SettingsViewModel instance = newInstance(repositoryProvider.get());
    SettingsViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static SettingsViewModel_Factory create(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    return new SettingsViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static SettingsViewModel newInstance(SettingsRepository repository) {
    return new SettingsViewModel(repository);
  }
}
