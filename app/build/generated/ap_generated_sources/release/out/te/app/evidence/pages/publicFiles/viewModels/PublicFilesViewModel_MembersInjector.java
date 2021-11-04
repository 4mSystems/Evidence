package te.app.evidence.pages.publicFiles.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.SettingsRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PublicFilesViewModel_MembersInjector implements MembersInjector<PublicFilesViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  public PublicFilesViewModel_MembersInjector(Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<PublicFilesViewModel> create(
      Provider<SettingsRepository> repositoryProvider) {
    return new PublicFilesViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(PublicFilesViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.publicFiles.viewModels.PublicFilesViewModel.repository")
  public static void injectRepository(PublicFilesViewModel instance,
      SettingsRepository repository) {
    instance.repository = repository;
  }
}
