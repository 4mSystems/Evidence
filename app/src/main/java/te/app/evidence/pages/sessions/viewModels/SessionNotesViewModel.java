package te.app.evidence.pages.sessions.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.sessions.adapters.SessionNotesAdapter;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class SessionNotesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    SessionNotesAdapter notesAdapter;

    @Inject
    public SessionNotesViewModel(CasesRepository casesRepository) {
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void sessionNotes() {
        compositeDisposable.add(casesRepository.getSessionNotes(getPassingObject().getId()));
    }

    public void changeStatus() {
        compositeDisposable.add(casesRepository.changeNoteSessionStatus(getNotesAdapter().getNotesList().get(getNotesAdapter().lastSelected).getId()));
    }

    public void deleteSessionNote() {
        compositeDisposable.add(casesRepository.deleteSessionNote(getNotesAdapter().getNotesList().get(getNotesAdapter().lastSelected).getId()));
    }

    @Bindable
    public SessionNotesAdapter getNotesAdapter() {
        return this.notesAdapter == null ? this.notesAdapter = new SessionNotesAdapter() : this.notesAdapter;
    }

    public void toAddNote() {
        liveData.setValue(new Mutable(Constants.ADD_NOTE));
    }

    public CasesRepository getCasesRepository() {
        return casesRepository;
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
