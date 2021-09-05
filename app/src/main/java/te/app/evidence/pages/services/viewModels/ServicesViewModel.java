package te.app.evidence.pages.services.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.evidence.BR;
import te.app.evidence.base.BaseViewModel;
import te.app.evidence.connection.FileObject;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.services.adapters.ServicesAdapter;
import te.app.evidence.pages.services.models.AddServiceRequest;
import te.app.evidence.pages.services.models.ServiceMainData;
import te.app.evidence.repository.SettingsRepository;
import te.app.evidence.utils.Constants;

public class ServicesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    ServicesAdapter servicesAdapter;
    AddServiceRequest addServiceRequest;
    public ArrayList<FileObject> fileObjects;
    ServiceMainData serviceMainData;

    @Inject
    public ServicesViewModel(SettingsRepository repository) {
        fileObjects = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }


    public void getServices(int page, boolean showProgress) {
        compositeDisposable.add(repository.getServices(page, showProgress));
    }

    //    public void getClients(int govId) {
//        compositeDisposable.add(repository.getClients(govId));
//    }
//
//    public void getGovs() {
//        compositeDisposable.add(repository.getGovs());
//    }
//
    public void addNewService() {
        if (getAddServiceRequest().isValid()) {
         setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.addServices(getAddServiceRequest(), getFileObjects()));
        }
    }

    public void actions(String action) {
        liveData.setValue(new Mutable(action));
    }

    public ArrayList<FileObject> getFileObjects() {
        return fileObjects;
    }

    @Bindable
    public ServiceMainData getServiceMainData() {
        return this.serviceMainData == null ? this.serviceMainData = new ServiceMainData() : this.serviceMainData;
    }

    public void setServiceMainData(ServiceMainData serviceMainData) {
        if (getServicesAdapter().getServiceDataList().size() > 0) {
            getServicesAdapter().loadMore(serviceMainData.getServiceDataList());
        } else {
            getServicesAdapter().update(serviceMainData.getServiceDataList());
            notifyChange(BR.servicesAdapter);
        }
        searchProgressVisible.set(false);
        notifyChange(BR.serviceMainData);
        this.serviceMainData = serviceMainData;
    }

    @Bindable
    public ServicesAdapter getServicesAdapter() {
        return this.servicesAdapter == null ? this.servicesAdapter = new ServicesAdapter() : this.servicesAdapter;
    }

    @Bindable
    public AddServiceRequest getAddServiceRequest() {
        return this.addServiceRequest == null ? this.addServiceRequest = new AddServiceRequest() : this.addServiceRequest;
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
