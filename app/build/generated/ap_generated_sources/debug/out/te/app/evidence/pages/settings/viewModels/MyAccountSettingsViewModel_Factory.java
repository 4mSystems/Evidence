package te.app.evidence.pages.settings.viewModels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.AuthRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyAccountSettingsViewModel_Factory implements Factory<MyAccountSettingsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public MyAccountSettingsViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public MyAccountSettingsViewModel get() {
    MyAccountSettingsViewModel instance = newInstance(repositoryProvider.get());
    MyAccountSettingsViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static MyAccountSettingsViewModel_Factory create(
      Provider<AuthRepository> repositoryProvider, Provider<AuthRepository> repositoryProvider2) {
    return new MyAccountSettingsViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static MyAccountSettingsViewModel newInstance(AuthRepository repository) {
    return new MyAccountSettingsViewModel(repository);
  }
}
