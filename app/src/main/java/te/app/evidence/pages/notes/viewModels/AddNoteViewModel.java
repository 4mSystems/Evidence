package te.app.evidence.pages.notes.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.notes.models.AddNoteRequest;
import te.app.evidence.pages.notes.models.Notes;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.repository.NotesRepository;

public class AddNoteViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    AddNoteRequest addNoteRequest;
    @Inject
    NotesRepository notesRepository;
    Notes notes;

    @Inject
    public AddNoteViewModel(NotesRepository notesRepository) {
        notes = new Notes();
        this.notesRepository = notesRepository;
        this.liveData = new MutableLiveData<>();
        notesRepository.setLiveData(liveData);
        addNoteRequest = new AddNoteRequest();


    }

    public void addNewNote() {
        getAddNoteRequest().setClient_id(getPassingObject().getId() == 0 ? getNotes().getId() : getPassingObject().getId());
        if (getAddNoteRequest().isValid())
            if (getPassingObject().getObjectClass() == null)
                compositeDisposable.add(notesRepository.addNewNote(getAddNoteRequest()));
            else
                compositeDisposable.add(notesRepository.editNote(getAddNoteRequest()));
    }


    public AddNoteRequest getAddNoteRequest() {
        return addNoteRequest;
    }

    public NotesRepository getNotesRepository() {
        return notesRepository;
    }


    @Bindable
    public Notes getNotes() {
        return notes;
    }

    @Bindable
    public void setNotes(Notes notes) {
        if (notes != null) {
            getAddNoteRequest().setNotes(notes.getNotes());
        }
        notifyChange(BR.clients);
        this.notes = notes;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

}
