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
public final class EditCaseFragment_MembersInjector implements MembersInjector<EditCaseFragment> {
  private final Provider<AddCaseViewModel> viewModelProvider;

  public EditCaseFragment_MembersInjector(Provider<AddCaseViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<EditCaseFragment> create(
      Provider<AddCaseViewModel> viewModelProvider) {
    return new EditCaseFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(EditCaseFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.cases.EditCaseFragment.viewModel")
  public static void injectViewModel(EditCaseFragment instance, AddCaseViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
