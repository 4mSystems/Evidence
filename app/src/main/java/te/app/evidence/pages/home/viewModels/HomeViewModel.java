package te.app.evidence.pages.home.viewModels;


import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.home.adapters.HomeReportersAdapter;
import te.app.evidence.pages.home.adapters.SessionsAdapter;
import te.app.evidence.pages.home.models.HomeData;
import te.app.evidence.pages.mohdrs.models.ReportersMainData;
import te.app.evidence.pages.sessions.models.SessionMainData;
import te.app.evidence.repository.HomeRepository;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.resources.ResourceManager;

public class HomeViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private int selectedBtn = 0;
    @Inject
    HomeRepository homeRepository;
    HomeData homeData;
    SessionsAdapter sessionsAdapter;
    HomeReportersAdapter homeReportersAdapter;
    SessionMainData commingSessionMainData, preSessionMainData;
    ReportersMainData reportersMainData;

    @Inject
    public HomeViewModel(HomeRepository homeRepository) {
        homeData = new HomeData();
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
        commingSessionMainData = new SessionMainData();
        preSessionMainData = new SessionMainData();
        reportersMainData = new ReportersMainData();
    }

    public void homeResponse() {
        compositeDisposable.add(homeRepository.getHome());
    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    @Bindable
    public void setHomeData(HomeData homeData) {
        setCommingSessionMainData(homeData.getComingSession());
        notifyChange(BR.homeData);
        this.homeData = homeData;
    }

    public SessionMainData getCommingSessionMainData() {
        return commingSessionMainData;
    }

    public void setCommingSessionMainData(SessionMainData commingSessionMainData) {
        if (getSessionsAdapter().getSessionItemList().size() > 0) {
            getSessionsAdapter().loadMore(commingSessionMainData.getSessionItem());
        } else {
            getSessionsAdapter().update(commingSessionMainData.getSessionItem());
            notifyChange(BR.sessionsAdapter);
        }
        this.commingSessionMainData = commingSessionMainData;
    }

    public SessionMainData getPreSessionMainData() {
        return preSessionMainData;
    }

    public void setPreSessionMainData(SessionMainData preSessionMainData) {
        if (getSessionsAdapter().getSessionItemList().size() > 0) {
            getSessionsAdapter().loadMore(preSessionMainData.getSessionItem());
        } else {
            getSessionsAdapter().update(preSessionMainData.getSessionItem());
            notifyChange(BR.sessionsAdapter);
        }
        this.preSessionMainData = preSessionMainData;
    }

    public ReportersMainData getReportersMainData() {
        return reportersMainData;
    }

    public void setReportersMainData(ReportersMainData reportersMainData) {
        if (getHomeReportersAdapter().getItemCount() > 0) {
            getHomeReportersAdapter().loadMore(reportersMainData.getBailiffsDataList());
        } else {
            getHomeReportersAdapter().update(reportersMainData.getBailiffsDataList());
            notifyChange(BR.sessionsAdapter);
        }
        this.reportersMainData = reportersMainData;
    }

    @Bindable
    public SessionsAdapter getSessionsAdapter() {
        return this.sessionsAdapter == null ? this.sessionsAdapter = new SessionsAdapter() : this.sessionsAdapter;
    }

    @Bindable
    public HomeReportersAdapter getHomeReportersAdapter() {
        return this.homeReportersAdapter == null ? this.homeReportersAdapter = new HomeReportersAdapter() : this.homeReportersAdapter;
    }

    public void nextSessions() {
        setSelectedBtn(0);
    }

    public void previousSessions() {
        setSelectedBtn(1);
    }

    public void nextMohdars() {
        setSelectedBtn(2);
    }

    public void buttonAction(String action) {
        if (!action.equals(Constants.ERROR_TOAST))
            liveData.setValue(new Mutable(action));
        else
            liveData.setValue(new Mutable(action, ResourceManager.getString(R.string.no_permission)));
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

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public HomeRepository getHomeRepository() {
        return homeRepository;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

}
