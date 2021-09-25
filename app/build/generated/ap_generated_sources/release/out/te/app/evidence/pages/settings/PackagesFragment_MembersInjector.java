package te.app.evidence.pages.settings;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.settings.viewModels.SettingsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PackagesFragment_MembersInjector implements MembersInjector<PackagesFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public PackagesFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<PackagesFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new PackagesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(PackagesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.settings.PackagesFragment.viewModel")
  public static void injectViewModel(PackagesFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
