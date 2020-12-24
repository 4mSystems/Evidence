package grand.app.akar.pages.onBoard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.smarteist.autoimageslider.SliderAnimations;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentOnboardBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.login.LoginFragment;
import grand.app.akar.pages.onBoard.models.BoardResponse;
import grand.app.akar.pages.splash.SplashViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;


public class OnBoardFragment extends BaseFragment {
    FragmentOnboardBinding fragmentOnboardBinding;
    @Inject
    SplashViewModel viewModel;
    private Context context;

    public OnBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentOnboardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboard, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentOnboardBinding.setOnBoardViewModels(viewModel);
        fragmentOnboardBinding.imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        viewModel.getSlider();
        liveDataListeners();
        // fill list screen
        fragmentOnboardBinding.imageSlider.setCurrentPageListener(currentPosition -> {
            if (currentPosition == viewModel.getOnBoardAdapter().pagerList.size() - 1) {
                fragmentOnboardBinding.startApp.setVisibility(View.VISIBLE);
                fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.GONE);
            } else {
                fragmentOnboardBinding.startApp.setVisibility(View.GONE);
                fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.VISIBLE);
            }
        });
        return fragmentOnboardBinding.getRoot();
    }


    private void liveDataListeners() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.NEXT:
                    fragmentOnboardBinding.imageSlider.setCurrentPagePosition(fragmentOnboardBinding.imageSlider.getCurrentPagePosition() + 1);
                    if (fragmentOnboardBinding.imageSlider.getCurrentPagePosition() == viewModel.getOnBoardAdapter().pagerList.size() - 1) {
                        fragmentOnboardBinding.startApp.setVisibility(View.VISIBLE);
                        fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.GONE);
                    } else
                        fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.VISIBLE);
                    break;
                case Constants.START_APP:
                    MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
                    UserHelper.getInstance(context).addIsFirst(true);
                    break;
                case Constants.BOARD:
                    viewModel.getOnBoardAdapter().updateData(((BoardResponse) ((Mutable) o).object).getOnBoardList());
                    viewModel.setupSlider(fragmentOnboardBinding.imageSlider);
                    if (viewModel.getOnBoardAdapter().pagerList.size() == 1) {
                        fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.GONE);
                        fragmentOnboardBinding.startApp.setVisibility(View.VISIBLE);
                    }
                    break;
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}