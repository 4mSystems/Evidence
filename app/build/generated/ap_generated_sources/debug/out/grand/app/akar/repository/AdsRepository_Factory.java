// Generated by Dagger (https://dagger.dev).
package grand.app.akar.repository;

import dagger.internal.Factory;
import grand.app.akar.connection.ConnectionHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdsRepository_Factory implements Factory<AdsRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public AdsRepository_Factory(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  @Override
  public AdsRepository get() {
    AdsRepository instance = newInstance(connectionHelperProvider.get());
    AdsRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider2.get());
    return instance;
  }

  public static AdsRepository_Factory create(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new AdsRepository_Factory(connectionHelperProvider, connectionHelperProvider2);
  }

  public static AdsRepository newInstance(ConnectionHelper connectionHelper) {
    return new AdsRepository(connectionHelper);
  }
}