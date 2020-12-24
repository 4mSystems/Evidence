package grand.app.akar.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.maps.model.LatLng;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.base.MyApplication;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.settings.models.AboutData;
import grand.app.akar.pages.settings.models.settings.SettingsData;
import grand.app.akar.repository.SettingsRepository;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.AppHelper;
import io.reactivex.disposables.CompositeDisposable;

public class SettingsViewModel extends BaseViewModel {
    private SettingsData settingsData;
    private AboutData aboutData;
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        aboutData = new AboutData();
        settingsData = new SettingsData();
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

    public void getContact() {
        compositeDisposable.add(repository.getContact());
    }

    public void toMap() {
        AppHelper.startAndroidGoogleMap(MyApplication.getInstance(), null, new LatLng(Double.parseDouble(settingsData.getLat()), Double.parseDouble(settingsData.getLng())));
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

    @Bindable
    public SettingsData getSettingsData() {
        return settingsData;
    }

    @Bindable
    public void setSettingsData(SettingsData settingsData) {
        notifyChange(BR.settingsData);
        this.settingsData = settingsData;
    }
}
