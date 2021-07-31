package te.app.evidence.pages.attachments.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.AttachmentsRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AttachmentsViewModel_MembersInjector implements MembersInjector<AttachmentsViewModel> {
  private final Provider<AttachmentsRepository> attachmentsRepositoryProvider;

  public AttachmentsViewModel_MembersInjector(
      Provider<AttachmentsRepository> attachmentsRepositoryProvider) {
    this.attachmentsRepositoryProvider = attachmentsRepositoryProvider;
  }

  public static MembersInjector<AttachmentsViewModel> create(
      Provider<AttachmentsRepository> attachmentsRepositoryProvider) {
    return new AttachmentsViewModel_MembersInjector(attachmentsRepositoryProvider);
  }

  @Override
  public void injectMembers(AttachmentsViewModel instance) {
    injectAttachmentsRepository(instance, attachmentsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel.attachmentsRepository")
  public static void injectAttachmentsRepository(AttachmentsViewModel instance,
      AttachmentsRepository attachmentsRepository) {
    instance.attachmentsRepository = attachmentsRepository;
  }
}
