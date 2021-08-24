package te.app.evidence.pages.users;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.users.viewModels.UsersViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UsersFragment_MembersInjector implements MembersInjector<UsersFragment> {
  private final Provider<UsersViewModel> viewModelProvider;

  public UsersFragment_MembersInjector(Provider<UsersViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<UsersFragment> create(Provider<UsersViewModel> viewModelProvider) {
    return new UsersFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(UsersFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.users.UsersFragment.viewModel")
  public static void injectViewModel(UsersFragment instance, UsersViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
