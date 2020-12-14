package grand.app.akar.pages.ads.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.settings.models.AboutData;
import grand.app.akar.repository.SettingsRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class AddVillaHouseViewModel extends BaseViewModel {

    private AboutData aboutData;
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;

    @Inject
    public AddVillaHouseViewModel(SettingsRepository repository) {
        aboutData = new AboutData();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getAbout() {
        compositeDisposable.add(repository.getAbout());
    }

    public void getTerms() {
        compositeDisposable.add(repository.getTerms());
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

    @Bindable
    public AboutData getAboutData() {
        return aboutData;
    }


    @Bindable
    public void setAboutData(AboutData aboutData) {
        notifyChange(BR.aboutData);
        this.aboutData = aboutData;
    }
}
