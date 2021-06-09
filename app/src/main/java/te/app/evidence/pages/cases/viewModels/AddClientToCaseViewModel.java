package te.app.evidence.pages.cases.viewModels;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.AddCaseRequest;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesData;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class AddClientToCaseViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    AddCaseRequest addCaseRequest;
    CaseClientsCategoriesData caseClientsCategoriesData;
    public ObservableField<Boolean> loader = new ObservableField<>();

    @Inject
    public AddClientToCaseViewModel(CasesRepository casesRepository) {
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
            loader.set(true);
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

    public void toClients(String type) {
        if (type.equals(Constants.CLIENTS))
            liveData.setValue(new Mutable(Constants.CLIENTS));
        else
            liveData.setValue(new Mutable(Constants.KHESM));
    }


    public void setCaseClientsCategoriesData(CaseClientsCategoriesData caseClientsCategoriesData) {
        this.caseClientsCategoriesData = caseClientsCategoriesData;
    }

    public CaseClientsCategoriesData getCaseClientsCategoriesData() {
        return caseClientsCategoriesData;
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
