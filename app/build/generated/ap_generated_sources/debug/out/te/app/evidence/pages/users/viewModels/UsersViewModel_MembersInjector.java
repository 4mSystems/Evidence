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
public final class UsersViewModel_MembersInjector implements MembersInjector<UsersViewModel> {
  private final Provider<SystemUsersRepository> usersRepositoryProvider;

  public UsersViewModel_MembersInjector(Provider<SystemUsersRepository> usersRepositoryProvider) {
    this.usersRepositoryProvider = usersRepositoryProvider;
  }

  public static MembersInjector<UsersViewModel> create(
      Provider<SystemUsersRepository> usersRepositoryProvider) {
    return new UsersViewModel_MembersInjector(usersRepositoryProvider);
  }

  @Override
  public void injectMembers(UsersViewModel instance) {
    injectUsersRepository(instance, usersRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.users.viewModels.UsersViewModel.usersRepository")
  public static void injectUsersRepository(UsersViewModel instance,
      SystemUsersRepository usersRepository) {
    instance.usersRepository = usersRepository;
  }
}
