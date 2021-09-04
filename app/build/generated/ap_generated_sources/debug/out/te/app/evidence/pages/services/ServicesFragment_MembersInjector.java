package te.app.evidence.pages.services;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.services.viewModels.ServicesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServicesFragment_MembersInjector implements MembersInjector<ServicesFragment> {
  private final Provider<ServicesViewModel> viewModelProvider;

  public ServicesFragment_MembersInjector(Provider<ServicesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ServicesFragment> create(
      Provider<ServicesViewModel> viewModelProvider) {
    return new ServicesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ServicesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.services.ServicesFragment.viewModel")
  public static void injectViewModel(ServicesFragment instance, ServicesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
