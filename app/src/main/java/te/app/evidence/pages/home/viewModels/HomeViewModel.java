package te.app.evidence.pages.home.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

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
    SessionsAdapter comingSessionsAdapter, prevSessionsAdapter;
    HomeReportersAdapter homeReportersAdapter;
    SessionMainData commingSessionMainData, preSessionMainData;
    ReportersMainData reportersMainData;
    public ObservableBoolean warningDate = new ObservableBoolean();
    public ObservableField<String> packageRemainDays = new ObservableField<>();

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

    public void prevSessionsPaginate(int page) {
        compositeDisposable.add(homeRepository.getPrevSessions(page));
    }

    public void comingSessionsPaginate(int page) {
        compositeDisposable.add(homeRepository.getComingSessions(page));
    }

    public void reportersPaginate(int page) {
        compositeDisposable.add(homeRepository.getReporters(page));
    }

    @Bindable
    public HomeData getHomeData() {
        return homeData;
    }

    @Bindable
    public void setHomeData(HomeData homeData) {
        setCommingSessionMainData(homeData.getComingSession());
        setPreSessionMainData(homeData.getPreviousSession());
        setReportersMainData(homeData.getReportersMainData());
        notifyChange(BR.homeData);
        this.homeData = homeData;
        calcExpireDate();
    }

    private void calcExpireDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", new Locale("en"));
        if (getHomeData().getUserPackage().getWarningDate().equals(format.format(new Date()))) {
            warningDate.set(true);
            Date packageDate = null;
            try {
                packageDate = format.parse(getHomeData().getUserPackage().getExpiryDate());
                long diffInMillies = Math.abs(packageDate.getTime() - new Date().getTime());
                long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                packageRemainDays.set(String.valueOf(diff));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public SessionMainData getCommingSessionMainData() {
        return commingSessionMainData;
    }

    public void setCommingSessionMainData(SessionMainData commingSessionMainData) {
        if (commingSessionMainData.getCurrentPage() > 1) {
            getComingSessionsAdapter().loadMore(commingSessionMainData.getSessionItem());
        } else {
            getComingSessionsAdapter().update(commingSessionMainData.getSessionItem());
            notifyChange(BR.sessionsAdapter);
        }
        searchProgressVisible.set(false);
        this.commingSessionMainData = commingSessionMainData;
    }

    public SessionMainData getPreSessionMainData() {
        return preSessionMainData;
    }

    public void setPreSessionMainData(SessionMainData preSessionMainData) {
        if (preSessionMainData.getCurrentPage() > 1) {
            getPrevSessionsAdapter().loadMore(preSessionMainData.getSessionItem());
        } else {
            getPrevSessionsAdapter().update(preSessionMainData.getSessionItem());
            notifyChange(BR.sessionsAdapter);
        }
        searchProgressVisible.set(false);
        this.preSessionMainData = preSessionMainData;
    }

    public ReportersMainData getReportersMainData() {
        return reportersMainData;
    }

    public void setReportersMainData(ReportersMainData reportersMainData) {
        if (reportersMainData.getCurrentPage() > 1) {
            getHomeReportersAdapter().loadMore(reportersMainData.getBailiffsDataList());
        } else {
            getHomeReportersAdapter().update(reportersMainData.getBailiffsDataList());
            notifyChange(BR.sessionsAdapter);
        }
        searchProgressVisible.set(false);
        this.reportersMainData = reportersMainData;
    }

    @Bindable
    public SessionsAdapter getComingSessionsAdapter() {
        return this.comingSessionsAdapter == null ? this.comingSessionsAdapter = new SessionsAdapter() : this.comingSessionsAdapter;
    }

    @Bindable
    public SessionsAdapter getPrevSessionsAdapter() {
        return this.prevSessionsAdapter == null ? this.prevSessionsAdapter = new SessionsAdapter() : this.prevSessionsAdapter;
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
