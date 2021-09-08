package te.app.evidence.pages.services.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.services.models.ServiceData;

public class ItemServicesViewModel extends BaseViewModel {
    public ServiceData serviceData;

    public ItemServicesViewModel(ServiceData serviceData) {
        this.serviceData = serviceData;
    }

    @Bindable
    public ServiceData getServiceData() {
        return serviceData;
    }

    public void action(String action) {
        getLiveData().setValue(action);
    }
}
