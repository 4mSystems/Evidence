package te.app.evidence.pages.attachments.viewModels;

import dagger.internal.Factory;
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
public final class AddAttachmentViewModel_Factory implements Factory<AddAttachmentViewModel> {
  private final Provider<AttachmentsRepository> attachmentsRepositoryProvider;

  private final Provider<AttachmentsRepository> attachmentsRepositoryProvider2;

  public AddAttachmentViewModel_Factory(
      Provider<AttachmentsRepository> attachmentsRepositoryProvider,
      Provider<AttachmentsRepository> attachmentsRepositoryProvider2) {
    this.attachmentsRepositoryProvider = attachmentsRepositoryProvider;
    this.attachmentsRepositoryProvider2 = attachmentsRepositoryProvider2;
  }

  @Override
  public AddAttachmentViewModel get() {
    AddAttachmentViewModel instance = newInstance(attachmentsRepositoryProvider.get());
    AddAttachmentViewModel_MembersInjector.injectAttachmentsRepository(instance, attachmentsRepositoryProvider2.get());
    return instance;
  }

  public static AddAttachmentViewModel_Factory create(
      Provider<AttachmentsRepository> attachmentsRepositoryProvider,
      Provider<AttachmentsRepository> attachmentsRepositoryProvider2) {
    return new AddAttachmentViewModel_Factory(attachmentsRepositoryProvider, attachmentsRepositoryProvider2);
  }

  public static AddAttachmentViewModel newInstance(AttachmentsRepository attachmentsRepository) {
    return new AddAttachmentViewModel(attachmentsRepository);
  }
}
