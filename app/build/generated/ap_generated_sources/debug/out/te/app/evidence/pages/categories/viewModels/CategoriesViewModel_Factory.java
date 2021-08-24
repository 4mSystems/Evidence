package te.app.evidence.pages.categories.viewModels;

import dagger.internal.Factory;
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
public final class CategoriesViewModel_Factory implements Factory<CategoriesViewModel> {
  private final Provider<CategoriesRepository> categoriesRepositoryProvider;

  private final Provider<CategoriesRepository> categoriesRepositoryProvider2;

  public CategoriesViewModel_Factory(Provider<CategoriesRepository> categoriesRepositoryProvider,
      Provider<CategoriesRepository> categoriesRepositoryProvider2) {
    this.categoriesRepositoryProvider = categoriesRepositoryProvider;
    this.categoriesRepositoryProvider2 = categoriesRepositoryProvider2;
  }

  @Override
  public CategoriesViewModel get() {
    CategoriesViewModel instance = newInstance(categoriesRepositoryProvider.get());
    CategoriesViewModel_MembersInjector.injectCategoriesRepository(instance, categoriesRepositoryProvider2.get());
    return instance;
  }

  public static CategoriesViewModel_Factory create(
      Provider<CategoriesRepository> categoriesRepositoryProvider,
      Provider<CategoriesRepository> categoriesRepositoryProvider2) {
    return new CategoriesViewModel_Factory(categoriesRepositoryProvider, categoriesRepositoryProvider2);
  }

  public static CategoriesViewModel newInstance(CategoriesRepository categoriesRepository) {
    return new CategoriesViewModel(categoriesRepository);
  }
}
