package te.app.evidence.pages.points.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.points.adapters.ReplacedPointsAdapter;
import te.app.evidence.repository.SettingsRepository;

public class PointsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    ReplacedPointsAdapter replacedPointsAdapter;

    @Inject
    public PointsViewModel(SettingsRepository repository) {

        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void replacePoints() {
        compositeDisposable.add(repository.getReplacedPoints());
    }

    @Bindable
    public ReplacedPointsAdapter getReplacedPointsAdapter() {
        return this.replacedPointsAdapter == null ? this.replacedPointsAdapter = new ReplacedPointsAdapter() : this.replacedPointsAdapter;
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
