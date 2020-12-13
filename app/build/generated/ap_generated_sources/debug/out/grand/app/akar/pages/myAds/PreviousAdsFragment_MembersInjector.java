// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.myAds;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.pages.myAds.viewModels.MyAdsViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PreviousAdsFragment_MembersInjector implements MembersInjector<PreviousAdsFragment> {
  private final Provider<MyAdsViewModel> viewModelProvider;

  public PreviousAdsFragment_MembersInjector(Provider<MyAdsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<PreviousAdsFragment> create(
      Provider<MyAdsViewModel> viewModelProvider) {
    return new PreviousAdsFragment_MembersInjector(viewModelProvider);}

  @Override
  public void injectMembers(PreviousAdsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.myAds.PreviousAdsFragment.viewModel")
  public static void injectViewModel(PreviousAdsFragment instance, MyAdsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
