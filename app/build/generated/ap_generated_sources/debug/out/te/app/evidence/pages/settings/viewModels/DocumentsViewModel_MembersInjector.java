package te.app.evidence.pages.settings.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class DocumentsViewModel_MembersInjector implements MembersInjector<DocumentsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public DocumentsViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<DocumentsViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new DocumentsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(DocumentsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.settings.viewModels.DocumentsViewModel.repository")
  public static void injectRepository(DocumentsViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
