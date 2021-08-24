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
public final class AttachmentsViewModel_Factory implements Factory<AttachmentsViewModel> {
  private final Provider<AttachmentsRepository> attachmentsRepositoryProvider;

  private final Provider<AttachmentsRepository> attachmentsRepositoryProvider2;

  public AttachmentsViewModel_Factory(Provider<AttachmentsRepository> attachmentsRepositoryProvider,
      Provider<AttachmentsRepository> attachmentsRepositoryProvider2) {
    this.attachmentsRepositoryProvider = attachmentsRepositoryProvider;
    this.attachmentsRepositoryProvider2 = attachmentsRepositoryProvider2;
  }

  @Override
  public AttachmentsViewModel get() {
    AttachmentsViewModel instance = newInstance(attachmentsRepositoryProvider.get());
    AttachmentsViewModel_MembersInjector.injectAttachmentsRepository(instance, attachmentsRepositoryProvider2.get());
    return instance;
  }

  public static AttachmentsViewModel_Factory create(
      Provider<AttachmentsRepository> attachmentsRepositoryProvider,
      Provider<AttachmentsRepository> attachmentsRepositoryProvider2) {
    return new AttachmentsViewModel_Factory(attachmentsRepositoryProvider, attachmentsRepositoryProvider2);
  }

  public static AttachmentsViewModel newInstance(AttachmentsRepository attachmentsRepository) {
    return new AttachmentsViewModel(attachmentsRepository);
  }
}
