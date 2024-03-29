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
public final class AddUserViewModel_Factory implements Factory<AddUserViewModel> {
  private final Provider<SystemUsersRepository> usersRepositoryProvider;

  private final Provider<SystemUsersRepository> usersRepositoryProvider2;

  public AddUserViewModel_Factory(Provider<SystemUsersRepository> usersRepositoryProvider,
      Provider<SystemUsersRepository> usersRepositoryProvider2) {
    this.usersRepositoryProvider = usersRepositoryProvider;
    this.usersRepositoryProvider2 = usersRepositoryProvider2;
  }

  @Override
  public AddUserViewModel get() {
    AddUserViewModel instance = newInstance(usersRepositoryProvider.get());
    AddUserViewModel_MembersInjector.injectUsersRepository(instance, usersRepositoryProvider2.get());
    return instance;
  }

  public static AddUserViewModel_Factory create(
      Provider<SystemUsersRepository> usersRepositoryProvider,
      Provider<SystemUsersRepository> usersRepositoryProvider2) {
    return new AddUserViewModel_Factory(usersRepositoryProvider, usersRepositoryProvider2);
  }

  public static AddUserViewModel newInstance(SystemUsersRepository usersRepository) {
    return new AddUserViewModel(usersRepository);
  }
}
