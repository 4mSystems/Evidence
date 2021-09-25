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
public final class UserPermissionsViewModel_Factory implements Factory<UserPermissionsViewModel> {
  private final Provider<SystemUsersRepository> usersRepositoryProvider;

  private final Provider<SystemUsersRepository> usersRepositoryProvider2;

  public UserPermissionsViewModel_Factory(Provider<SystemUsersRepository> usersRepositoryProvider,
      Provider<SystemUsersRepository> usersRepositoryProvider2) {
    this.usersRepositoryProvider = usersRepositoryProvider;
    this.usersRepositoryProvider2 = usersRepositoryProvider2;
  }

  @Override
  public UserPermissionsViewModel get() {
    UserPermissionsViewModel instance = newInstance(usersRepositoryProvider.get());
    UserPermissionsViewModel_MembersInjector.injectUsersRepository(instance, usersRepositoryProvider2.get());
    return instance;
  }

  public static UserPermissionsViewModel_Factory create(
      Provider<SystemUsersRepository> usersRepositoryProvider,
      Provider<SystemUsersRepository> usersRepositoryProvider2) {
    return new UserPermissionsViewModel_Factory(usersRepositoryProvider, usersRepositoryProvider2);
  }

  public static UserPermissionsViewModel newInstance(SystemUsersRepository usersRepository) {
    return new UserPermissionsViewModel(usersRepository);
  }
}
