package te.app.evidence.pages.clients.notes.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.clients.notes.models.AddNoteRequest;
import te.app.evidence.pages.clients.notes.models.Notes;
import te.app.evidence.repository.NotesRepository;
import te.app.evidence.utils.Constants;

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
        if (getAddNoteRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            if (getPassingObject().getObjectClass() == null) {
                if (getPassingObject().getObject() != null && getPassingObject().getObject().equals(Constants.SESSION_NOTES)) {
                    getAddNoteRequest().setSessionId(String.valueOf(getPassingObject().getId()));
                    compositeDisposable.add(notesRepository.addNewSessionNote(getAddNoteRequest()));
                } else {
                    getAddNoteRequest().setClient_id(String.valueOf(getPassingObject().getId()));
                    compositeDisposable.add(notesRepository.addNewNote(getAddNoteRequest()));
                }
            } else {
                getAddNoteRequest().setNote_id(String.valueOf(getNotes().getId()));
                if (getNotes().getWhoNotes().equals(Constants.SESSION_NOTES)) {
                    compositeDisposable.add(notesRepository.editSessionNote(getAddNoteRequest()));
                } else
                    compositeDisposable.add(notesRepository.editNote(getAddNoteRequest()));
            }
        }
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
