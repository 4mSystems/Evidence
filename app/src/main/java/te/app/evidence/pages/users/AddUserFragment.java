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

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentAddUserBinding;
import te.app.evidence.databinding.FragmentUsersBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.pages.users.viewModels.AddUserViewModel;
import te.app.evidence.pages.users.viewModels.UsersViewModel;


public class AddUserFragment extends BaseFragment {

    private Context context;
    @Inject
    AddUserViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAddUserBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_user, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        viewModel.setServices();
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
//            if (Constants.STORES.equals(((Mutable) o).message)) {
//                MovementHelper.startActivity(context, MarketsFragment.class.getName(), getResources().getString(R.string.market_page), null);
//            } else if (Constants.ORDER_ANY_THING.equals(((Mutable) o).message)) {
//                MovementHelper.startActivity(context, PublicOrdersFragment.class.getName(), getResources().getString(R.string.public_order_bar_name), Constants.SHARE_BAR);
//            } else if (Constants.NOTIFICATIONS.equals(((Mutable) o).message)) {
//                MovementHelper.startActivity(context, NotificationsFragment.class.getName(), getResources().getString(R.string.menuNotifications), null);
//            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}