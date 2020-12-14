package grand.app.akar.pages.splash;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.R;
import grand.app.akar.databinding.FragmentSplashBinding;
import grand.app.akar.pages.ads.CategoriesFragment;
import grand.app.akar.pages.ads.forms.AddFactoryFormFragment;
import grand.app.akar.pages.ads.forms.AddOfficeFormFragment;
import grand.app.akar.pages.ads.forms.AddResetFormFragment;
import grand.app.akar.pages.auth.login.LoginFragment;
import grand.app.akar.pages.onBoard.OnBoardFragment;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;

public class SplashFragment extends BaseFragment {
    private Context context;
    private FragmentSplashBinding fragmentSplashBinding;
    @Inject
    SplashViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentSplashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentSplashBinding.setViewmodel(viewModel);
        setEvent();
        viewModel.runSplash();
        return fragmentSplashBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.HOME)) {
                MovementHelper.startActivityMain(context);
            }
//            else if (((Mutable) o).message.equals(Constants.BACKGROUND_API)) {
//                viewModel.getCountryCodes();
//            }
            else if (mutable.message.equals(Constants.BOARD)) {
                if (UserHelper.getInstance(MyApplication.getInstance()).getIsFirst()) {
                    MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
                } else {
                    MovementHelper.startActivityBase(context, OnBoardFragment.class.getName(), null, null);
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
//        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
