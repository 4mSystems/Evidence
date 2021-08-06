package te.app.evidence.pages.users;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import java.util.Objects;
import javax.inject.Inject;
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
    @Inject
    UsersViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_users, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        viewModel.systemUsers(1, true);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.USERS.equals(((Mutable) o).message)) {
                viewModel.setUsersMainData(((SystemUserResponse) mutable.object).getUsersMainData());
            } else if (Constants.ADD_USER.equals(((Mutable) o).message)) {
                viewModel.getUsersAdapter().lastSelected = -1;
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), getString(R.string.add_new_user), AddUserFragment.class.getName(), null);
            } else if (Constants.DELETE_USER.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getUsersAdapter().getSystemUserDataList().remove(viewModel.getUsersAdapter().lastSelected);
                viewModel.getUsersAdapter().notifyDataSetChanged();
                deleteDialog.dismiss();
            }
        });
        viewModel.getUsersAdapter().actionLiveData.observe(requireActivity(), o -> showDeleteDialog());
        binding.rcUsers.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getUsersMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getUsersAdapter().getSystemUserDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.systemUsers((viewModel.getUsersMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
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
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (result != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = result.getBundleExtra(Constants.BUNDLE);
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

}
