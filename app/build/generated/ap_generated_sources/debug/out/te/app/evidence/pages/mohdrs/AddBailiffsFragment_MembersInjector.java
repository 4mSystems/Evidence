package te.app.evidence.pages.mohdrs;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.mohdrs.viewModels.AddBailiffsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddBailiffsFragment_MembersInjector implements MembersInjector<AddBailiffsFragment> {
  private final Provider<AddBailiffsViewModel> viewModelProvider;

  public AddBailiffsFragment_MembersInjector(Provider<AddBailiffsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddBailiffsFragment> create(
      Provider<AddBailiffsViewModel> viewModelProvider) {
    return new AddBailiffsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddBailiffsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.mohdrs.AddBailiffsFragment.viewModel")
  public static void injectViewModel(AddBailiffsFragment instance, AddBailiffsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
