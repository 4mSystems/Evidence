// Generated by Dagger (https://dagger.dev).
package te.app.evidence.pages.categories.viewModels;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddCategoriesViewModel_Factory implements Factory<AddCategoriesViewModel> {
  @Override
  public AddCategoriesViewModel get() {
    return newInstance();
  }

  public static AddCategoriesViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AddCategoriesViewModel newInstance() {
    return new AddCategoriesViewModel();
  }

  private static final class InstanceHolder {
    private static final AddCategoriesViewModel_Factory INSTANCE = new AddCategoriesViewModel_Factory();
  }
}
