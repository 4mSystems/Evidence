package te.app.evidence.pages.mohdrs.viewModels;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesData;
import te.app.evidence.pages.mohdrs.models.AddMohdrRequest;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class AddBailiffsViewModel extends BaseViewModel {
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    CaseClientsCategoriesData caseClientsCategoriesData;
    public MutableLiveData<Mutable> liveData;
    AddMohdrRequest addMohdrRequest;

    @Inject
    public AddBailiffsViewModel(CasesRepository casesRepository) {
        addMohdrRequest = new AddMohdrRequest();
        caseClientsCategoriesData = new CaseClientsCategoriesData();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }


    public void getCasesClientsCategories() {
        compositeDisposable.add(casesRepository.getCasesClientsCategories());
    }

    public void createMohdr() {
        List<String> clientList = new ArrayList<>();
        List<String> khesmList = new ArrayList<>();
        if (getAddMohdrRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            if (userData.getUserData().getType().equals("User"))
                getAddMohdrRequest().setCatid(userData.getUserData().getCatId());
            for (int i = 0; i < getCaseClientsCategoriesData().getClients().size(); i++) {
                if (getCaseClientsCategoriesData().getClients().get(i).isChecked())
                    clientList.add(getCaseClientsCategoriesData().getClients().get(i).getClientName());
            }
            for (int i = 0; i < getCaseClientsCategoriesData().getKhesm().size(); i++) {
                if (getCaseClientsCategoriesData().getKhesm().get(i).isChecked())
                    khesmList.add(getCaseClientsCategoriesData().getKhesm().get(i).getClientName());
            }
            getAddMohdrRequest().setMokelName(clientList.toString().replace("]", "").replace("[", "").replace(", ", ","));
            getAddMohdrRequest().setKhesmName(khesmList.toString().replace("]", "").replace("[", "").replace(", ", ","));
            compositeDisposable.add(casesRepository.createMohdr(getAddMohdrRequest()));
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

    public AddMohdrRequest getAddMohdrRequest() {
        return addMohdrRequest;
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
