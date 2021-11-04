package te.app.evidence.pages.publicFiles.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.publicFiles.adapters.PublicFilesAdapter;
import te.app.evidence.pages.publicFiles.models.PublicFilesMain;
import te.app.evidence.pages.services.models.ServiceMainData;
import te.app.evidence.repository.SettingsRepository;

public class PublicFilesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    PublicFilesAdapter filesAdapter;
    PublicFilesMain publicFilesMain;

    @Inject
    public PublicFilesViewModel(SettingsRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }


    public void getPublicFiles(int page, boolean showProgress) {
        compositeDisposable.add(repository.getPublicFiles(page, showProgress, searchRequest.getSearch() == null ? "" : searchRequest.getSearch()));
    }

    @Bindable
    public PublicFilesMain getPublicFilesMain() {
        return this.publicFilesMain == null ? this.publicFilesMain = new PublicFilesMain() : this.publicFilesMain;
    }

    public void setPublicFilesMain(PublicFilesMain publicFilesMain) {
        if (getFilesAdapter().getPublicFilesDataList().size() > 0) {
            getFilesAdapter().loadMore(publicFilesMain.getPublicFilesData());
        } else {
            getFilesAdapter().update(publicFilesMain.getPublicFilesData());
            notifyChange(BR.filesAdapter);
        }
        searchProgressVisible.set(false);
        notifyChange(BR.publicFilesMain);
        this.publicFilesMain = publicFilesMain;
    }


    @Bindable
    public PublicFilesAdapter getFilesAdapter() {
        return this.filesAdapter == null ? this.filesAdapter = new PublicFilesAdapter() : this.filesAdapter;
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

    public SettingsRepository getRepository() {
        return repository;
    }

}
