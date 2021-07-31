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
public final class NotesRepository_MembersInjector implements MembersInjector<NotesRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public NotesRepository_MembersInjector(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  public static MembersInjector<NotesRepository> create(
      Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new NotesRepository_MembersInjector(connectionHelperProvider, connectionHelperProvider2);
  }

  @Override
  public void injectMembers(NotesRepository instance) {
    BaseRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider.get());
    injectConnectionHelper(instance, connectionHelperProvider2.get());
  }

  @InjectedFieldSignature("te.app.evidence.repository.NotesRepository.connectionHelper")
  public static void injectConnectionHelper(NotesRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}
