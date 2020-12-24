package grand.app.akar.pages.auth.confirmCode;

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

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentConfirmCodeBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.changePassword.ChangePasswordFragment;
import grand.app.akar.pages.auth.models.UsersResponse;
import grand.app.akar.pages.auth.payment.PaymentFragment;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;

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
            if (((Mutable) o).message.equals(Constants.CONFIRM_CODE)) {
                if (viewModel.getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_REGISTER) {
                    if (((UsersResponse) ((Mutable) o).object).getData().getPaymentStatus() == 0 && ((UsersResponse) ((Mutable) o).object).getData().getType() != 0) {
                        UserHelper.getInstance(context).addJwt(((UsersResponse) ((Mutable) o).object).getData().getJwt());
                        MovementHelper.startActivity(context, PaymentFragment.class.getName(), null, null);
                    } else {
                        UserHelper.getInstance(context).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                        MovementHelper.startActivityMain(context);
                    }
                } else {
                    UserHelper.getInstance(context).addJwt(((UsersResponse) ((Mutable) o).object).getData().getJwt());
                    MovementHelper.startActivity(context, ChangePasswordFragment.class.getName(), null, null);
                }
                viewModel.goBack(context);
            } else if (((Mutable) o).message.equals(Constants.FORGET_PASSWORD)) {
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
