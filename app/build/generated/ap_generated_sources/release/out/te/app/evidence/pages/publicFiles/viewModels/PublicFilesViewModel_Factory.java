package te.app.evidence.pages.publicFiles.viewModels;

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
public final class PublicFilesViewModel_Factory implements Factory<PublicFilesViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  private final Provider<SettingsRepository> repositoryProvider2;

  public PublicFilesViewModel_Factory(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public PublicFilesViewModel get() {
    PublicFilesViewModel instance = newInstance(repositoryProvider.get());
    PublicFilesViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static PublicFilesViewModel_Factory create(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    return new PublicFilesViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static PublicFilesViewModel newInstance(SettingsRepository repository) {
    return new PublicFilesViewModel(repository);
  }
}
