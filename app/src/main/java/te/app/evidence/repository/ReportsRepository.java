package te.app.evidence.repository;


import androidx.lifecycle.MutableLiveData;


import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.evidence.connection.ConnectionHelper;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.reports.models.ReportsResponse;
import te.app.evidence.pages.reports.models.SearchReportRequest;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class ReportsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ReportsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable searchReports(int page, boolean showProgress, SearchReportRequest searchReportRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, searchReportRequest.getYear() == null ? URLS.DAILY_REPORTS + page : URLS.MONTHLY_REPORTS + page, searchReportRequest, ReportsResponse.class,
                Constants.REPORT, showProgress);
    }

//    public Disposable pdfReport(SearchReportRequest searchReportRequest) {
//        return connectionHelper.requestApi(Constants.POST_REQUEST, searchReportRequest.getYear() ==
//                        null ? URLS.DAILY_REPORTS_PDF + searchReportRequest.getSession_date() + "/" + searchReportRequest.getCategory_id()
//                        : URLS.MONTHLY_REPORTS_PDF + searchReportRequest.getMonth() + "/" + searchReportRequest.getYear() + "/" + searchReportRequest.getCategory_id()
//                , new Object(), ReportsResponse.class,
//                Constants.DOWNLOAD, true);
//    }

}