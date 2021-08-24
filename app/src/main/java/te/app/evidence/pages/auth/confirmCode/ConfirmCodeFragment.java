package te.app.evidence.pages.auth.confirmCode;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentConfirmCodeBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.changePassword.ChangePasswordFragment;
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.session.LanguagesHelper;
import te.app.evidence.utils.session.UserHelper;

public class ConfirmCodeFragment extends BaseFragment {
    @Inject
    ConfirmViewModel viewModel;
    FragmentConfirmCodeBinding binding;
    CountDownTimer countDownTimer;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirm_code, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        startTimer();
        setEvent();
        return binding.getRoot();
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(180000, 1000) {
            public void onTick(long millisUntilFinished) {
                String time = "" + String.format(new Locale(LanguagesHelper.getCurrentLanguage()), "%d : %d ",
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)), TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished));
                binding.tvForgetTimer.setText(time);
            }

            public void onFinish() {
                binding.tvLoginForget.setEnabled(true);
            }
        }.start();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (mutable.message.equals(Constants.CONFIRM_CODE)) {
                if (viewModel.getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_REGISTER) {
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) mutable.object).getData());
                    MovementHelper.startActivityMain(requireActivity());
                } else {
                    UserHelper.getInstance(requireActivity()).addJwt(((UsersResponse) ((Mutable) o).object).getData().getUserData().getApiToken());
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getPassingObject().getId()), null, ChangePasswordFragment.class.getName(), null);
                }
                viewModel.goBack(requireActivity());
            } else if (mutable.message.equals(Constants.FORGET_PASSWORD)) {
                binding.tvLoginForget.setEnabled(false);
                startTimer();
            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
        countDownTimer.cancel();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

}
