// Generated by Dagger (https://dagger.dev).
package grand.app.akar.repository;

import dagger.internal.Factory;
import grand.app.akar.connection.ConnectionHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public AuthRepository_Factory(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  @Override
  public AuthRepository get() {
    AuthRepository instance = newInstance(connectionHelperProvider.get());
    AuthRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider2.get());
    return instance;
  }

  public static AuthRepository_Factory create(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new AuthRepository_Factory(connectionHelperProvider, connectionHelperProvider2);
  }

  public static AuthRepository newInstance(ConnectionHelper connectionHelper) {
    return new AuthRepository(connectionHelper);
  }
}
