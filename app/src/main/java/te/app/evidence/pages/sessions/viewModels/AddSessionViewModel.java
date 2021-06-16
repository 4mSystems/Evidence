package te.app.evidence.pages.sessions.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.sessions.models.AddSessionRequest;
import te.app.evidence.pages.sessions.models.SessionItem;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class AddSessionViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    AddSessionRequest addSessionRequest;
    SessionItem sessionItem;

    @Inject
    public AddSessionViewModel(CasesRepository casesRepository) {
        addSessionRequest = new AddSessionRequest();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
        sessionItem = new SessionItem();
    }

    public void addNewSession() {
        if (getAddSessionRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            if (getPassingObject().getObjectClass() == null)
                compositeDisposable.add(casesRepository.addNewSession(getAddSessionRequest()));
            else
                compositeDisposable.add(casesRepository.editNewSession(getAddSessionRequest()));
        }
    }

    public AddSessionRequest getAddSessionRequest() {
        return addSessionRequest;
    }

    @Bindable
    public void setSessionItem(SessionItem sessionItem) {
        if (sessionItem != null) {
            getAddSessionRequest().setSessionId(String.valueOf(sessionItem.getId()));
            getAddSessionRequest().setSessionDate(sessionItem.getSessionDate());
        } else
            getAddSessionRequest().setCaseId(String.valueOf(getPassingObject().getId()));
        notifyChange();
        this.sessionItem = sessionItem;
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
