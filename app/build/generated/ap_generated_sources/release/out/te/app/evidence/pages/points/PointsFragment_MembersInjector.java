package te.app.evidence.pages.points;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.points.viewModels.PointsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PointsFragment_MembersInjector implements MembersInjector<PointsFragment> {
  private final Provider<PointsViewModel> viewModelProvider;

  public PointsFragment_MembersInjector(Provider<PointsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<PointsFragment> create(
      Provider<PointsViewModel> viewModelProvider) {
    return new PointsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(PointsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.points.PointsFragment.viewModel")
  public static void injectViewModel(PointsFragment instance, PointsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
