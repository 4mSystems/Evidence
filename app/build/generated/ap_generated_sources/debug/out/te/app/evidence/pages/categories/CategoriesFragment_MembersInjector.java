package te.app.evidence.pages.categories;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.categories.viewModels.CategoriesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
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
    return new CategoriesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(CategoriesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.categories.CategoriesFragment.viewModel")
  public static void injectViewModel(CategoriesFragment instance, CategoriesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
