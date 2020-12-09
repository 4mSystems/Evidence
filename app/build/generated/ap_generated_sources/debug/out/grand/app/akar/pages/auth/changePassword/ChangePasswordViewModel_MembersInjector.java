// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.auth.changePassword;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.repository.AuthRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChangePasswordViewModel_MembersInjector implements MembersInjector<ChangePasswordViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public ChangePasswordViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ChangePasswordViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new ChangePasswordViewModel_MembersInjector(repositoryProvider);}

  @Override
  public void injectMembers(ChangePasswordViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.auth.changePassword.ChangePasswordViewModel.repository")
  public static void injectRepository(ChangePasswordViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
