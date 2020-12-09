package grand.app.akar.pages.auth.changePassword;

import android.content.Context;
import android.os.Bundle;
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
import grand.app.akar.databinding.FragmentChangePasswordBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.auth.models.UserData;
import grand.app.akar.pages.auth.models.UsersResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;

public class ChangePasswordFragment extends BaseFragment {
    private Context context;
    @Inject
    ChangePasswordViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChangePasswordBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setUserData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), UserData.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.UPDATE_PROFILE)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                UserHelper.getInstance(context).userLogin(((UsersResponse) ((Mutable) o).object).getData());
//                MovementHelper.startActivityBase(context, HomeMainFragment.class.getName(), null,null);
            } else if (((Mutable) o).message.equals(Constants.NOT_MATCH_PASSWORD)) {
                showError(getResources().getString(R.string.password_not_match));
            }
        });
    }


    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
