package te.app.evidence.pages.sessions;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.sessions.viewModels.AddSessionViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddSessionFragment_MembersInjector implements MembersInjector<AddSessionFragment> {
  private final Provider<AddSessionViewModel> viewModelProvider;

  public AddSessionFragment_MembersInjector(Provider<AddSessionViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddSessionFragment> create(
      Provider<AddSessionViewModel> viewModelProvider) {
    return new AddSessionFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddSessionFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.sessions.AddSessionFragment.viewModel")
  public static void injectViewModel(AddSessionFragment instance, AddSessionViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
