package te.app.evidence.pages.users;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.users.viewModels.UserPermissionsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserPermissionsFragment_MembersInjector implements MembersInjector<UserPermissionsFragment> {
  private final Provider<UserPermissionsViewModel> viewModelProvider;

  public UserPermissionsFragment_MembersInjector(
      Provider<UserPermissionsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<UserPermissionsFragment> create(
      Provider<UserPermissionsViewModel> viewModelProvider) {
    return new UserPermissionsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(UserPermissionsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.users.UserPermissionsFragment.viewModel")
  public static void injectViewModel(UserPermissionsFragment instance,
      UserPermissionsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
