package grand.app.akar.pages.ads.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.settings.models.AboutData;
import grand.app.akar.pages.settings.models.ContactUsRequest;
import grand.app.akar.repository.SettingsRepository;
import grand.app.akar.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class AdsViewModel extends BaseViewModel {

    private AboutData aboutData;
    private ContactUsRequest contactUsRequest;
    public MutableLiveData<Mutable> liveData;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;

    @Inject
    public AdsViewModel(SettingsRepository repository) {
        aboutData = new AboutData();
        contactUsRequest = new ContactUsRequest();
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

    public void sendContact() {
        getContactUsRequest().setType(1);
        if (getContactUsRequest().isValid())
            compositeDisposable.add(repository.sendContact(getContactUsRequest()));
        else
            liveData.setValue(new Mutable(Constants.ERROR_TOAST));
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

    public ContactUsRequest getContactUsRequest() {
        return contactUsRequest;
    }

    @Bindable
    public void setAboutData(AboutData aboutData) {
        notifyChange(BR.aboutData);
        this.aboutData = aboutData;
    }
}
