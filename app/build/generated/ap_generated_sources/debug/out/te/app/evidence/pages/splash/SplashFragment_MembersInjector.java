package te.app.evidence.pages.splash;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashFragment_MembersInjector implements MembersInjector<SplashFragment> {
  private final Provider<SplashViewModel> viewModelProvider;

  public SplashFragment_MembersInjector(Provider<SplashViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SplashFragment> create(
      Provider<SplashViewModel> viewModelProvider) {
    return new SplashFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SplashFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.splash.SplashFragment.viewModel")
  public static void injectViewModel(SplashFragment instance, SplashViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
