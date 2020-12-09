package grand.app.akar.pages.onBoard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.smarteist.autoimageslider.CircularSliderHandle;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentOnboardBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.onBoard.models.BoardResponse;
import grand.app.akar.pages.splash.SplashViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;


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
        viewModel.getSlider();
        liveDataListeners();
        // fill list screen
        fragmentOnboardBinding.imageSlider.setCurrentPageListener(new CircularSliderHandle.CurrentPageListener() {
            @Override
            public void onCurrentPageChanged(int currentPosition) {
                if (currentPosition == viewModel.getOnBoardAdapter().pagerList.size() - 1) {
                    fragmentOnboardBinding.appCompatButtonNext.setText(getResources().getString(R.string.startApp));
                } else {
                    fragmentOnboardBinding.appCompatButtonNext.setText(getResources().getString(R.string.next));
                }
            }
        });
        return fragmentOnboardBinding.getRoot();
    }


    private void liveDataListeners() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
//            if (((Mutable) o).message.equals(Constants.NEXT)) {
//                if (fragmentOnboardBinding.appCompatButtonNext.getText().toString().equals(getResources().getString(R.string.next)))
//                    fragmentOnboardBinding.imageSlider.setCurrentPagePosition(fragmentOnboardBinding.imageSlider.getCurrentPagePosition() + 1);
//                else {
//                    UserHelper.getInstance(context).addIsFirst(true);
//                    MovementHelper.startActivityBase(context, CountriesFragment.class.getName(), null,null);
//                }
//            } else if (((Mutable) o).message.equals(Constants.BOARD)) {
//                viewModel.getOnBoardAdapter().updateData(((BoardResponse) ((Mutable) o).object).getOnBoardList());
//                viewModel.setupSlider(fragmentOnboardBinding.imageSlider);
//                if (viewModel.getOnBoardAdapter().pagerList.size() == 1)
//                    fragmentOnboardBinding.appCompatButtonNext.setText(getResources().getString(R.string.startApp));
//            }
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