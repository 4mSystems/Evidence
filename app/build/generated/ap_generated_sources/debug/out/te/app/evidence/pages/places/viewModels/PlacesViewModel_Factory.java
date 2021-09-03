package te.app.evidence.pages.places.viewModels;

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
public final class PlacesViewModel_Factory implements Factory<PlacesViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  private final Provider<SettingsRepository> repositoryProvider2;

  public PlacesViewModel_Factory(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public PlacesViewModel get() {
    PlacesViewModel instance = newInstance(repositoryProvider.get());
    PlacesViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static PlacesViewModel_Factory create(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    return new PlacesViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static PlacesViewModel newInstance(SettingsRepository repository) {
    return new PlacesViewModel(repository);
  }
}
