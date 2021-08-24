package te.app.evidence.pages.users;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.users.viewModels.AddUserViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddUserFragment_MembersInjector implements MembersInjector<AddUserFragment> {
  private final Provider<AddUserViewModel> viewModelProvider;

  public AddUserFragment_MembersInjector(Provider<AddUserViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddUserFragment> create(
      Provider<AddUserViewModel> viewModelProvider) {
    return new AddUserFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddUserFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.users.AddUserFragment.viewModel")
  public static void injectViewModel(AddUserFragment instance, AddUserViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
