// Generated by Dagger (https://dagger.dev).
package te.app.evidence.repository;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.evidence.connection.ConnectionHelper;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdsRepository_Factory implements Factory<AdsRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  private final Provider<ConnectionHelper> connectionHelperProvider3;

  public AdsRepository_Factory(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2,
      Provider<ConnectionHelper> connectionHelperProvider3) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
    this.connectionHelperProvider3 = connectionHelperProvider3;
  }

  @Override
  public AdsRepository get() {
    AdsRepository instance = newInstance(connectionHelperProvider.get());
    BaseRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider2.get());
    AdsRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider3.get());
    return instance;
  }

  public static AdsRepository_Factory create(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2,
      Provider<ConnectionHelper> connectionHelperProvider3) {
    return new AdsRepository_Factory(connectionHelperProvider, connectionHelperProvider2, connectionHelperProvider3);
  }

  public static AdsRepository newInstance(ConnectionHelper connectionHelper) {
    return new AdsRepository(connectionHelper);
  }
}
