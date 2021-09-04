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
public final class AddServiceFragment_MembersInjector implements MembersInjector<AddServiceFragment> {
  private final Provider<ServicesViewModel> viewModelProvider;

  public AddServiceFragment_MembersInjector(Provider<ServicesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddServiceFragment> create(
      Provider<ServicesViewModel> viewModelProvider) {
    return new AddServiceFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddServiceFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.services.AddServiceFragment.viewModel")
  public static void injectViewModel(AddServiceFragment instance, ServicesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
