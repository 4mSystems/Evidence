package te.app.evidence.pages.reports.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.reports.adapters.ReportsAdapter;
import te.app.evidence.pages.reports.models.ReportsMain;
import te.app.evidence.pages.reports.models.SearchReportRequest;
import te.app.evidence.repository.ReportsRepository;

public class ReportsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ReportsRepository reportsRepository;
    ReportsAdapter reportsAdapter;
    ReportsMain reportsMain;
    SearchReportRequest searchReportRequest;

    @Inject
    public ReportsViewModel(ReportsRepository reportsRepository) {
        reportsMain = new ReportsMain();
        this.reportsRepository = reportsRepository;
        this.liveData = new MutableLiveData<>();
        reportsRepository.setLiveData(liveData);

    }

    public void getReports(int page, boolean showProgress) {
        compositeDisposable.add(reportsRepository.searchReports(page, showProgress, getSearchReportRequest()));
    }

    public void getCasesClientsCategories() {
        if (userData.getUserData().getType().equals("admin"))
            compositeDisposable.add(reportsRepository.getCategories());
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public ReportsMain getReportsMain() {
        return reportsMain;
    }

    @Bindable
    public void setReportsMain(ReportsMain reportsMain) {
        if (getReportsAdapter().getReportsDataList().size() > 0) {
            getReportsAdapter().loadMore(reportsMain.getReportsDataList());
        } else {
            getReportsAdapter().update(reportsMain.getReportsDataList());
            notifyChange(BR.reportsAdapter);
        }
        searchProgressVisible.set(false);
        this.reportsMain = reportsMain;
    }

    @Bindable
    public ReportsAdapter getReportsAdapter() {
        return this.reportsAdapter == null ? this.reportsAdapter = new ReportsAdapter() : this.reportsAdapter;
    }

    @Bindable
    public SearchReportRequest getSearchReportRequest() {
        return this.searchReportRequest == null ? this.searchReportRequest = new SearchReportRequest() : this.searchReportRequest;
    }

    public ReportsRepository getReportsRepository() {
        return reportsRepository;
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
