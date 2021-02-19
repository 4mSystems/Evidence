package te.app.evidence.pages.users;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentUsersBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.users.models.SystemUserData;
import te.app.evidence.pages.users.models.SystemUserResponse;
import te.app.evidence.pages.users.viewModels.UsersViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class UsersFragment extends BaseFragment {
    FragmentUsersBinding binding;
    private Context context;
    @Inject
    UsersViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_users, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        viewModel.systemUsers();
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.USERS.equals(((Mutable) o).message)) {
                viewModel.getUsersAdapter().update(((SystemUserResponse) mutable.object).getSystemUserDataList());
                viewModel.notifyChange(BR.usersAdapter);
            } else if (Constants.ADD_USER.equals(((Mutable) o).message)) {
                viewModel.getUsersAdapter().lastSelected = -1;
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), getString(R.string.add_new_user), AddUserFragment.class.getName(), null);
            } else if (Constants.DELETE_USER.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getUsersAdapter().getSystemUserDataList().remove(viewModel.getUsersAdapter().lastSelected);
                viewModel.getUsersAdapter().notifyItemRangeChanged(viewModel.getUsersAdapter().lastSelected, viewModel.getUsersAdapter().getItemCount());
                deleteDialog.dismiss();
            }
        });
        viewModel.getUsersAdapter().actionLiveData.observe((LifecycleOwner) context, o -> showDeleteDialog());
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> viewModel.deleteUser());
        deleteDialog.show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    if (viewModel.getUsersAdapter().lastSelected == -1) {
                        viewModel.getUsersAdapter().getSystemUserDataList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), SystemUserData.class));
                        viewModel.getUsersAdapter().notifyItemInserted(viewModel.getUsersAdapter().getSystemUserDataList().size() - 1);
                        binding.rcUsers.scrollToPosition(viewModel.getUsersAdapter().getSystemUserDataList().size() - 1);
                    } else {
                        viewModel.getUsersAdapter().getSystemUserDataList().set(viewModel.getUsersAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), SystemUserData.class));
                        viewModel.getUsersAdapter().notifyItemChanged(viewModel.getUsersAdapter().lastSelected);
                        binding.rcUsers.scrollToPosition(viewModel.getUsersAdapter().lastSelected);
                    }
                }
            }
        }
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
