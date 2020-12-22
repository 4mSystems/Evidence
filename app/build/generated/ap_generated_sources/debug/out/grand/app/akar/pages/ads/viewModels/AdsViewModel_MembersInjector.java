// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.ads.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.repository.AuthRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdsViewModel_MembersInjector implements MembersInjector<AdsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public AdsViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<AdsViewModel> create(Provider<AuthRepository> repositoryProvider) {
    return new AdsViewModel_MembersInjector(repositoryProvider);}

  @Override
  public void injectMembers(AdsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.ads.viewModels.AdsViewModel.repository")
  public static void injectRepository(AdsViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
