package te.app.evidence.pages.home;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentHomeBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.home.models.HomeResponse;
import te.app.evidence.pages.home.viewModels.HomeViewModel;
import te.app.evidence.utils.Constants;


public class HomeFragment extends BaseFragment {

    private Context context;
    @Inject
    HomeViewModel viewModel;
    FragmentHomeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.homeResponse();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.HOME.equals(((Mutable) o).message)) {
                viewModel.setHomeData(((HomeResponse) mutable.object).getHomeData());
            } else if (Constants.LOOPER.equals(((Mutable) o).message)) {
                binding.progressBarHome.setVisibility(View.VISIBLE);
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    binding.progressBarHome.setVisibility(View.GONE);
                    if (viewModel.getSelectedBtn() == 0)
                        viewModel.getSessionsAdapter().update(viewModel.getHomeData().getComingSession());
                    else if (viewModel.getSelectedBtn() == 1)
                        viewModel.getSessionsAdapter().update(viewModel.getHomeData().getPreviousSession());
                    else if (viewModel.getSelectedBtn() == 2)
                        viewModel.getHomeReportersAdapter().update(viewModel.getHomeData().getMohder());
                    viewModel.notifyChange(BR.sessionsAdapter);
                    viewModel.notifyChange(BR.homeReportersAdapter);
                }, 1000);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
        if (Constants.DATA_CHANGED) {
            Constants.DATA_CHANGED = false;
            viewModel.homeResponse();
        }
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
