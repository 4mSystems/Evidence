// Generated by Dagger (https://dagger.dev).
package grand.app.akar.pages.ads.forms;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.akar.pages.ads.viewModels.AddVillaHouseViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdUploadingSuccessFragment_MembersInjector implements MembersInjector<AdUploadingSuccessFragment> {
  private final Provider<AddVillaHouseViewModel> viewModelProvider;

  public AdUploadingSuccessFragment_MembersInjector(
      Provider<AddVillaHouseViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AdUploadingSuccessFragment> create(
      Provider<AddVillaHouseViewModel> viewModelProvider) {
    return new AdUploadingSuccessFragment_MembersInjector(viewModelProvider);}

  @Override
  public void injectMembers(AdUploadingSuccessFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.akar.pages.ads.forms.AdUploadingSuccessFragment.viewModel")
  public static void injectViewModel(AdUploadingSuccessFragment instance,
      AddVillaHouseViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
