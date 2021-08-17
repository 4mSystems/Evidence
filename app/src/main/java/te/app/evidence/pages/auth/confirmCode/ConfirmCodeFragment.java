package te.app.evidence.pages.auth.confirmCode;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

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
import te.app.evidence.utils.session.UserHelper;

public class ConfirmCodeFragment extends BaseFragment {
    private Context context;
    @Inject
    ConfirmViewModel viewModel;
    FragmentConfirmCodeBinding binding;
    private CountDownTimer countDownTimer;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirm_code, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
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
        countDownTimer = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                binding.tvForgetTimer.setText(millisUntilFinished / 1000 + " : 00");
            }

            public void onFinish() {
                binding.tvLoginForget.setEnabled(true);
            }
        }.start();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (mutable.message.equals(Constants.CONFIRM_CODE)) {
                if (viewModel.getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_REGISTER) {
                    UserHelper.getInstance(context).userLogin(((UsersResponse) mutable.object).getData());
                    MovementHelper.startActivityMain(context);
                } else {
                    UserHelper.getInstance(context).addJwt(((UsersResponse) ((Mutable) o).object).getData().getUserData().getApiToken());
                    MovementHelper.startActivityWithBundle(context, new PassingObject(viewModel.getPassingObject().getId()), null, ChangePasswordFragment.class.getName(), null);
                }
                viewModel.goBack(context);
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


    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
