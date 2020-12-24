// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.myAds.viewModels;

import dagger.internal.Factory;
import grand.app.akar.repository.AdsRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyAdsViewModel_Factory implements Factory<MyAdsViewModel> {
  private final Provider<AdsRepository> adsRepositoryProvider;

  private final Provider<AdsRepository> adsRepositoryProvider2;

  public MyAdsViewModel_Factory(Provider<AdsRepository> adsRepositoryProvider,
      Provider<AdsRepository> adsRepositoryProvider2) {
    this.adsRepositoryProvider = adsRepositoryProvider;
    this.adsRepositoryProvider2 = adsRepositoryProvider2;
  }

  @Override
  public MyAdsViewModel get() {
    MyAdsViewModel instance = newInstance(adsRepositoryProvider.get());
    MyAdsViewModel_MembersInjector.injectAdsRepository(instance, adsRepositoryProvider2.get());
    return instance;
  }

  public static MyAdsViewModel_Factory create(Provider<AdsRepository> adsRepositoryProvider,
      Provider<AdsRepository> adsRepositoryProvider2) {
    return new MyAdsViewModel_Factory(adsRepositoryProvider, adsRepositoryProvider2);
  }

  public static MyAdsViewModel newInstance(AdsRepository adsRepository) {
    return new MyAdsViewModel(adsRepository);
  }
}