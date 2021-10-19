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
public final class ServiceDetailsFragment_MembersInjector implements MembersInjector<ServiceDetailsFragment> {
  private final Provider<ServicesViewModel> viewModelProvider;

  public ServiceDetailsFragment_MembersInjector(Provider<ServicesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ServiceDetailsFragment> create(
      Provider<ServicesViewModel> viewModelProvider) {
    return new ServiceDetailsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ServiceDetailsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.services.ServiceDetailsFragment.viewModel")
  public static void injectViewModel(ServiceDetailsFragment instance, ServicesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
