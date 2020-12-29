package grand.app.akar.pages.adDetails.viewModels;

import android.widget.CompoundButton;

import androidx.databinding.Bindable;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.splash.models.ReasonsItem;

public class ItemReasonsViewModel extends BaseViewModel {
    public ReasonsItem reasonsItem;

    public ItemReasonsViewModel(ReasonsItem reasonsItem) {
        this.reasonsItem = reasonsItem;
    }

    @Bindable
    public ReasonsItem getReasonsItem() {
        return reasonsItem;
    }

    public void onCheckChange(CompoundButton compat, Boolean isChecked) {
        reasonsItem.setChecked(!reasonsItem.isChecked());
    }
}
