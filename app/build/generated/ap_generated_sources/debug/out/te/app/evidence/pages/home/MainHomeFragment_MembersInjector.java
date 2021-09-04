package te.app.evidence.pages.home;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.home.viewModels.HomeViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainHomeFragment_MembersInjector implements MembersInjector<MainHomeFragment> {
  private final Provider<HomeViewModel> viewModelProvider;

  public MainHomeFragment_MembersInjector(Provider<HomeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MainHomeFragment> create(
      Provider<HomeViewModel> viewModelProvider) {
    return new MainHomeFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MainHomeFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.home.MainHomeFragment.viewModel")
  public static void injectViewModel(MainHomeFragment instance, HomeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
