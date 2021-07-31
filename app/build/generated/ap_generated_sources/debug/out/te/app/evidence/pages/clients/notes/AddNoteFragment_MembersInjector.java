package te.app.evidence.pages.clients.notes;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.evidence.pages.clients.notes.viewModels.AddNoteViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddNoteFragment_MembersInjector implements MembersInjector<AddNoteFragment> {
  private final Provider<AddNoteViewModel> viewModelProvider;

  public AddNoteFragment_MembersInjector(Provider<AddNoteViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddNoteFragment> create(
      Provider<AddNoteViewModel> viewModelProvider) {
    return new AddNoteFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddNoteFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.evidence.pages.clients.notes.AddNoteFragment.viewModel")
  public static void injectViewModel(AddNoteFragment instance, AddNoteViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
