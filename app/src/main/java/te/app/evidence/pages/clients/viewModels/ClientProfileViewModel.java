package te.app.evidence.pages.clients.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.cases.CasesMainData;
import te.app.evidence.pages.clients.adapters.ClientCasesAdapter;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.models.clientProfile.ClientProfileData;
import te.app.evidence.pages.clients.notes.NotesAdapter;
import te.app.evidence.pages.clients.notes.models.NotesMainData;
import te.app.evidence.repository.ClientsRepository;
import te.app.evidence.utils.Constants;

public class ClientProfileViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private int selectedBtn = 0;
    Clients clients;
    @Inject
    ClientsRepository clientsRepository;
    NotesAdapter notesAdapter;
    ClientCasesAdapter clientCasesAdapter;
    ClientProfileData clientProfileData;
    NotesMainData notesMainData;
    CasesMainData casesMainData;

    @Inject
    public ClientProfileViewModel(ClientsRepository clientsRepository) {
        clientProfileData = new ClientProfileData();
        this.clientsRepository = clientsRepository;
        this.liveData = new MutableLiveData<>();
        clientsRepository.setLiveData(liveData);
        clients = new Clients();
        notesMainData = new NotesMainData();
        casesMainData = new CasesMainData();
    }

    public void clientProfile() {
        compositeDisposable.add(clientsRepository.getClientProfile(getClients().getClientId()));
    }

    public void getClientNotes(int page) {
        compositeDisposable.add(clientsRepository.getClientNotes(getClients().getClientId(), page));
    }

    public void getClientCases(int page) {
        compositeDisposable.add(clientsRepository.getClientCases(getClients().getClientId(), page));
    }

    public void deleteNote() {
        compositeDisposable.add(clientsRepository.deleteNote(getNotesAdapter().getNotesList().get(getNotesAdapter().lastSelected).getId()));
    }


    public void notes() {
        setSelectedBtn(0);
    }

    public void cases() {
        setSelectedBtn(1);
    }

    public void toNewNote() {
        liveData.setValue(new Mutable(Constants.ADD_NOTE));
    }


    @Bindable
    public NotesAdapter getNotesAdapter() {
        return this.notesAdapter == null ? this.notesAdapter = new NotesAdapter() : this.notesAdapter;
    }

    @Bindable
    public ClientCasesAdapter getClientCasesAdapter() {
        return this.clientCasesAdapter == null ? this.clientCasesAdapter = new ClientCasesAdapter() : this.clientCasesAdapter;
    }

    @Bindable
    public int getSelectedBtn() {
        return selectedBtn;
    }

    @Bindable
    public void setSelectedBtn(int selectedBtn) {
        notifyChange(BR.selectedBtn);
        this.selectedBtn = selectedBtn;
        liveData.setValue(new Mutable(Constants.LOOPER));
    }

    @Bindable
    public ClientProfileData getClientProfileData() {
        return clientProfileData;
    }

    @Bindable
    public void setClientProfileData(ClientProfileData clientProfileData) {
        setNotesMainData(clientProfileData.getNotesMainData());
        notifyChange(BR.clientProfileData);
        this.clientProfileData = clientProfileData;
    }

    public NotesMainData getNotesMainData() {
        return notesMainData;
    }

    public void setNotesMainData(NotesMainData notesMainData) {
        if (getNotesAdapter().getNotesList().size() > 0) {
            getNotesAdapter().loadMore(notesMainData.getClientNotes());
        } else {
            getNotesAdapter().update(notesMainData.getClientNotes());
            notifyChange(BR.notesAdapter);
        }
        searchProgressVisible.set(false);
        this.notesMainData = notesMainData;
    }

    public CasesMainData getCasesMainData() {
        return casesMainData;
    }

    public void setCasesMainData(CasesMainData casesMainData) {
        if (getClientCasesAdapter().getCasesList().size() > 0) {
            getClientCasesAdapter().loadMore(casesMainData.getCases());
        } else {
            getClientCasesAdapter().update(casesMainData.getCases());
            notifyChange(BR.clientCasesAdapter);
        }
        searchProgressVisible.set(false);
        this.casesMainData = casesMainData;
    }

    @Bindable
    public Clients getClients() {
        return clients;
    }

    @Bindable
    public void setClients(Clients clients) {
        notifyChange(BR.clients);
        this.clients = clients;
    }

    public ClientsRepository getClientsRepository() {
        return clientsRepository;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

}
