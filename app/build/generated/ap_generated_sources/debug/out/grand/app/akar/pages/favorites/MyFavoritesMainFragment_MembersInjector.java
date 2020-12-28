// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.favorites;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.pages.favorites.viewModels.MyFavoritesViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyFavoritesMainFragment_MembersInjector implements MembersInjector<MyFavoritesMainFragment> {
  private final Provider<MyFavoritesViewModel> viewModelProvider;

  public MyFavoritesMainFragment_MembersInjector(Provider<MyFavoritesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MyFavoritesMainFragment> create(
      Provider<MyFavoritesViewModel> viewModelProvider) {
    return new MyFavoritesMainFragment_MembersInjector(viewModelProvider);}

  @Override
  public void injectMembers(MyFavoritesMainFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.favorites.MyFavoritesMainFragment.viewModel")
  public static void injectViewModel(MyFavoritesMainFragment instance,
      MyFavoritesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
