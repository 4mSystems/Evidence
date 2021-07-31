package te.app.evidence.pages.settings.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MyAccountSettingsViewModel_MembersInjector implements MembersInjector<MyAccountSettingsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public MyAccountSettingsViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<MyAccountSettingsViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new MyAccountSettingsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(MyAccountSettingsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.settings.viewModels.MyAccountSettingsViewModel.repository")
  public static void injectRepository(MyAccountSettingsViewModel instance,
      AuthRepository repository) {
    instance.repository = repository;
  }
}
