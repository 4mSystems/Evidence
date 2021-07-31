package te.app.evidence.pages.cases;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.cases.viewModels.AddCaseViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddCaseFragment_MembersInjector implements MembersInjector<AddCaseFragment> {
  private final Provider<AddCaseViewModel> viewModelProvider;

  public AddCaseFragment_MembersInjector(Provider<AddCaseViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddCaseFragment> create(
      Provider<AddCaseViewModel> viewModelProvider) {
    return new AddCaseFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddCaseFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.AddCaseFragment.viewModel")
  public static void injectViewModel(AddCaseFragment instance, AddCaseViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
