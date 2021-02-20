package te.app.evidence.pages.mohdrs.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.mohdrs.adapters.BailiffsAdapter;
import te.app.evidence.repository.CasesRepository;

public class BailiffsViewModel extends BaseViewModel {
    BailiffsAdapter bailiffsAdapter;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;

    @Inject
    public BailiffsViewModel(CasesRepository casesRepository) {
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
    }

    public void getMohdareen() {
        compositeDisposable.add(casesRepository.getMohdareen());
    }

    public void changeStatus() {
        compositeDisposable.add(casesRepository.ChangeStatus(getBailiffsAdapter().getBailiffsDataList().get(getBailiffsAdapter().lastSelected).getMohId()));
    }

    public void deleteMohdr() {
        compositeDisposable.add(casesRepository.deleteMohdr(getBailiffsAdapter().getBailiffsDataList().get(getBailiffsAdapter().lastSelected).getMohId()));
    }

    @Bindable
    public BailiffsAdapter getBailiffsAdapter() {
        return this.bailiffsAdapter == null ? this.bailiffsAdapter = new BailiffsAdapter() : this.bailiffsAdapter;
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
