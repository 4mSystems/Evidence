// Generated by Dagger (https://dagger.dev).
package te.app.evidence.pages.settings.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.evidence.repository.SettingsRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsViewModel_MembersInjector implements MembersInjector<SettingsViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  public SettingsViewModel_MembersInjector(Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<SettingsViewModel> create(
      Provider<SettingsRepository> repositoryProvider) {
    return new SettingsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(SettingsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.settings.viewModels.SettingsViewModel.repository")
  public static void injectRepository(SettingsViewModel instance, SettingsRepository repository) {
    instance.repository = repository;
  }
}
