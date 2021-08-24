package te.app.evidence.pages.cases;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.cases.viewModels.AddClientToCaseViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddClientToCaseFragment_MembersInjector implements MembersInjector<AddClientToCaseFragment> {
  private final Provider<AddClientToCaseViewModel> viewModelProvider;

  public AddClientToCaseFragment_MembersInjector(
      Provider<AddClientToCaseViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddClientToCaseFragment> create(
      Provider<AddClientToCaseViewModel> viewModelProvider) {
    return new AddClientToCaseFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddClientToCaseFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.AddClientToCaseFragment.viewModel")
  public static void injectViewModel(AddClientToCaseFragment instance,
      AddClientToCaseViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
