package te.app.evidence.pages.attachments;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.attachments.viewModels.AddAttachmentViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddAttachmentFragment_MembersInjector implements MembersInjector<AddAttachmentFragment> {
  private final Provider<AddAttachmentViewModel> viewModelProvider;

  public AddAttachmentFragment_MembersInjector(Provider<AddAttachmentViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddAttachmentFragment> create(
      Provider<AddAttachmentViewModel> viewModelProvider) {
    return new AddAttachmentFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddAttachmentFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.attachments.AddAttachmentFragment.viewModel")
  public static void injectViewModel(AddAttachmentFragment instance,
      AddAttachmentViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
