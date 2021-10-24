package te.app.evidence.pages.auth.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentLoginBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.pages.auth.register.RegisterFragment;
import te.app.evidence.pages.home.MainHomeFragment;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.URLS;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.session.UserHelper;

public class LoginFragment extends BaseFragment {
    @Inject
    LoginViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.LOGIN:
                    toastMessage(((UsersResponse) mutable.object).mMessage);
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                    MovementHelper.startActivityBase(requireActivity(), MainHomeFragment.class.getName(), getString(R.string.menuHome), null);
                    break;
                case Constants.FORGET_PASSWORD:
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.FORGET_PASSWORD), null, ForgetPasswordFragment.class.getName(), null);
                    break;
                case Constants.REGISTER:
                    MovementHelper.startActivity(requireActivity(), RegisterFragment.class.getName(), getString(R.string.register), null);
                    break;
                case Constants.NOT_VERIFIED:
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, viewModel.getLoginRequest().getEmail()), null, ConfirmCodeFragment.class.getName(), null);
                    break;
                case Constants.PRIVACY:
                    MovementHelper.openCustomTabs(requireActivity(), URLS.POLICY_URL, getString(R.string.privacy));
                    break;
                case Constants.TERMS:
                    MovementHelper.openCustomTabs(requireActivity(), URLS.TERMS_URL, getString(R.string.terms));
                    break;
                case Constants.SUPPORT:
                    MovementHelper.startWebActivityForResultWithBundle(requireActivity(), URLS.SUPPORT, getString(R.string.customer_support));
                    break;

            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

}
