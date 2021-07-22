package te.app.evidence.pages.sessions.viewModels;

import android.text.TextUtils;
import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
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
    SessionMainData sessionMainData, oldSessionMainData;

    @Inject
    public SessionsViewModel(CasesRepository casesRepository) {
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
        sessionMainData = new SessionMainData();
        oldSessionMainData = new SessionMainData();
    }

    public void sessions(int page, boolean showProgress) {
        compositeDisposable.add(casesRepository.getCaseSessions(getPassingObject().getId(), page, showProgress));
    }

    public void search(int page, boolean showProgress) {
        if (!TextUtils.isEmpty(searchRequest.getSessionDate())) {
            searchRequest.setCaseId(String.valueOf(getPassingObject().getId()));
            compositeDisposable.add(casesRepository.searchSessions(page, showProgress, searchRequest));
        }
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
        if (!TextUtils.isEmpty(searchRequest.getSessionDate())) {
            if (sessionMainData.getCurrentPage() > 1) {
                getSessionsAdapter().loadMore(sessionMainData.getSessionItem());
            } else {
                getSessionsAdapter().update(sessionMainData.getSessionItem());
                notifyChange(BR.sessionsAdapter);
            }
        } else {
            if (getSessionsAdapter().getSessionItemList().size() > 0) {
                getSessionsAdapter().loadMore(sessionMainData.getSessionItem());
            } else {
                oldSessionMainData = sessionMainData;
                getSessionsAdapter().update(sessionMainData.getSessionItem());
                notifyChange(BR.sessionsAdapter);
            }
        }
        searchProgressVisible.set(false);
        this.sessionMainData = sessionMainData;
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            getSessionsAdapter().getSessionItemList().clear();
            setSessionMainData(oldSessionMainData);
        }
    }

    public void clear() {
        searchRequest.setSessionDate(null);
        notifyChange();
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
