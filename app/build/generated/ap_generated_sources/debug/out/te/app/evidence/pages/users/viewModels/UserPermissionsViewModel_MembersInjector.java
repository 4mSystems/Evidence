package te.app.evidence.pages.users.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class UserPermissionsViewModel_MembersInjector implements MembersInjector<UserPermissionsViewModel> {
  private final Provider<SystemUsersRepository> usersRepositoryProvider;

  public UserPermissionsViewModel_MembersInjector(
      Provider<SystemUsersRepository> usersRepositoryProvider) {
    this.usersRepositoryProvider = usersRepositoryProvider;
  }

  public static MembersInjector<UserPermissionsViewModel> create(
      Provider<SystemUsersRepository> usersRepositoryProvider) {
    return new UserPermissionsViewModel_MembersInjector(usersRepositoryProvider);
  }

  @Override
  public void injectMembers(UserPermissionsViewModel instance) {
    injectUsersRepository(instance, usersRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.users.viewModels.UserPermissionsViewModel.usersRepository")
  public static void injectUsersRepository(UserPermissionsViewModel instance,
      SystemUsersRepository usersRepository) {
    instance.usersRepository = usersRepository;
  }
}
