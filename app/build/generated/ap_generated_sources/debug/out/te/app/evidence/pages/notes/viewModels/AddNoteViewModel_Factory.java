// Generated by Dagger (https://dagger.dev).
package te.app.evidence.pages.notes.viewModels;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.evidence.repository.NotesRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddNoteViewModel_Factory implements Factory<AddNoteViewModel> {
  private final Provider<NotesRepository> notesRepositoryProvider;

  private final Provider<NotesRepository> notesRepositoryProvider2;

  public AddNoteViewModel_Factory(Provider<NotesRepository> notesRepositoryProvider,
      Provider<NotesRepository> notesRepositoryProvider2) {
    this.notesRepositoryProvider = notesRepositoryProvider;
    this.notesRepositoryProvider2 = notesRepositoryProvider2;
  }

  @Override
  public AddNoteViewModel get() {
    AddNoteViewModel instance = newInstance(notesRepositoryProvider.get());
    AddNoteViewModel_MembersInjector.injectNotesRepository(instance, notesRepositoryProvider2.get());
    return instance;
  }

  public static AddNoteViewModel_Factory create(Provider<NotesRepository> notesRepositoryProvider,
      Provider<NotesRepository> notesRepositoryProvider2) {
    return new AddNoteViewModel_Factory(notesRepositoryProvider, notesRepositoryProvider2);
  }

  public static AddNoteViewModel newInstance(NotesRepository notesRepository) {
    return new AddNoteViewModel(notesRepository);
  }
}
