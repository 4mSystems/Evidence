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
public final class CategoriesViewModel_MembersInjector implements MembersInjector<CategoriesViewModel> {
  private final Provider<CategoriesRepository> categoriesRepositoryProvider;

  public CategoriesViewModel_MembersInjector(
      Provider<CategoriesRepository> categoriesRepositoryProvider) {
    this.categoriesRepositoryProvider = categoriesRepositoryProvider;
  }

  public static MembersInjector<CategoriesViewModel> create(
      Provider<CategoriesRepository> categoriesRepositoryProvider) {
    return new CategoriesViewModel_MembersInjector(categoriesRepositoryProvider);
  }

  @Override
  public void injectMembers(CategoriesViewModel instance) {
    injectCategoriesRepository(instance, categoriesRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.categories.viewModels.CategoriesViewModel.categoriesRepository")
  public static void injectCategoriesRepository(CategoriesViewModel instance,
      CategoriesRepository categoriesRepository) {
    instance.categoriesRepository = categoriesRepository;
  }
}
