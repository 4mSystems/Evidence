package grand.app.akar.pages.adDetails.viewModels;


import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;

public class ItemServicesViewModel extends BaseViewModel {
    public String string;

    public ItemServicesViewModel(String string) {
        this.string = string;
    }

    @Bindable
    public String getString() {
        return string;
    }

}
