package te.app.evidence.pages.mohdrs.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.mohdrs.adapters.BailiffsAdapter;
import te.app.evidence.pages.mohdrs.models.ReportersMainData;
import te.app.evidence.repository.CasesRepository;
import te.app.evidence.utils.Constants;

public class BailiffsViewModel extends BaseViewModel {
    BailiffsAdapter bailiffsAdapter;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CasesRepository casesRepository;
    ReportersMainData mainData, oldMainData;

    @Inject
    public BailiffsViewModel(CasesRepository casesRepository) {
        this.casesRepository = casesRepository;
        this.liveData = new MutableLiveData<>();
        casesRepository.setLiveData(liveData);
        mainData = new ReportersMainData();
        oldMainData = new ReportersMainData();
    }

    public void getMohdareen(int page, boolean showProgress) {
        compositeDisposable.add(casesRepository.getMohdareen(page, showProgress));
    }

    public void search(int page, boolean showProgress) {
        if (!TextUtils.isEmpty(searchRequest.getSearch()))
            compositeDisposable.add(casesRepository.searchMohdr(page, showProgress, searchRequest));
    }

    public void changeStatus() {
        compositeDisposable.add(casesRepository.ChangeStatus(getBailiffsAdapter().getBailiffsDataList().get(getBailiffsAdapter().lastSelected).getMohId()));
    }

    public void deleteMohdr() {
        compositeDisposable.add(casesRepository.deleteMohdr(getBailiffsAdapter().getBailiffsDataList().get(getBailiffsAdapter().lastSelected).getMohId()));
    }

    public ReportersMainData getMainData() {
        return mainData;
    }

    public void setMainData(ReportersMainData mainData) {
        if (!TextUtils.isEmpty(searchRequest.getSearch())) { // if search required
            if (mainData.getCurrentPage() > 1) {
                getBailiffsAdapter().loadMore(mainData.getBailiffsDataList());
            } else {
                getBailiffsAdapter().update(mainData.getBailiffsDataList());
                notifyChange(BR.clientsAdapter);
            }
        } else {
            if (getBailiffsAdapter().getBailiffsDataList().size() > 0) {
                getBailiffsAdapter().loadMore(mainData.getBailiffsDataList());
            } else {
                oldMainData = mainData;
                getBailiffsAdapter().update(mainData.getBailiffsDataList());
                notifyChange(BR.bailiffsAdapter);
            }
        }
        searchProgressVisible.set(false);
        this.mainData = mainData;
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            getBailiffsAdapter().getBailiffsDataList().clear();
            setMainData(oldMainData);
        }
    }

    @Bindable
    public BailiffsAdapter getBailiffsAdapter() {
        return this.bailiffsAdapter == null ? this.bailiffsAdapter = new BailiffsAdapter() : this.bailiffsAdapter;
    }

    public void toAddMohdr() {
        liveData.setValue(new Mutable(Constants.ADD_MOHDR));

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
