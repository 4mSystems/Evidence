package te.app.evidence.pages.publicFiles;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.publicFiles.viewModels.PublicFilesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PublicFilesFragment_MembersInjector implements MembersInjector<PublicFilesFragment> {
  private final Provider<PublicFilesViewModel> viewModelProvider;

  public PublicFilesFragment_MembersInjector(Provider<PublicFilesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<PublicFilesFragment> create(
      Provider<PublicFilesViewModel> viewModelProvider) {
    return new PublicFilesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(PublicFilesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.publicFiles.PublicFilesFragment.viewModel")
  public static void injectViewModel(PublicFilesFragment instance, PublicFilesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
