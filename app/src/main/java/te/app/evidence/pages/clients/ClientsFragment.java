package te.app.evidence.pages.clients;

import android.app.Dialog;
import android.content.Context;
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
import te.app.evidence.databinding.FragmentClientsBinding;
import te.app.evidence.databinding.OptionDialogBinding;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.pages.cases.AddClientToCaseFragment;
import te.app.evidence.pages.clients.models.Clients;
import te.app.evidence.pages.clients.models.ClientsResponse;
import te.app.evidence.pages.clients.viewModels.ClientsViewModel;
import te.app.evidence.utils.Constants;
import te.app.evidence.utils.helper.MovementHelper;

import static android.app.Activity.RESULT_OK;


public class ClientsFragment extends BaseFragment {
    FragmentClientsBinding binding;
    private Context context;
    @Inject
    ClientsViewModel viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_clients, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.clients();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CLIENTS.equals(((Mutable) o).message)) {
                viewModel.getClientsAdapter().update(((ClientsResponse) mutable.object).getClientsList());
                viewModel.notifyChange(BR.clientsAdapter);
            } else if (Constants.ADD_CLIENTS.equals(((Mutable) o).message)) {
                viewModel.getClientsAdapter().lastSelected = -1;
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), getString(R.string.add_new_client), AddClientFragment.class.getName(), null);
            } else if (Constants.DELETE_CLIENT.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getClientsAdapter().getClientsList().remove(viewModel.getClientsAdapter().lastSelected);
                viewModel.getClientsAdapter().notifyItemRangeChanged(viewModel.getClientsAdapter().lastSelected, viewModel.getClientsAdapter().getItemCount());
                deleteDialog.dismiss();
            }
        });
        baseActivity().getRefreshingLiveData().observe(((LifecycleOwner) context), aBoolean -> {
            viewModel.clients();
            ((BaseActivity) context).stopRefresh(false);
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
        binding.optionDone.setOnClickListener(v -> viewModel.deleteClient());
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
        viewModel.getClientsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
