package te.app.evidence.pages.sessions;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
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
import te.app.evidence.activity.BaseActivity;
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
    private Context context;
    @Inject
    SessionsViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sessions, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.sessions();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CASE_SESSIONS.equals(((Mutable) o).message)) {
                viewModel.getSessionsAdapter().update(((CaseSessionsResponse) mutable.object).getSessionItem());
                viewModel.notifyChange(BR.casesAdapter);
            } else if (Constants.CHANGE_STATUS.equals(((Mutable) o).message)) {
                toastMessage(((ChangeStatusResponse) mutable.object).mMessage);
                viewModel.getSessionsAdapter().getSessionItemList().get(viewModel.getSessionsAdapter().lastSelected).setStatus(((ChangeStatusResponse) mutable.object).getStatus());
                viewModel.getSessionsAdapter().notifyItemChanged(viewModel.getSessionsAdapter().lastSelected);
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                //TODO Response empty
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getSessionsAdapter().getSessionItemList().remove(viewModel.getSessionsAdapter().lastSelected);
                viewModel.getSessionsAdapter().notifyItemRangeChanged(viewModel.getSessionsAdapter().lastSelected, viewModel.getSessionsAdapter().getItemCount());
                deleteDialog.dismiss();

            } else if (Constants.NEW_SESSION.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getPassingObject().getId()),
                        getString(R.string.add_new_session),
                        AddSessionFragment.class.getName(), null);
            }
        });
        ((BaseActivity) context).getRefreshingLiveData().observe(((LifecycleOwner) context), aBoolean -> {
            viewModel.sessions();
            ((BaseActivity) context).stopRefresh(false);
        });
        viewModel.getSessionsAdapter().actionLiveData.observe((LifecycleOwner) context, o -> {
            if (o.equals(Constants.CHANGE_STATUS))
                viewModel.changeStatus();
            else if (o.equals(Constants.DELETE))
                showDeleteDialog();

        });
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
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
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
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
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
