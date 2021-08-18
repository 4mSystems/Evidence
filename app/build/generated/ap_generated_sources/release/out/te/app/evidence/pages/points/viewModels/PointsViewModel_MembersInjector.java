package te.app.evidence.pages.points.viewModels;

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
public final class PointsViewModel_MembersInjector implements MembersInjector<PointsViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  public PointsViewModel_MembersInjector(Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<PointsViewModel> create(
      Provider<SettingsRepository> repositoryProvider) {
    return new PointsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(PointsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.points.viewModels.PointsViewModel.repository")
  public static void injectRepository(PointsViewModel instance, SettingsRepository repository) {
    instance.repository = repository;
  }
}
