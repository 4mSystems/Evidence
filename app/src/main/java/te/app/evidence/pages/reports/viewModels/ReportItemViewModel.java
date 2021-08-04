package te.app.evidence.pages.reports.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.reports.models.ReportsData;

public class ReportItemViewModel extends BaseViewModel {
    public ReportsData reportsData;

    public ReportItemViewModel(ReportsData reportsData) {
        this.reportsData = reportsData;
    }

    @Bindable
    public ReportsData getReportsData() {
        return reportsData;
    }


}
