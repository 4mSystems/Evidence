// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.myAds.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.repository.AdsRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyAdsViewModel_MembersInjector implements MembersInjector<MyAdsViewModel> {
  private final Provider<AdsRepository> adsRepositoryProvider;

  public MyAdsViewModel_MembersInjector(Provider<AdsRepository> adsRepositoryProvider) {
    this.adsRepositoryProvider = adsRepositoryProvider;
  }

  public static MembersInjector<MyAdsViewModel> create(
      Provider<AdsRepository> adsRepositoryProvider) {
    return new MyAdsViewModel_MembersInjector(adsRepositoryProvider);}

  @Override
  public void injectMembers(MyAdsViewModel instance) {
    injectAdsRepository(instance, adsRepositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.myAds.viewModels.MyAdsViewModel.adsRepository")
  public static void injectAdsRepository(MyAdsViewModel instance, AdsRepository adsRepository) {
    instance.adsRepository = adsRepository;
  }
}