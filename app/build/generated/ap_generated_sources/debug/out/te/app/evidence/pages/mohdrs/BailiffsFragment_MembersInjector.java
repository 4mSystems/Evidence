package te.app.evidence.pages.mohdrs;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.mohdrs.viewModels.BailiffsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BailiffsFragment_MembersInjector implements MembersInjector<BailiffsFragment> {
  private final Provider<BailiffsViewModel> viewModelProvider;

  public BailiffsFragment_MembersInjector(Provider<BailiffsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<BailiffsFragment> create(
      Provider<BailiffsViewModel> viewModelProvider) {
    return new BailiffsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(BailiffsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.mohdrs.BailiffsFragment.viewModel")
  public static void injectViewModel(BailiffsFragment instance, BailiffsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
