package te.app.evidence.pages.splash;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.R;
import te.app.evidence.databinding.FragmentSplashBinding;
import te.app.evidence.pages.auth.login.LoginFragment;
import te.app.evidence.pages.onBoard.OnBoardFragment;
import te.app.evidence.pages.settings.models.settings.SettingsResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.session.UserHelper;

public class SplashFragment extends BaseFragment {
    private Context context;
    @Inject
    SplashViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSplashBinding fragmentSplashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentSplashBinding.setViewmodel(viewModel);
        setEvent();
        viewModel.getSettings();
        return fragmentSplashBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
//            if (((Mutable) o).message.equals(Constants.SETTINGS)) {
//                if (UserHelper.getInstance(MyApplication.getInstance()).getUserData() != null) {
//                    if (UserHelper.getInstance(MyApplication.getInstance()).getIsFirst()) {
//                        MovementHelper.startActivityMain(context);
//                    } else
//                        MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
//                } else {
//                    MovementHelper.startActivityBase(context, OnBoardFragment.class.getName(), null, null);
//                }
//                UserHelper.getInstance(context).userSettings(((SettingsResponse) mutable.object).getData());
//            } else if (mutable.message.equals(Constants.GET_USER_DOCUMENTS)) {
//                Log.e("setEvent", "setEvent: ");
//            }
            MovementHelper.startActivityMain(context);
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
