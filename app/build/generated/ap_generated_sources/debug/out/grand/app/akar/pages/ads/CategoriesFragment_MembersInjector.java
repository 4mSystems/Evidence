// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.ads;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.pages.ads.viewModels.CategoriesViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CategoriesFragment_MembersInjector implements MembersInjector<CategoriesFragment> {
  private final Provider<CategoriesViewModel> viewModelProvider;

  public CategoriesFragment_MembersInjector(Provider<CategoriesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<CategoriesFragment> create(
      Provider<CategoriesViewModel> viewModelProvider) {
    return new CategoriesFragment_MembersInjector(viewModelProvider);}

  @Override
  public void injectMembers(CategoriesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.ads.CategoriesFragment.viewModel")
  public static void injectViewModel(CategoriesFragment instance, CategoriesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
