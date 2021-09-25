package te.app.evidence.pages.places.viewModels;

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
public final class PlacesViewModel_MembersInjector implements MembersInjector<PlacesViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  public PlacesViewModel_MembersInjector(Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<PlacesViewModel> create(
      Provider<SettingsRepository> repositoryProvider) {
    return new PlacesViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(PlacesViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.places.viewModels.PlacesViewModel.repository")
  public static void injectRepository(PlacesViewModel instance, SettingsRepository repository) {
    instance.repository = repository;
  }
}
