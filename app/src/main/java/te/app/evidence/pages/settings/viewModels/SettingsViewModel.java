package te.app.evidence.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import androidx.lifecycle.MutableLiveData;


import javax.inject.Inject;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.settings.adapters.PackagesAdapter;
import te.app.evidence.pages.settings.models.AboutData;
import te.app.evidence.pages.settings.models.ContactUsRequest;
import te.app.evidence.repository.SettingsRepository;
import io.reactivex.disposables.CompositeDisposable;

public class SettingsViewModel extends BaseViewModel {
    AboutData aboutData;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    ContactUsRequest contactUsRequest;
    PackagesAdapter packagesAdapter;

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        aboutData = new AboutData();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        getContactUsRequest().setName(userData.getUserData().getName());
        getContactUsRequest().setPhone(userData.getUserData().getPhone());
        getContactUsRequest().setEmail(userData.getUserData().getEmail());
    }

    public void getPackages() {
        compositeDisposable.add(repository.getPackages());
    }

    public void subscribePackage(int packageId) {
        compositeDisposable.add(repository.subscribePackage(packageId));
    }

    public void sendContact() {
        if (getContactUsRequest().isValid())
            compositeDisposable.add(repository.sendContact(getContactUsRequest()));
    }

    @Bindable
    public ContactUsRequest getContactUsRequest() {
        return this.contactUsRequest == null ? this.contactUsRequest = new ContactUsRequest() : this.contactUsRequest;
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
    public PackagesAdapter getPackagesAdapter() {
        return this.packagesAdapter == null ? this.packagesAdapter = new PackagesAdapter() : this.packagesAdapter;
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
