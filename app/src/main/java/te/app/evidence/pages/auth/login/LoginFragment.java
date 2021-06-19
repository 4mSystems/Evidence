package te.app.evidence.pages.auth.login;

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

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentLoginBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.evidence.pages.auth.models.UsersResponse;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;
import te.app.evidence.utils.session.UserHelper;

public class LoginFragment extends BaseFragment {
    private Context context;
    @Inject
    LoginViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
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
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.LOGIN:
                    toastMessage(((UsersResponse) mutable.object).mMessage);
                    UserHelper.getInstance(context).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                    MovementHelper.startActivityMain(context);
                    break;
                case Constants.FORGET_PASSWORD:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.FORGET_PASSWORD), null, ForgetPasswordFragment.class.getName(), null);
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
