package te.app.evidence.pages.points;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentPointsBinding;
import te.app.evidence.pages.points.viewModels.PointsViewModel;



public class PointsFragment extends BaseFragment {
    FragmentPointsBinding binding;
    @Inject
    PointsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_points, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
//            Mutable mutable = (Mutable) o;
//            handleActions(mutable);
//            if (mutable.message.equals(Constants.REPLACE_POINTS)) {
//                toastMessage(((StatusMessage) mutable.object).mMessage);
//                viewModel.goBack(context);
//                MovementHelper.startActivity(context, WalletFragment.class.getName(), getString(R.string.wallet_title), null);
//            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
