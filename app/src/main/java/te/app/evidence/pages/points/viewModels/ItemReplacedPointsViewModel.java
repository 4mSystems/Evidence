package te.app.evidence.pages.points.viewModels;

import androidx.databinding.Bindable;

import te.app.evidence.base.BaseViewModel;
import te.app.evidence.pages.points.models.ReplacedPoints;

public class ItemReplacedPointsViewModel extends BaseViewModel {
    public ReplacedPoints replacedPoints;

    public ItemReplacedPointsViewModel(ReplacedPoints replacedPoints) {
        this.replacedPoints = replacedPoints;
    }

    @Bindable
    public ReplacedPoints getReplacedPoints() {
        return replacedPoints;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }

}
