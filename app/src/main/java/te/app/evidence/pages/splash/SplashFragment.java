package te.app.evidence.pages.splash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;

import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.R;
import te.app.evidence.databinding.FragmentSplashBinding;
import te.app.evidence.pages.auth.login.LoginFragment;
import te.app.evidence.pages.home.MainHomeFragment;
import te.app.evidence.pages.onBoard.OnBoardFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.session.UserHelper;

public class SplashFragment extends BaseFragment {
    @Inject
    SplashViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSplashBinding fragmentSplashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentSplashBinding.setViewmodel(viewModel);
        setEvent();
        viewModel.runSplash();
        return fragmentSplashBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.DEFAULT_LANGUAGE)) {
                if (UserHelper.getInstance(MyApplication.getInstance()).getUserData() != null) {
                    MovementHelper.startActivityBase(requireActivity(), MainHomeFragment.class.getName(), getString(R.string.menuHome), null);
                } else {
                    if (UserHelper.getInstance(MyApplication.getInstance()).getIsFirst()) {
                        MovementHelper.startActivityBase(requireActivity(), OnBoardFragment.class.getName(), null, null);
                    } else
                        MovementHelper.startActivityBase(requireActivity(), LoginFragment.class.getName(), null, null);
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
