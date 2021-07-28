package te.app.evidence.pages.cases;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import java.util.Objects;

import javax.inject.Inject;

import te.app.evidence.BR;
import te.app.evidence.PassingObject;
import te.app.evidence.R;
import te.app.evidence.base.BaseFragment;
import te.app.evidence.base.IApplicationComponent;
import te.app.evidence.base.MyApplication;
import te.app.evidence.databinding.FragmentCaseClientsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.cases.models.CaseClientsResponse;
import te.app.evidence.pages.cases.viewModels.CaseClientsViewModel;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class CaseClientsFragment extends BaseFragment {
    FragmentCaseClientsBinding binding;
    @Inject
    CaseClientsViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_case_clients, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.clients(1, true);
        }
        onBackPressed();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CLIENTS.equals(((Mutable) o).message)) {
                viewModel.getClientsAdapter().update(((CaseClientsResponse) mutable.object).getClientsList());
                viewModel.notifyChange(BR.clientsAdapter);
            } else if (Constants.DELETE_CLIENT.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getClientsAdapter().getClientsList().remove(viewModel.getClientsAdapter().lastSelected);
                viewModel.getClientsAdapter().notifyItemRangeChanged(viewModel.getClientsAdapter().lastSelected, viewModel.getClientsAdapter().getItemCount());
                deleteDialog.dismiss();
            } else if (Constants.ADD_CLIENTS.equals(mutable.message)) {
                viewModel.getClientsAdapter().lastSelected = -1;
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(viewModel.getPassingObject().getId(), viewModel.getPassingObject().getObject()), viewModel.getPassingObject().getObject().equals(Constants.client) ? getString(R.string.add_new_client) : getString(R.string.add_new_khesm), AddClientToCaseFragment.class.getName(), Constants.ADD_CLIENT_REQUEST);
            }
        });

        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(v -> MovementHelper.finishWithResult(new PassingObject(viewModel.getClientsAdapter().getClientsList().size()), requireActivity(), viewModel.getPassingObject().getObject().equals(Constants.client) ? Constants.CLIENTS_CODE : Constants.KHESM_CODE));
        viewModel.getClientsAdapter().actionLiveData.observe(requireActivity(), o -> showDeleteDialog());
    }

    private void showDeleteDialog() {
        if (viewModel.getClientsAdapter().getClientsList().size() > 1) {
            deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
            deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
            deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
            deleteDialog.setContentView(binding.getRoot());
            binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
            binding.optionDone.setOnClickListener(v -> viewModel.deleteClient());
            deleteDialog.show();
        } else
            toastErrorMessage(getString(R.string.client_warning));
    }

    private void onBackPressed() {
        binding.getRoot().setFocusableInTouchMode(true);
        binding.getRoot().requestFocus();
        binding.getRoot().setOnKeyListener((v, keyCode, event) -> {
            //This is the filter
            if (event.getAction() != KeyEvent.ACTION_DOWN) {
                MovementHelper.finishWithResult(new PassingObject(viewModel.getClientsAdapter().getClientsList().size()), requireActivity(), viewModel.getPassingObject().getObject().equals(Constants.client) ? Constants.CLIENTS_CODE : Constants.KHESM_CODE);
                return true;
            }
            return false;
        });

    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (data != null) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    if (viewModel.getClientsAdapter().lastSelected == -1) {
                        viewModel.getClientsAdapter().getClientsList().add(new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Clients.class));
                        viewModel.getClientsAdapter().notifyItemInserted(viewModel.getClientsAdapter().getClientsList().size() - 1);
                        binding.rcClients.scrollToPosition(viewModel.getClientsAdapter().getClientsList().size() - 1);
                    } else {
                        viewModel.getClientsAdapter().getClientsList().set(viewModel.getClientsAdapter().lastSelected, new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), Clients.class));
                        viewModel.getClientsAdapter().notifyItemChanged(viewModel.getClientsAdapter().lastSelected);
                        binding.rcClients.scrollToPosition(viewModel.getClientsAdapter().lastSelected);
                    }
                }
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCasesRepository().setLiveData(viewModel.liveData);
        if (Constants.DATA_CHANGED)
            viewModel.clients(1, true);

    }

}
