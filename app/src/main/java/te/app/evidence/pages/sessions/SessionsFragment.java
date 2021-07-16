package te.app.evidence.pages.sessions;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
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

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentSessionsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.mohdrs.models.ChangeStatusResponse;
import te.app.evidence.pages.sessions.models.CaseSessionsResponse;
import te.app.evidence.pages.sessions.models.SessionItem;
import te.app.evidence.pages.sessions.viewModels.SessionsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;

public class SessionsFragment extends BaseFragment {
    FragmentSessionsBinding binding;
    @Inject
    SessionsViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sessions, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.sessions(1, true);
        }
        onBackPressed();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CASE_SESSIONS.equals(((Mutable) o).message)) {
                viewModel.setSessionMainData(((CaseSessionsResponse) mutable.object).getSessionMainData());
            } else if (Constants.CHANGE_STATUS.equals(((Mutable) o).message)) {
                toastMessage(((ChangeStatusResponse) mutable.object).mMessage);
                viewModel.getSessionsAdapter().getSessionItemList().get(viewModel.getSessionsAdapter().lastSelected).setStatus(((ChangeStatusResponse) mutable.object).getStatus());
                viewModel.getSessionsAdapter().notifyItemChanged(viewModel.getSessionsAdapter().lastSelected);
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getSessionsAdapter().getSessionItemList().remove(viewModel.getSessionsAdapter().lastSelected);
                viewModel.getSessionsAdapter().notifyItemRangeChanged(viewModel.getSessionsAdapter().lastSelected, viewModel.getSessionsAdapter().getItemCount());
                deleteDialog.dismiss();

            } else if (Constants.NEW_SESSION.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(viewModel.getPassingObject().getId()),
                        getString(R.string.add_new_session),
                        AddSessionFragment.class.getName(), null);
            }
        });

        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(v -> MovementHelper.finishWithResult(new PassingObject(viewModel.getSessionsAdapter().getSessionItemList().size()), requireActivity(), Constants.SESSION_CODE));
        viewModel.getSessionsAdapter().actionLiveData.observe(requireActivity(), o -> {
            if (o.equals(Constants.CHANGE_STATUS))
                viewModel.changeStatus();
            else if (o.equals(Constants.DELETE))
                showDeleteDialog();

        });
        binding.rcClients.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getSessionMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getSessionsAdapter().getSessionItemList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.sessions((viewModel.getSessionMainData().getCurrentPage() + 1), false);
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
        binding.optionDone.setOnClickListener(v -> viewModel.deleteSession());
        deleteDialog.show();
    }


    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    if (viewModel.getSessionsAdapter().lastSelected == -1) {
                        viewModel.getSessionsAdapter().getSessionItemList().add(0, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), SessionItem.class));
                        viewModel.getSessionsAdapter().notifyDataSetChanged();
                    } else {
                        viewModel.getSessionsAdapter().getSessionItemList().set(viewModel.getSessionsAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), SessionItem.class));
                        viewModel.getSessionsAdapter().notifyItemChanged(viewModel.getSessionsAdapter().lastSelected);
                        binding.rcClients.scrollToPosition(viewModel.getSessionsAdapter().lastSelected);
                    }
                }
            }
        }
    }

    private void onBackPressed() {
        binding.getRoot().setFocusableInTouchMode(true);
        binding.getRoot().requestFocus();
        binding.getRoot().setOnKeyListener((v, keyCode, event) -> {
            //This is the filter
            if (event.getAction() != KeyEvent.ACTION_DOWN) {
                MovementHelper.finishWithResult(new PassingObject(viewModel.getSessionsAdapter().getSessionItemList().size()), requireActivity(), Constants.SESSION_CODE);
                return true;
            }
            return false;
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
    }


}
