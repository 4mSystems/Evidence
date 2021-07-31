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
public final class AdsRepository_MembersInjector implements MembersInjector<AdsRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public AdsRepository_MembersInjector(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  public static MembersInjector<AdsRepository> create(
      Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new AdsRepository_MembersInjector(connectionHelperProvider, connectionHelperProvider2);
  }

  @Override
  public void injectMembers(AdsRepository instance) {
    BaseRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider.get());
    injectConnectionHelper(instance, connectionHelperProvider2.get());
  }

  @InjectedFieldSignature("te.app.evidence.repository.AdsRepository.connectionHelper")
  public static void injectConnectionHelper(AdsRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}
