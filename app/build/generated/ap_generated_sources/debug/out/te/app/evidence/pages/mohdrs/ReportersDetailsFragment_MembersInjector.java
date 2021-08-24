package te.app.evidence.pages.mohdrs;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.mohdrs.viewModels.ReportersDetailsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ReportersDetailsFragment_MembersInjector implements MembersInjector<ReportersDetailsFragment> {
  private final Provider<ReportersDetailsViewModel> viewModelProvider;

  public ReportersDetailsFragment_MembersInjector(
      Provider<ReportersDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ReportersDetailsFragment> create(
      Provider<ReportersDetailsViewModel> viewModelProvider) {
    return new ReportersDetailsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ReportersDetailsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.mohdrs.ReportersDetailsFragment.viewModel")
  public static void injectViewModel(ReportersDetailsFragment instance,
      ReportersDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
