package te.app.evidence.pages.attachments;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.attachments.viewModels.AttachmentsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AttachmentsFragment_MembersInjector implements MembersInjector<AttachmentsFragment> {
  private final Provider<AttachmentsViewModel> viewModelProvider;

  public AttachmentsFragment_MembersInjector(Provider<AttachmentsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AttachmentsFragment> create(
      Provider<AttachmentsViewModel> viewModelProvider) {
    return new AttachmentsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AttachmentsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.attachments.AttachmentsFragment.viewModel")
  public static void injectViewModel(AttachmentsFragment instance, AttachmentsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
