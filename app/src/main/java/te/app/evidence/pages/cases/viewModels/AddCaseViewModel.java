package te.app.evidence.pages.cases.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.databinding.FragmentAddCaseBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.models.AddCaseRequest;
import te.app.evidence.pages.cases.models.CaseClientsCategoriesData;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class AddCaseViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    AddCaseRequest addCaseRequest;
    CaseClientsCategoriesData caseClientsCategoriesData;

    @Inject
    public AddCaseViewModel(CasesRepository casesRepository) {
        caseClientsCategoriesData = new CaseClientsCategoriesData();
        addCaseRequest = new AddCaseRequest();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void getCasesClientsCategories() {
        compositeDisposable.add(casesRepository.getCasesClientsCategories());
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
