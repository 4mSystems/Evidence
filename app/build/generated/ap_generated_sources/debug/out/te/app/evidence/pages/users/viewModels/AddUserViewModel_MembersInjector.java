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
public final class AddUserViewModel_MembersInjector implements MembersInjector<AddUserViewModel> {
  private final Provider<SystemUsersRepository> usersRepositoryProvider;

  public AddUserViewModel_MembersInjector(Provider<SystemUsersRepository> usersRepositoryProvider) {
    this.usersRepositoryProvider = usersRepositoryProvider;
  }

  public static MembersInjector<AddUserViewModel> create(
      Provider<SystemUsersRepository> usersRepositoryProvider) {
    return new AddUserViewModel_MembersInjector(usersRepositoryProvider);
  }

  @Override
  public void injectMembers(AddUserViewModel instance) {
    injectUsersRepository(instance, usersRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.users.viewModels.AddUserViewModel.usersRepository")
  public static void injectUsersRepository(AddUserViewModel instance,
      SystemUsersRepository usersRepository) {
    instance.usersRepository = usersRepository;
  }
}
