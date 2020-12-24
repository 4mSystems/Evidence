package grand.app.akar.pages.ads.viewModels;

import androidx.databinding.Bindable;

import grand.app.akar.BR;
import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.ads.models.OrderImages;
import grand.app.akar.utils.Constants;

public class ItemPublicOrderImagesViewModel extends BaseViewModel {
    public OrderImages orderImages;
    boolean selected = false;

    public ItemPublicOrderImagesViewModel(OrderImages orderImages) {
        this.orderImages = orderImages;
    }

    @Bindable
    public OrderImages getOrderImages() {
        return orderImages;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.NEW_IMAGE);
    }

    public void removeImage() {
        getLiveData().setValue(Constants.REMOVE_IMAGE);
    }

    @Bindable
    public boolean isSelected() {
        return selected;
    }

    @Bindable
    public void setSelected(boolean selected) {
        notifyChange(BR.selected);
        this.selected = selected;
    }
}
