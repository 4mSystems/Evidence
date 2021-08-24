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
public final class AddAttachmentViewModel_MembersInjector implements MembersInjector<AddAttachmentViewModel> {
  private final Provider<AttachmentsRepository> attachmentsRepositoryProvider;

  public AddAttachmentViewModel_MembersInjector(
      Provider<AttachmentsRepository> attachmentsRepositoryProvider) {
    this.attachmentsRepositoryProvider = attachmentsRepositoryProvider;
  }

  public static MembersInjector<AddAttachmentViewModel> create(
      Provider<AttachmentsRepository> attachmentsRepositoryProvider) {
    return new AddAttachmentViewModel_MembersInjector(attachmentsRepositoryProvider);
  }

  @Override
  public void injectMembers(AddAttachmentViewModel instance) {
    injectAttachmentsRepository(instance, attachmentsRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel.attachmentsRepository")
  public static void injectAttachmentsRepository(AddAttachmentViewModel instance,
      AttachmentsRepository attachmentsRepository) {
    instance.attachmentsRepository = attachmentsRepository;
  }
}
