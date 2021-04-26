package te.app.evidence.pages.cases.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.databinding.FragmentAddCaseBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.cases.adapters.InputTagClientsAdapter;
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
    InputTagClientsAdapter tagClientsAdapter;
    public ObservableField<Boolean> loader = new ObservableField<>();

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

    public void createCase() {
        if (getAddCaseRequest().isValid()) {
            loader.set(true);
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
    public InputTagClientsAdapter getTagClientsAdapter() {
        return this.tagClientsAdapter == null ? this.tagClientsAdapter = new InputTagClientsAdapter() : this.tagClientsAdapter;
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
