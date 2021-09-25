package te.app.evidence.pages.points.viewModels;

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
public final class PointsViewModel_Factory implements Factory<PointsViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  private final Provider<SettingsRepository> repositoryProvider2;

  public PointsViewModel_Factory(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public PointsViewModel get() {
    PointsViewModel instance = newInstance(repositoryProvider.get());
    PointsViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static PointsViewModel_Factory create(Provider<SettingsRepository> repositoryProvider,
      Provider<SettingsRepository> repositoryProvider2) {
    return new PointsViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static PointsViewModel newInstance(SettingsRepository repository) {
    return new PointsViewModel(repository);
  }
}
