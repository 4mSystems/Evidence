package te.app.evidence.repository;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class CategoriesRepository_MembersInjector implements MembersInjector<CategoriesRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public CategoriesRepository_MembersInjector(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  public static MembersInjector<CategoriesRepository> create(
      Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new CategoriesRepository_MembersInjector(connectionHelperProvider, connectionHelperProvider2);
  }

  @Override
  public void injectMembers(CategoriesRepository instance) {
    BaseRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider.get());
    injectConnectionHelper(instance, connectionHelperProvider2.get());
  }

  @InjectedFieldSignature("te.app.evidence.repository.CategoriesRepository.connectionHelper")
  public static void injectConnectionHelper(CategoriesRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}
