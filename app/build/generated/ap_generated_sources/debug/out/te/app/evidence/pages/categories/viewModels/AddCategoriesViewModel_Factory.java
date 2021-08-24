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
public final class AddCategoriesViewModel_Factory implements Factory<AddCategoriesViewModel> {
  private final Provider<CategoriesRepository> categoriesRepositoryProvider;

  private final Provider<CategoriesRepository> categoriesRepositoryProvider2;

  public AddCategoriesViewModel_Factory(Provider<CategoriesRepository> categoriesRepositoryProvider,
      Provider<CategoriesRepository> categoriesRepositoryProvider2) {
    this.categoriesRepositoryProvider = categoriesRepositoryProvider;
    this.categoriesRepositoryProvider2 = categoriesRepositoryProvider2;
  }

  @Override
  public AddCategoriesViewModel get() {
    AddCategoriesViewModel instance = newInstance(categoriesRepositoryProvider.get());
    AddCategoriesViewModel_MembersInjector.injectCategoriesRepository(instance, categoriesRepositoryProvider2.get());
    return instance;
  }

  public static AddCategoriesViewModel_Factory create(
      Provider<CategoriesRepository> categoriesRepositoryProvider,
      Provider<CategoriesRepository> categoriesRepositoryProvider2) {
    return new AddCategoriesViewModel_Factory(categoriesRepositoryProvider, categoriesRepositoryProvider2);
  }

  public static AddCategoriesViewModel newInstance(CategoriesRepository categoriesRepository) {
    return new AddCategoriesViewModel(categoriesRepository);
  }
}
