package grand.app.akar.pages.myAds;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentPreviousAdsBinding;
import grand.app.akar.pages.myAds.viewModels.MyAdsViewModel;


public class PreviousAdsFragment extends BaseFragment {

    private Context context;
    @Inject
    MyAdsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentPreviousAdsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_previous_ads, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
//        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
//            Mutable mutable = (Mutable) o;
//            handleActions(mutable);
//            if (((Mutable) o).message.equals(Constants.STORE_ORDERS)) {
//                viewModel.getOrdersAdapter().update(((WaitingOrderResponse) (mutable).object).getData(), viewModel.getOrdersRequest().getDepartment_id());
//                viewModel.notifyChange(BR.storesAdapter);
//            } else if (((Mutable) o).message.equals(Constants.ORDER_FILTER)) {
//                showOrderFilter();
//            }
//        });
    }

    @Override
    public void onResume() {
        super.onResume();
//        if (viewModel.getOrdersAdapter().getItemCount() == 0) {
//            initLastLocation(3);
//        }
//        viewModel.getMarketRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


}
