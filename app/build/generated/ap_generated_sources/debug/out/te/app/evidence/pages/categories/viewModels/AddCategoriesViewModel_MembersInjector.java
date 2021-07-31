package te.app.evidence.pages.categories.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.repository.CategoriesRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddCategoriesViewModel_MembersInjector implements MembersInjector<AddCategoriesViewModel> {
  private final Provider<CategoriesRepository> categoriesRepositoryProvider;

  public AddCategoriesViewModel_MembersInjector(
      Provider<CategoriesRepository> categoriesRepositoryProvider) {
    this.categoriesRepositoryProvider = categoriesRepositoryProvider;
  }

  public static MembersInjector<AddCategoriesViewModel> create(
      Provider<CategoriesRepository> categoriesRepositoryProvider) {
    return new AddCategoriesViewModel_MembersInjector(categoriesRepositoryProvider);
  }

  @Override
  public void injectMembers(AddCategoriesViewModel instance) {
    injectCategoriesRepository(instance, categoriesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.categories.viewModels.AddCategoriesViewModel.categoriesRepository")
  public static void injectCategoriesRepository(AddCategoriesViewModel instance,
      CategoriesRepository categoriesRepository) {
    instance.categoriesRepository = categoriesRepository;
  }
}
