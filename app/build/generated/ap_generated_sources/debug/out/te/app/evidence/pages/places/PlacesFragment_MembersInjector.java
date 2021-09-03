package te.app.evidence.pages.places;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.places.viewModels.PlacesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlacesFragment_MembersInjector implements MembersInjector<PlacesFragment> {
  private final Provider<PlacesViewModel> viewModelProvider;

  public PlacesFragment_MembersInjector(Provider<PlacesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<PlacesFragment> create(
      Provider<PlacesViewModel> viewModelProvider) {
    return new PlacesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(PlacesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.places.PlacesFragment.viewModel")
  public static void injectViewModel(PlacesFragment instance, PlacesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
