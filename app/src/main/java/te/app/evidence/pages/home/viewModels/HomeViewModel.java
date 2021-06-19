package te.app.evidence.pages.home.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.home.adapters.HomeReportersAdapter;
import te.app.evidence.pages.home.adapters.SessionsAdapter;
import te.app.evidence.pages.home.models.HomeData;
import te.app.evidence.repository.HomeRepository;
import te.app.evidence.utils.Constants;

public class HomeViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private int selectedBtn = 0;
    @Inject
    HomeRepository homeRepository;
    HomeData homeData;
    SessionsAdapter sessionsAdapter;
    HomeReportersAdapter homeReportersAdapter;

    @Inject
    public HomeViewModel(HomeRepository homeRepository) {
        homeData = new HomeData();
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
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
        getSessionsAdapter().update(homeData.getComingSession());
        notifyChange(BR.sessionsAdapter);
        notifyChange(BR.homeData);
        this.homeData = homeData;
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
        liveData.setValue(new Mutable(action));
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
