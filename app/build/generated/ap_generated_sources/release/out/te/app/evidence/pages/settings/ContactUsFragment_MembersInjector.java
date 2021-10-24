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
public final class ContactUsFragment_MembersInjector implements MembersInjector<ContactUsFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public ContactUsFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ContactUsFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new ContactUsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ContactUsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.settings.ContactUsFragment.viewModel")
  public static void injectViewModel(ContactUsFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}