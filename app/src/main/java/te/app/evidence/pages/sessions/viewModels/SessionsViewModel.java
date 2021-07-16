package te.app.evidence.pages.sessions.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.adapters.AllCasesAdapter;
import te.app.evidence.pages.home.adapters.SessionsAdapter;
import te.app.evidence.pages.sessions.models.SessionMainData;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class SessionsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    SessionsAdapter sessionsAdapter;
    SessionMainData sessionMainData;

    @Inject
    public SessionsViewModel(CasesRepository casesRepository) {
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
        sessionMainData = new SessionMainData();
    }

    public void sessions(int page, boolean showProgress) {
        compositeDisposable.add(casesRepository.getCaseSessions(getPassingObject().getId(),page,showProgress));
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

    public SessionMainData getSessionMainData() {
        return sessionMainData;
    }

    public void setSessionMainData(SessionMainData sessionMainData) {
        if (getSessionsAdapter().getSessionItemList().size() > 0) {
            getSessionsAdapter().loadMore(sessionMainData.getSessionItem());
        } else {
            getSessionsAdapter().update(sessionMainData.getSessionItem());
            notifyChange(BR.sessionsAdapter);
        }
        searchProgressVisible.set(false);
        this.sessionMainData = sessionMainData;
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
