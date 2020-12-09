// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.auth.register;

import dagger.internal.Factory;
import grand.app.akar.repository.AuthRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public RegisterViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public RegisterViewModel get() {
    RegisterViewModel instance = newInstance(repositoryProvider.get());
    RegisterViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static RegisterViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new RegisterViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static RegisterViewModel newInstance(AuthRepository repository) {
    return new RegisterViewModel(repository);
  }
}
