package te.app.evidence.pages.users.viewModels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.SystemUsersRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UsersViewModel_Factory implements Factory<UsersViewModel> {
  private final Provider<SystemUsersRepository> usersRepositoryProvider;

  private final Provider<SystemUsersRepository> usersRepositoryProvider2;

  public UsersViewModel_Factory(Provider<SystemUsersRepository> usersRepositoryProvider,
      Provider<SystemUsersRepository> usersRepositoryProvider2) {
    this.usersRepositoryProvider = usersRepositoryProvider;
    this.usersRepositoryProvider2 = usersRepositoryProvider2;
  }

  @Override
  public UsersViewModel get() {
    UsersViewModel instance = newInstance(usersRepositoryProvider.get());
    UsersViewModel_MembersInjector.injectUsersRepository(instance, usersRepositoryProvider2.get());
    return instance;
  }

  public static UsersViewModel_Factory create(
      Provider<SystemUsersRepository> usersRepositoryProvider,
      Provider<SystemUsersRepository> usersRepositoryProvider2) {
    return new UsersViewModel_Factory(usersRepositoryProvider, usersRepositoryProvider2);
  }

  public static UsersViewModel newInstance(SystemUsersRepository usersRepository) {
    return new UsersViewModel(usersRepository);
  }
}
