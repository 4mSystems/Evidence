package te.app.evidence.pages.cases.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.AddCaseRequest;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesData;
import te.app.evidence.pages.cases.models.caseDetails.CaseDetails;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class AddCaseViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    AddCaseRequest addCaseRequest;
    CaseClientsCategoriesData caseClientsCategoriesData;
    CaseDetails caseDetails;

    @Inject
    public AddCaseViewModel(CasesRepository casesRepository) {
        caseDetails = new CaseDetails();
        caseClientsCategoriesData = new CaseClientsCategoriesData();
        addCaseRequest = new AddCaseRequest();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void getCasesClientsCategories() {
        compositeDisposable.add(casesRepository.getCasesClientsCategories());
    }

    public void createCase() {
        List<Integer> clientList = new ArrayList<>();
        List<Integer> khesmList = new ArrayList<>();
        if (getAddCaseRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            for (int i = 0; i < getCaseClientsCategoriesData().getClients().size(); i++) {
                if (getCaseClientsCategoriesData().getClients().get(i).isChecked())
                    clientList.add(getCaseClientsCategoriesData().getClients().get(i).getClientId());
            }
            for (int i = 0; i < getCaseClientsCategoriesData().getKhesm().size(); i++) {
                if (getCaseClientsCategoriesData().getKhesm().get(i).isChecked())
                    khesmList.add(getCaseClientsCategoriesData().getKhesm().get(i).getClientId());
            }
            getAddCaseRequest().setMokel_Name(clientList);
            getAddCaseRequest().setKhesm_Name(khesmList);
            compositeDisposable.add(casesRepository.createCase(getAddCaseRequest()));
        }
    }

    public void editCase() {
        if (getAddCaseRequest().isUpdateValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(casesRepository.editCase(getAddCaseRequest()));
        }
    }

    public void toClients(String type) {
        if (type.equals(Constants.CLIENTS))
            liveData.setValue(new Mutable(Constants.CLIENTS));
        else
            liveData.setValue(new Mutable(Constants.KHESM));
    }

    public void toCategories() {
        liveData.setValue(new Mutable(Constants.CATEGORIES));
    }

    public void setCaseClientsCategoriesData(CaseClientsCategoriesData caseClientsCategoriesData) {
        this.caseClientsCategoriesData = caseClientsCategoriesData;
    }

    public CaseClientsCategoriesData getCaseClientsCategoriesData() {
        return caseClientsCategoriesData;
    }

    @Bindable
    public CaseDetails getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(CaseDetails caseDetails) {
        getAddCaseRequest().setCircle_num(caseDetails.getCaseData().getCircleNum());
        getAddCaseRequest().setInvetation_num(caseDetails.getCaseData().getInvetationNum());
        getAddCaseRequest().setCourt(caseDetails.getCaseData().getCourt());
        getAddCaseRequest().setCaseId(String.valueOf(caseDetails.getCaseData().getId()));
        getAddCaseRequest().setTo_whome(String.valueOf(caseDetails.getCaseData().getCategory().getId()));
        getAddCaseRequest().setInventation_type(caseDetails.getCaseData().getInventationType());
        notifyChange(BR.caseDetails);
        this.caseDetails = caseDetails;
    }

    public CasesRepository getCasesRepository() {
        return casesRepository;
    }

    public AddCaseRequest getAddCaseRequest() {
        return addCaseRequest;
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
