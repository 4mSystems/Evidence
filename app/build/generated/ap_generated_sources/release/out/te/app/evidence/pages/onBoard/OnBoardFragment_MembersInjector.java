package te.app.evidence.pages.onBoard;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.splash.SplashViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OnBoardFragment_MembersInjector implements MembersInjector<OnBoardFragment> {
  private final Provider<SplashViewModel> viewModelProvider;

  public OnBoardFragment_MembersInjector(Provider<SplashViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<OnBoardFragment> create(
      Provider<SplashViewModel> viewModelProvider) {
    return new OnBoardFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(OnBoardFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.onBoard.OnBoardFragment.viewModel")
  public static void injectViewModel(OnBoardFragment instance, SplashViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
