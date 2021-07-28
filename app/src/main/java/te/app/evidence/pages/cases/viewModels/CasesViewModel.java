package te.app.evidence.pages.cases.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.adapters.AllCasesAdapter;
import te.app.evidence.pages.cases.adapters.InputTagClientsAdapter;
import te.app.evidence.pages.cases.models.caseDetails.CaseDetails;
import te.app.evidence.pages.cases.models.cases.CasesMainData;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class CasesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    AllCasesAdapter casesAdapter;
    CaseDetails caseDetails;
    private int selectedBtn = 0;
    InputTagClientsAdapter clientsAdapter;
    CasesMainData casesMainData,oldCasesMainData;

    @Inject
    public CasesViewModel(CasesRepository casesRepository) {
        caseDetails = new CaseDetails();
        casesMainData = new CasesMainData();
        oldCasesMainData = new CasesMainData();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void cases(int page, boolean showProgress) {
        compositeDisposable.add(casesRepository.allCases(page, showProgress));
    }

    public void caseDetailsResponse() {
        compositeDisposable.add(casesRepository.caseDetails(getPassingObject().getId()));
    }
    public void search(int page, boolean showProgress) {
        if (!TextUtils.isEmpty(searchRequest.getSearch()))
            compositeDisposable.add(casesRepository.search(page, showProgress, searchRequest));
    }

    public void clients() {
        setSelectedBtn(0);
    }

    public void khesm() {
        setSelectedBtn(1);
    }

    public void buttonActions(String action) {
        liveData.setValue(new Mutable(action));
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            getCasesAdapter().getCasesList().clear();
            setCasesMainData(oldCasesMainData);
        }
    }

    @Bindable
    public AllCasesAdapter getCasesAdapter() {
        return this.casesAdapter == null ? this.casesAdapter = new AllCasesAdapter() : this.casesAdapter;
    }

    @Bindable
    public InputTagClientsAdapter getClientsAdapter() {
        return this.clientsAdapter == null ? this.clientsAdapter = new InputTagClientsAdapter() : this.clientsAdapter;
    }

    @Bindable
    public CaseDetails getCaseDetails() {
        return caseDetails;
    }

    public CasesMainData getCasesMainData() {
        return casesMainData;
    }

    public void setCasesMainData(CasesMainData casesMainData) {
        if (!TextUtils.isEmpty(searchRequest.getSearch())) { // if search required
            if (casesMainData.getCurrentPage() > 1) {
                getCasesAdapter().loadMore(casesMainData.getCases());
            } else {
                getCasesAdapter().update(casesMainData.getCases());
                notifyChange(BR.clientsAdapter);
            }
        } else {
            if (getCasesAdapter().getCasesList().size() > 0) {
                getCasesAdapter().loadMore(casesMainData.getCases());
            } else {
                oldCasesMainData = casesMainData;
                getCasesAdapter().update(casesMainData.getCases());
                notifyChange(BR.casesAdapter);
            }
        }
        searchProgressVisible.set(false);
        this.casesMainData = casesMainData;
    }

    @Bindable
    public void setCaseDetails(CaseDetails caseDetails) {
        notifyChange(BR.caseDetails);
        this.caseDetails = caseDetails;
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
