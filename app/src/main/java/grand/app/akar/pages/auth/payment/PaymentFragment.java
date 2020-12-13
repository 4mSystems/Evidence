package grand.app.akar.pages.auth.payment;

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

import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentLoginBinding;
import grand.app.akar.databinding.FragmentPaymentBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.akar.pages.auth.forgetPassword.ForgetPasswordFragment;
import grand.app.akar.pages.auth.login.LoginViewModel;
import grand.app.akar.pages.auth.models.UsersResponse;
import grand.app.akar.pages.auth.register.RegisterFragment;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;

public class PaymentFragment extends BaseFragment {
    private Context context;
    @Inject
    PaymentViewModel viewModel;
    private FragmentPaymentBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_payment, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.REGISTER:
                    MovementHelper.startActivity(context, RegisterFragment.class.getName(), null, null);
                    break;
                case Constants.LOGIN:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    UserHelper.getInstance(context).userLogin(((UsersResponse) ((Mutable) o).object).getData());
//                    MovementHelper.startActivityBase(context, HomeMainFragment.class.getName(), null, null);
                    break;
                case Constants.FORGET_PASSWORD:
                    MovementHelper.startActivity(context, ForgetPasswordFragment.class.getName(), null, null);
                    break;
                case Constants.ERROR_NOT_FOUND:
                    if (viewModel.getLoginStatus() == View.VISIBLE)
                        MovementHelper.startActivity(context, RegisterFragment.class.getName(), null, null);
                    else
                        showError(String.valueOf(mutable.object));
                    break;
                case Constants.NOT_VERIFIED:
                    MovementHelper.startActivity(context, ConfirmCodeFragment.class.getName(), null, null);
                    break;
            }
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
