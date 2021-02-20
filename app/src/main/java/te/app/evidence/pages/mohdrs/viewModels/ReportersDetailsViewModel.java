package te.app.evidence.pages.mohdrs.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.mohdrs.models.ReportersData;
import te.app.evidence.pages.mohdrs.models.details.ReportersDetailsData;
import te.app.evidence.repository.CasesRepository;

public class ReportersDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    ReportersDetailsData reportersData;

    @Inject
    public ReportersDetailsViewModel(CasesRepository casesRepository) {
        reportersData = new ReportersDetailsData();
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void getReportersDetails() {
        compositeDisposable.add(casesRepository.getReportersDetails(getPassingObject().getId()));
    }

    @Bindable
    public ReportersDetailsData getReportersData() {
        return reportersData;
    }

    @Bindable
    public void setReportersData(ReportersDetailsData reportersData) {
        notifyChange(BR.reportersData);
        this.reportersData = reportersData;
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
