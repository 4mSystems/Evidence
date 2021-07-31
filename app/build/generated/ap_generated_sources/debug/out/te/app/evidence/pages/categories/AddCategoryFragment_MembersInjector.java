package te.app.evidence.pages.categories;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddCategoryFragment_MembersInjector implements MembersInjector<AddCategoryFragment> {
  private final Provider<AddCategoriesViewModel> viewModelProvider;

  public AddCategoryFragment_MembersInjector(Provider<AddCategoriesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddCategoryFragment> create(
      Provider<AddCategoriesViewModel> viewModelProvider) {
    return new AddCategoryFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddCategoryFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.categories.AddCategoryFragment.viewModel")
  public static void injectViewModel(AddCategoryFragment instance,
      AddCategoriesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
