package te.app.evidence.repository;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.connection.ConnectionHelper;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ReportsRepository_Factory implements Factory<ReportsRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  private final Provider<ConnectionHelper> connectionHelperProvider3;

  public ReportsRepository_Factory(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2,
      Provider<ConnectionHelper> connectionHelperProvider3) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
    this.connectionHelperProvider3 = connectionHelperProvider3;
  }

  @Override
  public ReportsRepository get() {
    ReportsRepository instance = newInstance(connectionHelperProvider.get());
    BaseRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider2.get());
    ReportsRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider3.get());
    return instance;
  }

  public static ReportsRepository_Factory create(
      Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2,
      Provider<ConnectionHelper> connectionHelperProvider3) {
    return new ReportsRepository_Factory(connectionHelperProvider, connectionHelperProvider2, connectionHelperProvider3);
  }

  public static ReportsRepository newInstance(ConnectionHelper connectionHelper) {
    return new ReportsRepository(connectionHelper);
  }
}