package te.app.evidence.pages.users;

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

import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentUserPermissionBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.models.userPermissions.UserPermissionsResponse;
import te.app.evidence.pages.users.viewModels.UserPermissionsViewModel;
import te.app.evidence.utils.Constants;


public class UserPermissionsFragment extends BaseFragment {

    private Context context;
    @Inject
    UserPermissionsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentUserPermissionBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_permission, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.userPermissions();
        }
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.USER_PERMISSIONS.equals(((Mutable) o).message)) {
                viewModel.setUserPermissionsData(((UserPermissionsResponse) mutable.object).getPermissionsData());
            }
//            else if (Constants.ORDER_ANY_THING.equals(((Mutable) o).message)) {
//                MovementHelper.startActivity(context, PublicOrdersFragment.class.getName(), getResources().getString(R.string.public_order_bar_name), Constants.SHARE_BAR);
//            } else if (Constants.NOTIFICATIONS.equals(((Mutable) o).message)) {
//                MovementHelper.startActivity(context, NotificationsFragment.class.getName(), getResources().getString(R.string.menuNotifications), null);
//            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getUsersRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
