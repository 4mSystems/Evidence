package te.app.evidence.pages.settings.viewModels;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.AuthRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DocumentsViewModel_Factory implements Factory<DocumentsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public DocumentsViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public DocumentsViewModel get() {
    DocumentsViewModel instance = newInstance(repositoryProvider.get());
    DocumentsViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static DocumentsViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new DocumentsViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static DocumentsViewModel newInstance(AuthRepository repository) {
    return new DocumentsViewModel(repository);
  }
}
