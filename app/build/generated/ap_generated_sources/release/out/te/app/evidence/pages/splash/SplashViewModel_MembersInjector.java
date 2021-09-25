package te.app.evidence.pages.splash;

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
public final class SplashViewModel_MembersInjector implements MembersInjector<SplashViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public SplashViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<SplashViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new SplashViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(SplashViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.splash.SplashViewModel.repository")
  public static void injectRepository(SplashViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
