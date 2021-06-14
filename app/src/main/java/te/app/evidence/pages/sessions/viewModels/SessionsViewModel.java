package te.app.evidence.pages.sessions.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.adapters.AllCasesAdapter;
import te.app.evidence.pages.home.adapters.SessionsAdapter;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class SessionsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    SessionsAdapter sessionsAdapter;

    @Inject
    public SessionsViewModel(CasesRepository casesRepository) {
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void sessions() {
        compositeDisposable.add(casesRepository.getCaseSessions(getPassingObject().getId()));
    }

    public void changeStatus() {
        compositeDisposable.add(casesRepository.ChangeSessionStatus(getSessionsAdapter().getSessionItemList().get(getSessionsAdapter().lastSelected).getId()));
    }

    public void deleteSession() {
        compositeDisposable.add(casesRepository.deleteSession(getSessionsAdapter().getSessionItemList().get(getSessionsAdapter().lastSelected).getId()));
    }

    @Bindable
    public SessionsAdapter getSessionsAdapter() {
        return this.sessionsAdapter == null ? this.sessionsAdapter = new SessionsAdapter() : this.sessionsAdapter;
    }

    public void toAddSession() {
        liveData.setValue(new Mutable(Constants.NEW_SESSION));
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
